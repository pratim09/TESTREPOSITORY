$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Newinstallorder.feature");
formatter.feature({
  "line": 2,
  "name": "Create a new install order with offnet UNI and verify the NMI Local Access type and Build out option",
  "description": "",
  "id": "create-a-new-install-order-with-offnet-uni-and-verify-the-nmi-local-access-type-and-build-out-option",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Check the offnet feature for NMI Local access type and Build out option",
  "description": "",
  "id": "create-a-new-install-order-with-offnet-uni-and-verify-the-nmi-local-access-type-and-build-out-option;check-the-offnet-feature-for-nmi-local-access-type-and-build-out-option",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "As a UWS user open the application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "enters \"\u003cusername\u003e\" as username",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "enters \"\u003cpassword\u003e\" as password",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "submit it",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter the \"\u003ccustname\u003e\" as customername and search by customer name",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Navigates to the customer overview page",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "create new order",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Navigate to the order quoting page",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I add the  customeraccountid and productaccounts",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "Add ParamataID as contracts",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Add Locations as GetExisitngLocations from the list",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Add Contact as GetExistingContacts",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Add Party roles for the locations for the added contact",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Under Products/Services configure CE services",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Add Offnet Uni for the selected locations",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "verify the NMI Local Access type",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "also verify the buildout option for added UNI",
  "keyword": "And "
});
formatter.examples({
  "line": 24,
  "name": "",
  "description": "",
  "id": "create-a-new-install-order-with-offnet-uni-and-verify-the-nmi-local-access-type-and-build-out-option;check-the-offnet-feature-for-nmi-local-access-type-and-build-out-option;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "custname"
      ],
      "line": 25,
      "id": "create-a-new-install-order-with-offnet-uni-and-verify-the-nmi-local-access-type-and-build-out-option;check-the-offnet-feature-for-nmi-local-access-type-and-build-out-option;;1"
    },
    {
      "cells": [
        "slstst1",
        "Link1234",
        "AAA of Arizona"
      ],
      "line": 26,
      "id": "create-a-new-install-order-with-offnet-uni-and-verify-the-nmi-local-access-type-and-build-out-option;check-the-offnet-feature-for-nmi-local-access-type-and-build-out-option;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 26,
  "name": "Check the offnet feature for NMI Local access type and Build out option",
  "description": "",
  "id": "create-a-new-install-order-with-offnet-uni-and-verify-the-nmi-local-access-type-and-build-out-option;check-the-offnet-feature-for-nmi-local-access-type-and-build-out-option;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "As a UWS user open the application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "enters \"slstst1\" as username",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "enters \"Link1234\" as password",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "submit it",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter the \"AAA of Arizona\" as customername and search by customer name",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Navigates to the customer overview page",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "create new order",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Navigate to the order quoting page",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I add the  customeraccountid and productaccounts",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "Add ParamataID as contracts",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Add Locations as GetExisitngLocations from the list",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Add Contact as GetExistingContacts",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Add Party roles for the locations for the added contact",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Under Products/Services configure CE services",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Add Offnet Uni for the selected locations",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "verify the NMI Local Access type",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "also verify the buildout option for added UNI",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});