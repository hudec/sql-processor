Ext.require("Ext.direct.*", function() {
    Ext.direct.Manager.addProvider(Ext.app.REMOTING_API);
    Ext.direct.Manager.on("exception", function(exception) {
        throw new Error(exception.message);
    });
});
