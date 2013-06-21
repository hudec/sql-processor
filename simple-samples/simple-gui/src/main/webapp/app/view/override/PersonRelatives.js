Ext.define("Simplereg.view.override.PersonRelatives", {
    override: "Simplereg.view.PersonRelatives",

    /**
     * Refresh person relatives
     */
    reload: function() {
        var me = this, store = me.store;
        store.reload();
    }
});
