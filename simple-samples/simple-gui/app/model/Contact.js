Ext.define("SimpleWeb.model.Contact", {
    extend : "Ext.data.Model",
    fields : [ {
        name : "id",
        type : "int"
    }, {
        name : "type",
        type : "string"
    }, {
        name : "address",
        type : "string"
    }, {
        name : "phoneNumber",
        type : "string"
    } ],
    associations : [ {
        type : "belongsTo",
        model : "SimpleWeb.model.Person",
        associationKey : "person",
        foreignKey : "person_id",
        setterName : "setPerson",
        getterName : "getPerson"
    } ],
    validations : [ {
        type : "presence",
        field : "type"
    }, {
        type : "presence",
        field : "address"
    } ],
    proxy : {
        type : "direct",
        api : {
            read : simpleService.loadContacts,
            create : simpleService.createContact,
            update : simpleService.updateContact,
            destroy : simpleService.deleteContact
        },
        reader : {
            root : "records"
        }
    }
});