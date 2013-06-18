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

        form.mask("Processing...");

        // Create new person
        simpleService.createPerson(form.getInputForm(), function(result) {
            form.unmask();

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
            }
            else {
                form.getForm().markInvalid(result.errors);
            }
        });
    }
});
