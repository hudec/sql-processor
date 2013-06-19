Ext.define("Simplereg.view.override.PersonContacts", {
    override: "Simplereg.view.PersonContacts",

    /**
     * Refresh person contacts
     */
    reload: function() {
        var me = this, store = me.store;
        store.reload();
    }
});
