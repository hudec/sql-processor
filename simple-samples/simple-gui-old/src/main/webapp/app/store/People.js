Ext.define('SimpleWeb.store.People', {
    extend : 'Ext.data.Store',
    model : 'SimpleWeb.model.Person',
    alias : 'widget.personstore',
    autoLoad : false,
    remoteSort : true,
    remoteFilter : true,
    pageSize : 5,
    autoSync : false,
    sorters : [ {
        property : 'lastName',
        direction : 'ASC'
    } ],

    listeners : {
        load : function(store) {
            var currentPage = store.currentPage;
            var data = store.data;

            if (currentPage > 1 && data.length == 0) {
                store.previousPage();
            }
        }
    }

});
