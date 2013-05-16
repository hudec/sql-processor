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
    type : "date"
  }, {
    name : "ssn",
    type : "string"
  }, {
    name : "gender",
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
  }, {
    type : "inclusion",
    field : "gender",
	list: ['MALE', 'FEMALE', 'UNKNOWN']
  } ]
});
