Ext.define("Simplereg.view.override.Page", {
    override: "Simplereg.view.Page",

    init: function() {
        var me = this;

        // Dialogs...
        this.dialogs([
            "Simplereg.view.PersonSearch",
            "Simplereg.view.PersonCreate",
            "Simplereg.view.PersonUpdate",
            "Simplereg.view.PersonDelete",
            "Simplereg.view.RelativeCreate",
            "Simplereg.view.RelativeUpdate",
            "Simplereg.view.RelativeDelete",
            "Simplereg.view.ContactCreate",
            "Simplereg.view.ContactUpdate",
            "Simplereg.view.ContactDelete"
        ]);

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
     * Create application dialogs
     */
    dialogs: function(types) {
        for (var i in types) {
            var dialog = Ext.create(types[i]);
            dialog.loadMask = Ext.create("Ext.LoadMask", {
                autoShow: false,
                msg: "Processing...",
                target: dialog
            });
        }
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
        var pages = Ext.getCmp("pages");
        return pages.child("#person" + id + "-detail");
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

            // Detail tab...
            //pages.add(view);
            var index = pages.items.indexOf(pages.getActiveTab()) + 1;
            pages.insert(index, view);
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
    }
});
