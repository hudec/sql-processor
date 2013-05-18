Ext.define('SimpleWeb.store.Contacts', {
    extend: 'Ext.data.Store',
    model: 'SimpleWeb.model.Contact',
    autoLoad: true,
    remoteSort: true,
    pageSize : 30,
    autoSync : true,
    sorters: [ {
        property: 'address',
        direction: 'ASC'
    }]
});
