Ext.define('SimpleWeb.store.People', {
    extend : 'Ext.data.Store',
    model : 'SimpleWeb.model.Person',
    alias : 'widget.personstore',
    autoLoad : true,
    remoteSort : true,
    remoteFilter : true,
    pageSize : 30,
    autoSync : true,
    sorters : [ {
        property : 'lastName',
        direction : 'ASC'
    } ]
/*
 * listeners : { load : function(store) { store.each(function(record) { record.commit(); }); } }
 */
});
