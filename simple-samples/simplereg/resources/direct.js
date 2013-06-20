(function(window, Ext, undefined) {
    var url, request = Ext.urlDecode(window.location.search);

    if (request.url) {
        url = request.url;
    }
    else if (request.remote != undefined) {
        url = "http://simple-backend.cloudfoundry.com/api-debug-doc.js?fullRouterUrl=true";
    }
    else if (true || request.local != undefined) { //default
        url = "http://localhost:8080/simple-backend/api-debug-doc.js?fullRouterUrl=true";
    }

    console.info(url);

    // Enable caching (ommit _dc parameter)
    var disableCaching = Ext.Loader.getConfig().disableCaching;
    Ext.Loader.setConfig({
        disableCaching: false
    });

    Ext.Loader.loadScript({
        url: url,
        onLoad: function() {
            try {
                Ext.require("Ext.direct.*", function() {
                    Ext.direct.Manager.addProvider(Ext.app.REMOTING_API);
                    Ext.direct.Manager.on("exception", function(exception) {
                        console.error(exception.message);
                        Ext.Msg.alert("Error", exception.message);
                    });
                });
            }
            catch (error) {
                console.error(error);
            }
        },
        onError: function(error) {
            console.error(error);
        }
    });

    // Restore configuration
    Ext.Loader.setConfig({
        disableCaching: disableCaching
    });

})(window, Ext);
