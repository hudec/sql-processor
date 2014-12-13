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

        // Open windows (dialogs)
        me.windows = [];

        // Keyboard control
        new Ext.KeyMap(document, [
            {
                key: Ext.EventObject.F3,
                fn: function(keyCode, event) {
                    event.stopEvent();
                    var window = this.getWindow();
                    if (!window || window == Ext.getCmp("relative-create")) {
                        Ext.getCmp("person-search").show();
                    }
                },
                scope: me
            },
            {
                key: Ext.EventObject.F5,
                fn: function(keyCode, event) {
                    event.stopEvent();
                    if (!this.getWindow()) {
                        this.reload();
                    }
                },
                scope: me
            }
        ]);
    },

    /**
     * Get last opened window (dialog)
     */
    getWindow: function(selector) {
        var window = this.windows[this.windows.length - 1];
        return window && selector ? window.is(selector) : window;
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
    },

    /**
     * Close tab...
     */
    closeActive: function() {
        var pages = Ext.getCmp("pages"),
                view = pages.getActiveTab();
        if (view.is("persondetail")) {
            pages.remove(view);
        }
    },

    closeAll: function(active) {
        var pages = Ext.getCmp("pages"), items = pages.items.getRange(),
                view = pages.getActiveTab();
        for (var i in items) {
            if (items[i].is("persondetail")) {
                if (active || view != items[i]) {
                    pages.remove(items[i]);
                }
            }
        }
    }
});
