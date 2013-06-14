Ext.define("Simplereg.view.override.Page", {
    override: "Simplereg.view.Page",

    init: function() {
        var me = this;

        // Codebooks...
        var genders = Ext.create("Simplereg.store.Genders", {
            storeId: "genders",
            autoLoad: true
        });

        var contactTypes = Ext.create("Simplereg.store.ContactTypes", {
            storeId: "contactTypes",
            autoLoad: true
        });

        var countries = Ext.create("Simplereg.store.Countries", {
            storeId: "countries",
            autoLoad: true
        });

        // Dialogs...
//TODO: list dialog windows in application (not enaugh?)
        Ext.create("Simplereg.view.PersonSearch");
        Ext.create("Simplereg.view.PersonCreate");
        Ext.create("Simplereg.view.PersonUpdate");
        Ext.create("Simplereg.view.PersonDelete");
        Ext.create("Simplereg.view.ContactCreate");
        Ext.create("Simplereg.view.ContactUpdate")
        Ext.create("Simplereg.view.ContactDelete");

        // Requested...
        //var request = Ext.urlDecode(window.location.search);

        // Keyboard control
        new Ext.KeyMap(document, [
            {
                key: Ext.EventObject.F3,
                fn: function(a, event) {
                    event.stopEvent();
                    Ext.getCmp("person-search").show();
                },
                scope: me
            },
            {
                key: Ext.EventObject.F5,
                fn: function(a, event) {
                    event.stopEvent();
                    this.reload();
                },
                scope: me
            }
        ]);
    },

    /**
     * Reload page (active view)
     */
    reload: function() {
        var me = this, view = Ext.getCmp("pages").getActiveTab();

        if (view && view.reload) {
            view.reload();
        }
    },

    /**
     * Find person detail
     * (by id)
     */
    findPersonDetail: function(id) {
        var pages = Ext.getCmp("pages"),
                ident = "person" + id + "-detail",
                view = pages.child("#" + ident);

        return view;
    },

    /**
     * Reload person detail
     */
    reloadPersonDetail: function(id) {
        var view = this.findPersonDetail(id);

        if (view) {
            view.reload();
        }
    },

    /**
     * Open person detail (new page item)
     */
    openPersonDetail: function(id, record) {
        var view = this.findPersonDetail(id),
                pages = Ext.getCmp("pages");

        // New person detail
        if (!view) {
            view = Ext.create("Simplereg.view.PersonDetail");
            view.init(id, record);
            pages.add(view);
            pages.setActiveTab(view);
        }

        // Existing...
        else {
            pages.setActiveTab(view);
        }
    },

    /**
     * Close person detail
     */
    closePersonDetail: function(id) {
        var view = this.findPersonDetail(id),
                pages = Ext.getCmp("pages");

        if (view) {
            pages.remove(view);
        }
    },

});
