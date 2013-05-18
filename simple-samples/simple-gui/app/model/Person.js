Ext.define("SimpleWeb.model.Person",
{
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
  } ],
  associations : [ {
    type : "hasMany",
    model : "SimpleWeb.model.Contact",
    associationKey : "contacts",
    foreignKey : "person_id",
    name : "contacts"
  } ],
  validations : [ {
    type : "presence",
    field : "firstName"
  }, {
    type : "presence",
    field : "lastName"
  }, {
    type : "presence",
    field : "gender"
  } ],
  proxy : {
    type : "direct",
    api : {
      read : simpleService.loadPeople,
      create : simpleService.createPerson,
      update : simpleService.updatePerson,
      destroy : simpleService.deletePerson
    },
    reader : {
      root : "records"
    }
  }
});
