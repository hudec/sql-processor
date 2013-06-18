Ext.define("Simplereg.view.override.PersonSearch", {
    override: "Simplereg.view.PersonSearch",

    /**
     * Handle dialog submit
     * (search person)
     */
    submit: function() {
        var me = this, form = me.down("form");

        if (!form.isValid()) {
            return false;
        }

        //form.mask("Processing...");
        me.close();

        // Person select search
        var params = form.getValues();
        Ext.getCmp("person-select").search(params);
    }
});
