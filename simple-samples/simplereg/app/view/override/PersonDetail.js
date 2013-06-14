Ext.define("Simplereg.view.override.PersonDetail", {
    override: "Simplereg.view.PersonDetail",

    init: function(id, record) {
        var me = this, ident = "person" + id + "-detail";

        // Person detail
        me.itemId = ident;

        // Complex person store
        me.store = Ext.create("Simplereg.store.People", {
            storeId: me.id + "-detail"
        });

        me.store.proxy.extraParams = {
            contacts: true,
            id: id
        };

        // Person contacts
        var contacts = me.down("#contacts");

        contacts.bindStore(Ext.create("Simplereg.store.Contacts", {
            storeId: me.id + "-contacts"
        }));

        contacts.store.proxy.extraParams = {
            personId: id
        };

        contacts.down("pagingtoolbar").bindStore(contacts.store);

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
            me.mask("Loading...");
        }

        // Load complex person data
        me.store.load({
            callback: function(records, operation, success) {
                if (success) {
                    if (records.length) {
                        me.fill(records[0]);
                    }
                }
                me.unmask();
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
        var text = [], title;
        text.push(record.data.firstName + " " + record.data.lastName);
        if (record.data.ssn) {
            text.push(record.data.ssn);
        }
        title = text.join(" | ");

        me.setTitle(title);

        // Personal data
        me.down("#data").loadRecord(record);

        // Person contacts
        var contacts = me.down("#contacts"), store = contacts.store,
                items = record.contacts().data.items;

        store.loadData(store.pageSize ? items.slice(0, store.pageSize) : items);

        // Correct...
//TODO: total count (from response)
        store.totalCount = items.length;
        contacts.down("pagingtoolbar").onLoad();
    }
});
