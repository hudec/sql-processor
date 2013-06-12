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

        form.mask("Processing...");

        // Update person
        simpleService.updatePerson(form.getInputForm(), function(result) {
            form.unmask();

            if (result.success) {
                form.getForm().reset();
                me.close();

                // Person select
                var view = Ext.getCmp("person-select");
                view.reload();

                // Person detail
                if (result.id) {
                    var page = Ext.getCmp("page");
                    page.reloadPersonDetail(result.id);
                }
            }
            else {
                form.getForm().markInvalid(result.errors);
            }
        });
    }
});
