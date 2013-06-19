(function(window, Ext, undefined) {
    var url, request = Ext.urlDecode(window.location.search);

    if (request.url) {
        url = request.url;
    }
    else if (request.remote != undefined) { //default
        url = "http://simple-backend.cloudfoundry.com/api-debug.js";
    }
    else if (true || request.local != undefined) {
        url = "http://localhost:8080/simple-backend/api-debug.js";
    }

    console.info(url);

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

})(window, Ext);
