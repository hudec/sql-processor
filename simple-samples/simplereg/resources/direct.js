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
