{
    "xdsVersion": "2.2.2",
    "frameworkVersion": "ext42",
    "internals": {
        "type": "Ext.window.Window",
        "reference": {
            "name": "items",
            "type": "array"
        },
        "codeClass": null,
        "userConfig": {
            "height": null,
            "width": 400,
            "designer|userClassName": "Dialog",
            "closeAction": "hide",
            "title": "My Dialog",
            "modal": true
        },
        "configAlternates": {
            "bussyMask": "object"
        },
        "customConfigs": [
            {
                "group": "(Custom Properties)",
                "name": "bussyMask",
                "type": "string"
            }
        ],
        "cn": [
            {
                "type": "basicfunction",
                "reference": {
                    "name": "items",
                    "type": "array"
                },
                "codeClass": null,
                "userConfig": {
                    "fn": "bussy",
                    "designer|params": [
                        "msg"
                    ],
                    "implHandler": [
                        "var me = this, bussy;",
                        "",
                        "if (!me.bussyMask) {",
                        "    me.bussyMask = new Ext.LoadMask({",
                        "        msg: \"Processing...\",",
                        "        target: me",
                        "    });",
                        "}",
                        "",
                        "if (msg == undefined || msg === true) {",
                        "    bussy = true;",
                        "}",
                        "else if (!msg) {",
                        "    bussy = false;",
                        "}",
                        "else {",
                        "    me.bussyMask.msg = msg;",
                        "    bussy = true;",
                        "}",
                        "",
                        "if (bussy) {",
                        "    me.bussyMask.show();",
                        "}",
                        "else {",
                        "    me.bussyMask.hide();",
                        "}",
                        "",
                        "return bussy;"
                    ]
                }
            }
        ]
    },
    "linkedNodes": {},
    "boundStores": {},
    "boundModels": {}
}