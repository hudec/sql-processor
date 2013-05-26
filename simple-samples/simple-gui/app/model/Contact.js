Ext.define("SimpleWeb.model.Contact", {
    extend : "Ext.data.Model",
    fields : [ {
        name : "id",
        type : "int"
    }, {
        name : "type",
        type : "int"
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
    } ]
});