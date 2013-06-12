Ext.define("Simplereg.view.override.ContactDelete", {
    override: "Simplereg.view.ContactDelete",

    /**
     * Handle dialog submit
     * (delete contact)
     */
    submit: function() {
        var me = this, form = me.down("form"),
                view = Ext.getCmp("pages").getActiveTab();

        if (!form.isValid()) {
            return false;
        }

        form.mask("Processing...");

        // Delete contact
        simpleService.deleteContact(form.getInputForm(), function(result) {
            form.unmask();

            if (result.success) {
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
