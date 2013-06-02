Ext.define("SimpleWeb.model.Contact", {
    extend : "Ext.data.Model",
    fields : [ {
        name : "id",
        type : "int"
    }, {
        name : "ctype",
        type : "string"
    }, {
        name : "address",
        type : "string"
    }, {
        name : "phoneNumber",
        type : "string"
    }, {
        name : "version",
        type : "int"
    }, {
        name : "personId",
        type : "int"
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
        field : "ctype"
    }, {
        type : "presence",
        field : "address"
    }, {
        type : "presence",
        field : "version"
    } ],
    proxy : {
        type : "direct",
        api : {
            read : simpleService.loadContacts,
            create : simpleService.createContacts,
            update : simpleService.updateContacts,
            destroy : simpleService.deleteContacts
        },
        reader : {
            root : "records"
        }
    }
});