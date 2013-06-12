Ext.define("Simplereg.view.override.Page", {
    override: "Simplereg.view.Page",

    init: function() {
        var me = this;

        // Dialogs...
//TODO: list dialog windows in application (not enaugh?)
        Ext.create("Simplereg.view.PersonSearch");
        Ext.create("Simplereg.view.PersonCreate");
        Ext.create("Simplereg.view.PersonUpdate");
        Ext.create("Simplereg.view.PersonDelete");
        Ext.create("Simplereg.view.ContactCreate");
        Ext.create("Simplereg.view.ContactUpdate");
        Ext.create("Simplereg.view.ContactDelete");

        // Requested...
        //var request = Ext.urlDecode(window.location.search);

        // Person select
        var view = Ext.getCmp("person-select");
        view.init();

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
    }
});
