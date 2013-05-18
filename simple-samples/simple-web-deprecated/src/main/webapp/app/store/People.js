Ext.define('SimpleWeb.store.People', {
    extend: 'Ext.data.Store',
    model: 'SimpleWeb.model.Person',
    autoLoad: true,
    remoteSort: true,
    pageSize : 30,
    autoSync : true,
    sorters: [ {
        property: 'lastName',
        direction: 'ASC'
    }]
});
