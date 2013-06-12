Ext.define("Simplereg.store.override.People", {
    override: "Simplereg.store.People",

    /**
     * Fit store page in record range
     */
    fitin: function(store, records, successful, eOpts) {
        if (store.currentPage > 1 && !records.length) {
            store.previousPage();
        }
    }
});
