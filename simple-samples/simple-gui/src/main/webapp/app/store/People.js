Ext.define('SimpleWeb.store.People', {
    extend : 'Ext.data.Store',
    model : 'SimpleWeb.model.Person',
    alias : 'widget.personstore',
    autoLoad : false,
    remoteSort : true,
    remoteFilter : true,
    pageSize : 5,
    autoSync : true,
    sorters : [ {
        property : 'lastName',
        direction : 'ASC'
    } ]
/*
 * listeners : { load : function(store) { store.each(function(record) { record.commit(); }); } }
 */
});
