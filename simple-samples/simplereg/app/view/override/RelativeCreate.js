Ext.define("Simplereg.view.override.RelativeCreate", {
    override: "Simplereg.view.RelativeCreate",

    /**
     * Handle dialog submit
     * (create relative)
     */
    submit: function() {
        var me = this, form = me.down("form");

        if (!form.isValid()) {
            return false;
        }

        me.loadMask.show();

        var id = form.getForm().findField("personId").getValue();

        // Create relative
        simpleService.createRelative(form.getPlainForm(), function(result) {
            me.loadMask.hide();

            if (result.success) {
                form.getForm().reset();
                me.close();

                // Person select
                var view = Ext.getCmp("person-select");
                view.reload();

                // Person detail
                if (id) {
                    var page = Ext.getCmp("page");
                    page.reloadPersonDetail(id);
                }
            }
            else {
                form.getForm().markInvalid(result.errors);
            }
        });
    }
});
