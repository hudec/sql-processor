Ext.define('SimpleWeb.store.Contacts', {
    extend : 'Ext.data.Store',
    model : 'SimpleWeb.model.Contact',
    autoLoad : false,
    remoteSort : false,
    pageSize : 30,
    autoSync : true,
});
