Ext.define("Simplereg.view.override.ContactUpdate", {
    override: "Simplereg.view.ContactUpdate",
    
    /**
     * Handle dialog submit
     * (update contact)
     */
    submit: function() {
        var me = this, form = me.down("form"),
                view = Ext.getCmp("pages").getActiveTab();

        if (!form.isValid()) {
            return false;
        }

        form.mask("Processing...");

        // Create new contact
        simpleService.updateContact(form.getInputForm(), function(result) {
            form.unmask();

            if (result.success) {
                form.getForm().reset();
                me.close();

                // Contacts
                if (result.personId) {
                    view = Ext.getCmp("page").findPersonDetail(result.personId);
                }

                if (view) {
                    view.down("#contacts").reload();
                }
            }
            else {
                form.getForm().markInvalid(result.errors);
            }
        });
    }
});
