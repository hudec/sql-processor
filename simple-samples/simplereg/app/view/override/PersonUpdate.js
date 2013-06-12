Ext.define("Simplereg.view.override.PersonUpdate", {
    override: "Simplereg.view.PersonUpdate",
    
    /**
     * Handle dialog submit
     * (update person)
     */
    submit: function() {
        var me = this, form = me.down("form");

        if (!form.isValid()) {
            return false;
        }

        me.mask("Processing...");

        // Create new person
        simpleService.updatePerson(form.getInputForm(), function(result) {
            me.unmask();

            if (result.success) {
                form.getForm().reset();
                me.close();

                Ext.getCmp("page").reload();
            }
            else {
                form.getForm().markInvalid(result.errors);
            }
        });
    }
});
