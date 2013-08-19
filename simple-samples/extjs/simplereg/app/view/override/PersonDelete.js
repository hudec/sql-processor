Ext.define("Simplereg.view.override.PersonDelete", {
    override : "Simplereg.view.PersonDelete",

    /**
     * Handle dialog submit (delete person)
     */
    submit : function() {
        var me = this, form = me.down("form");

        if (!form.isValid()) {
            return false;
        }

        me.loadMask.show();

        // Delete person
        personWeb.deletePerson(form.getPlainForm(), function(result) {
            me.loadMask.hide();

            if (result.success) {
                me.close();

                // Person select...
                var view = Ext.getCmp("person-select");
                view.reload();

                // Close person detail
                if (result.id) {
                    var page = Ext.getCmp("page");
                    page.closePersonDetail(result.id);
                }
            } else {
                form.getForm().markInvalid(result.errors);
            }
        });
    }
});
