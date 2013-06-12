Ext.define("Simplereg.view.override.PersonCreate", {
    override: "Simplereg.view.PersonCreate",

    /**
     * Handle dialog submit
     * (create person)
     */
    submit: function() {
        var me = this, form = me.down("form");

        if (!form.isValid()) {
            return false;
        }

        me.mask("Processing...");

        // Create new person
        simpleService.createPerson(form.getInputForm(), function(result) {
            me.unmask();

            if (result.success) {
                form.getForm().reset();
                me.close();

//TODO: open new person detail
                Ext.getCmp("page").reload();
            }
            else {
                form.getForm().markInvalid(result.errors);
            }
        });
    }
});
