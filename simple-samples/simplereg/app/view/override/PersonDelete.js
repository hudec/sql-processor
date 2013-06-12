Ext.define("Simplereg.view.override.PersonDelete", {
    override: "Simplereg.view.PersonDelete",

    /**
     * Handle dialog submit
     * (delete person)
     */
    submit: function() {
        var me = this, form = me.down("form");

        if (!form.isValid()) {
            return false;
        }

        me.mask("Processing...");

        // Create new person
        simpleService.deletePerson(form.getInputForm(), function(result) {
            me.unmask();

            if (result.success) {
                me.close();
            }
            else {
                form.getForm().markInvalid(result.errors);
            }
        });
    }
});
