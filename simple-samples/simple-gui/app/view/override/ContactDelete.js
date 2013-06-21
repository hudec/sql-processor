Ext.define("Simplereg.view.override.ContactDelete", {
    override: "Simplereg.view.ContactDelete",
//TODO: render country name (code)

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

        me.loadMask.show();

        // Delete contact
        simpleService.deleteContact(form.getPlainForm(), function(result) {
            me.loadMask.hide();

            if (result.success) {
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
