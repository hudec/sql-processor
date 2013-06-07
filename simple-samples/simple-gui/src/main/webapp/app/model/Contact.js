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
        name : "stateCode",
        type : "string"
    } ],
    associations : [ {
        type : "belongsTo",
        model : "SimpleWeb.model.Person",
        associationKey : "person",
        foreignKey : "person_id",
        setterName : "setPerson",
        getterName : "getPerson"
    }, {
        type : "belongsTo",
        model : "org.sample.model.State",
        associationKey : "state",
        foreignKey : "stateCode",
        setterName : "setState",
        getterName : "getState"
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