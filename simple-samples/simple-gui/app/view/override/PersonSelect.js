Ext.define("Simplereg.view.override.PersonSelect", {
    override: "Simplereg.view.PersonSelect",

    init: function() {
        var me = this;

        // Person list
        var grid = me.down("#people");

        grid.bindStore(Ext.create("Simplereg.store.People", {
            storeId: "person-select"
        }));

        grid.down("pagingtoolbar").bindStore(grid.store);
    },

    /**
     * Reload person select
     */
    reload: function(config) {
        var me = this, store = me.down("#people").store;

        if (me.isVisible()) {
            me.mask("Loading...");
        }

        // From beginning
        if (config === true) {
            config = { page: 1, start: 0 };
            store.currentPage = 1;
        }

        // Load person select list
        store.load(Ext.apply({
            callback: function(records, operation, success) {
                me.unmask();

                if (success) {
                    me.down("grid").down("pagingtoolbar").onLoad();
                    if (records.length) {
                        ;
                    }
                }
            }
        }, config));
    },

    /**
     * Search people
     */
    search: function(params) {
        var me = this, store = me.down("#people").store;

        // Person selection
        Ext.getCmp("pages").setActiveTab(me);

        // Search parameters
        store.proxy.extraParams = params;

        // Reload from beginning
        me.reload(true);
    }
});
