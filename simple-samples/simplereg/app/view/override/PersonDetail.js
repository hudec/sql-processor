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
        var relatives = me.down("#relatives");

        relatives.bindStore(Ext.create("Simplereg.store.RelativePeople", {
            storeId: me.id + "Relatives"
        }));

//TODO: unlimited...
        relatives.store.proxy.extraParams = {
            personId: id
        };

        // Person contacts
        var contacts = me.down("#contacts");

        contacts.bindStore(Ext.create("Simplereg.store.Contacts", {
            storeId: me.id + "Contacts"
        }));

        contacts.store.proxy.extraParams = {
            personId: id
        };

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
        me.setTitle(Simplereg.getPersonTitle(record));

        // Personal data
        me.down("#data").loadRecord(record);

        // Person relatives
        var relatives = me.down("#relatives"), store = relatives.store,
                items = record.relatives().data.items;

        if (store.pageSize) {
            items =  items.slice(0, store.pageSize);
        }

        store.on("load", function() {
            relatives.getSelectionModel().deselectAll();
        });

        //store.loadData(items);
        store.reload();

        // Person contacts
        var contacts = me.down("#contacts"), store = contacts.store,
                items = record.contacts().data.items;

        if (store.pageSize) {
            items =  items.slice(0, store.pageSize);
        }

        store.on("load", function() {
            contacts.getSelectionModel().deselectAll();
        });

        store.loadData(items);
    }
});
