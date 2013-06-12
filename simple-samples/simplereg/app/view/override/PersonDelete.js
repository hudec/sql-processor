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

        form.mask("Processing...");

        // Delete person
        simpleService.deletePerson(form.getInputForm(), function(result) {
            form.unmask();

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
            }
            else {
                form.getForm().markInvalid(result.errors);
            }
        });
    }
});
