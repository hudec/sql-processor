Ext.define("Simplereg.view.override.PersonCreate", {
    override : "Simplereg.view.PersonCreate",

    /**
     * Handle dialog submit (create person)
     */
    submit : function() {
        var me = this, form = me.down("form");

        if (!form.isValid()) {
            return false;
        }

        me.loadMask.show();

        // Create new person
        personWeb.createPerson(form.getPlainForm(), function(result) {
            me.loadMask.hide();

            if (result.success) {
                form.getForm().reset();
                me.close();

                // Person select...
                var view = Ext.getCmp("person-select");
                view.reload();

                // Open new person detail
                if (result.id) {
                    var page = Ext.getCmp("page");
                    page.openPersonDetail(result.id);
                }
            } else {
                form.getForm().markInvalid(result.errors);
            }
        });
    }
});
