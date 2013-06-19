Ext.define("Simplereg.view.override.PersonSelect", {
    override: "Simplereg.view.PersonSelect",

    init: function() {
        var me = this;

        me.loadMask = Ext.create("Ext.LoadMask", {
            autoShow: false,
            msg: "Loading...",
            target: me
        });

        // Person select
        me.id = "PersonSelect";
        me.itemId = "person-select";

        // Person list
    },

    /**
     * Reload person select
     */
    reload: function(config) {
        var me = this, store = me.down("#people").store;

//TODO: disable grid loading mask
        //me.loadMask.show();
        me.mask();

        // From beginning
        if (config === true) {
            config = { page: 1, start: 0 };
            store.currentPage = 1;
        }

        // Load person select list
        store.load(Ext.apply({
            callback: function(records, operation, success) {
                if (success) {
                    me.down("grid").down("pagingtoolbar").onLoad();
                }
                //me.loadMask.hide();
                me.unmask();
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
