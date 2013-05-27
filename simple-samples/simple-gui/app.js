Ext.Loader.setConfig({
    enabled : true
});

Ext.require('Ext.direct.*', function() {
    Ext.direct.Manager.addProvider(Ext.app.REMOTING_API);
});

Ext.application({
    name : 'SimpleWeb',
    appFolder : "app",
    controllers : [ 'Person' ],
    autoCreateViewport : true
});
