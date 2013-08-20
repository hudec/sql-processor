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

        me.loadMask.show();

        // Create new contact
        personWeb.updateContact(form.getPlainForm(), function(result) {
            me.loadMask.hide();

            if (result.success) {
                form.getForm().reset();
                me.close();

                // Person contacts
                if (result.personId) {
                    view = Ext.getCmp("page").findPersonDetail(result.personId);
                    if (view) {
                        view.down("#contacts").reload();
                    }
                }
            }
            else {
                form.getForm().markInvalid(result.errors);
            }
        });
    }
});
