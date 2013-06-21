Ext.define("Simplereg.view.override.PersonDetail", {
    override: "Simplereg.view.PersonDetail",

    init: function(id, record) {
        var me = this;

        me.loadMask = Ext.create("Ext.LoadMask", {
            autoShow: false,
            msg: "Loading...",
            target: me
        });

        // Person detail
        me.id = "Person" + id + "Detail";
        me.itemId = "person" + id + "-detail";

        // Complex person store
        me.store = Ext.create("Simplereg.store.People", {
            storeId: me.id
        });

        me.store.proxy.extraParams = {
            relatives: true,
            contacts: true,
            id: id
        };

        // Person relatives
        this.initPanel(me.down("#relatives"), "Relatives", id, me.id + "Relatives");

        // Person contacts
        this.initPanel(me.down("#contacts"), "Contacts", id, me.id + "Contacts");

        // Fill...
        if (record) {
            me.fill(record);
        }
    },

    /**
     * Reload person detail
     */
    reload: function() {
        var me = this;

        if (me.isVisible()) {
            //me.mask("Loading...");
        }
        me.loadMask.show();

        // Load complex person data
        me.store.load({
            callback: function(records, operation, success) {
                if (success) {
                    if (records.length) {
                        me.fill(records[0]);
                    }
                }
                //me.unmask();
                me.loadMask.hide();
            }
        });
    },

    /**
     * Fill person detail content
     * @param record person data source
     */
    fill: function(record) {
        var me = this;

        // Store...
        me.record = record;

        // Title
        var title = Simplereg.getPersonTitle(record);
        me.down("#data").setTitle(title);
        me.setTitle(title);

        // Personal data
        me.down("#data").loadRecord(record);

        // Person relatives
        this.fillPanel(me.down("#relatives"), record.relatives());

        // Person contacts
        this.fillPanel(me.down("#contacts"), record.contacts());
    },

    /**
     * Prepare grid (store)
     */
    initPanel: function(grid, name, id, storeId) {
        var store = Ext.create("Simplereg.store." + name, {
            storeId: storeId
        });

        store.proxy.extraParams = {
            personId: id
        };

        store.on("load", function() {
            grid.getSelectionModel().deselectAll();
        });

        grid.bindStore(store);
    },

    /**
     * Load data into grid (store)
     */
    fillPanel: function(grid, source) {
        var store = grid.store, items = source.data.items;

        if (store.pageSize) {
            items =  items.slice(0, store.pageSize);
        }

        store.loadData(items);

        store.fireEvent("load", store, items, true);
    }
});
