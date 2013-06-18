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
    }, {
        name : "countryCode",
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
        field : "ctype"
    }, {
        type : "notBlank",
        field : "address"
    }, {
        type : "presence",
        field : "version"
    } ],
    proxy : {
        type : "direct",
        directFn : simpleService.loadContacts,
        reader : {
            root : "records"
        }
    }
});