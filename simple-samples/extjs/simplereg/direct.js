Ext.ns('Ext.app');

Ext.app.REMOTING_API = {
  "url" : "http://simple-backend.cfapps.io/router",
  "type" : "remoting",
  "actions" : {
    "authWeb" : [ {
      "name" : "loadAuthRoles",
      "len" : 1
    }, {
      "name" : "createUserRole",
      "len" : 0,
      "formHandler" : true
    }, {
      "name" : "loadAuthUsers",
      "len" : 1
    }, {
      "name" : "deleteUserRole",
      "len" : 0,
      "formHandler" : true
    }, {
      "name" : "createAuthRole",
      "len" : 0,
      "formHandler" : true
    }, {
      "name" : "createAuthUser",
      "len" : 0,
      "formHandler" : true
    }, {
      "name" : "updateAuthUser",
      "len" : 0,
      "formHandler" : true
    }, {
      "name" : "deleteAuthRole",
      "len" : 0,
      "formHandler" : true
    }, {
      "name" : "updateAuthRole",
      "len" : 0,
      "formHandler" : true
    }, {
      "name" : "loadUserRoles",
      "len" : 1
    }, {
      "name" : "deleteAuthUser",
      "len" : 0,
      "formHandler" : true
    }, {
      "name" : "updateUserRole",
      "len" : 0,
      "formHandler" : true
    } ],
    "personWeb" : [ {
      "name" : "updateRelative",
      "len" : 0,
      "formHandler" : true
    }, {
      "name" : "createContact",
      "len" : 0,
      "formHandler" : true
    }, {
      "name" : "loadContacts",
      "len" : 1
    }, {
      "name" : "loadCountries",
      "len" : 1
    }, {
      "name" : "createPerson",
      "len" : 0,
      "formHandler" : true
    }, {
      "name" : "updatePerson",
      "len" : 0,
      "formHandler" : true
    }, {
      "name" : "createRelative",
      "len" : 0,
      "formHandler" : true
    }, {
      "name" : "loadPeople",
      "len" : 1
    }, {
      "name" : "deleteRelative",
      "len" : 0,
      "formHandler" : true
    }, {
      "name" : "deleteContact",
      "len" : 0,
      "formHandler" : true
    }, {
      "name" : "updateContact",
      "len" : 0,
      "formHandler" : true
    }, {
      "name" : "deletePerson",
      "len" : 0,
      "formHandler" : true
    }, {
      "name" : "loadRelatives",
      "len" : 1
    } ]
  }
};

try {
    Ext.require("Ext.direct.*", function() {
        Ext.direct.Manager.addProvider(Ext.app.REMOTING_API);
        Ext.direct.Manager.on("exception", function(exception) {
            console.error(exception.message);
            Ext.Msg.alert("Error", exception.message);
        });
    });
}
catch (error) {
    console.error(error);
}

