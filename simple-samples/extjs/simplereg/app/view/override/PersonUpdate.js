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

        me.loadMask.show();

        // Update person
        personWeb.updatePerson(form.getPlainForm(), function(result) {
            me.loadMask.hide();

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
