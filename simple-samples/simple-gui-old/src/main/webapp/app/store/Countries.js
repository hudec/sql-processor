Ext.define('SimpleWeb.store.Countries', {
    extend : 'Ext.data.Store',
    model : 'SimpleWeb.model.Country',
    autoLoad : false,
    remoteSort : false,
    pageSize : 30,
    autoSync : false,
});
