Ext.define("SimpleWeb.model.Person", {
    extend : "Ext.data.Model",
    fields : [ {
        name : "id",
        type : "int"
    }, {
        name : "firstName",
        type : "string"
    }, {
        name : "lastName",
        type : "string"
    }, {
        name : "dateOfBirth",
        type : "date",
        dateFormat : "d.m.Y"
    }, {
        name : "gender",
        type : "string"
    }, {
        name : "ssn",
        type : "string"
    }, {
        name : "version",
        type : "int"
    } ],
    associations : [ {
        type : "hasMany",
        model : "SimpleWeb.model.Contact",
        associationKey : "contacts",
        foreignKey : "person_id",
        name : "contacts"
    } ],
    validations : [ {
        type : "notBlank",
        field : "firstName"
    }, {
        type : "notBlank",
        field : "lastName"
    }, {
        type : "past",
        field : "dateOfBirth"
    }, {
        type : "presence",
        field : "gender"
    }, {
        type : "presence",
        field : "version"
    } ],
    proxy : {
        type : "direct",
        api : {
            read : simpleService.loadPeople,
            create : simpleService.createPeople,
            update : simpleService.updatePeople,
            destroy : simpleService.deletePeople
        },
        reader : {
            root : "records"
        }
    }
});