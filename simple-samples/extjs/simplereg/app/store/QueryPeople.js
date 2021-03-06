/*
 * File: app/store/QueryPeople.js
 *
 * This file was generated by Sencha Architect version 2.2.2.
 * http://www.sencha.com/products/architect/
 *
 * This file requires use of the Ext JS 4.2.x library, under independent license.
 * License of Sencha Architect does not include license for Ext JS 4.2.x. For more
 * details see http://www.sencha.com/license or contact license@sencha.com.
 *
 * This file will be auto-generated each and everytime you save your project.
 *
 * Do NOT hand edit this file.
 */

Ext.define('Simplereg.store.QueryPeople', {
    extend: 'Ext.data.Store',

    requires: [
        'Simplereg.model.Person'
    ],

    constructor: function(cfg) {
        var me = this;
        cfg = cfg || {};
        me.callParent([Ext.apply({
            autoLoad: true,
            model: 'Simplereg.model.Person',
            remoteFilter: true,
            storeId: 'QueryPeople',
            pageSize: 5,
            proxy: {
                type: 'direct',
                api: { read: "personWeb.loadPeople" },
                reader: {
                    type: 'json',
                    root: 'records'
                }
            },
            sorters: {
                property: 'lastName'
            }
        }, cfg)]);
    }
});