Ext.Loader.setConfig({
	enabled : true
});

Ext.require('Ext.direct.*', function() {
	Ext.direct.Manager.addProvider(Ext.app.REMOTING_API);
});

//Ext.onReady(function() {
//        Ext.getBody().addCls(Ext.baseCSSPrefix + 'theme-gray');
//});

Ext.application({
	name : 'SimpleWeb',
	appFolder : "app",
	controllers : [ 'People' ],
	autoCreateViewport : true
});
