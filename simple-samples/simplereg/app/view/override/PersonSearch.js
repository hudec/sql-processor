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

        //dialog.loadMask...
        me.close();

        var params = form.getValues(),
                window = Ext.getCmp("page").getWindow();

        // Search new relative
        if (window == Ext.getCmp("relative-create")) {
            window.search(params);
        }

        // Person select search
        else {
            Ext.getCmp("person-select").search(params);
        }
    }
});
