$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Sample.feature");
formatter.feature({
  "name": "Validating login function of facebook application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Validating login function wit all combinations",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on Facebook application",
  "keyword": "Given "
});
formatter.step({
  "name": "user is going enter \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user sould click login button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "abcdef",
        "fjbjsfjs"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validating login function wit all combinations",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on Facebook application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_is_on_Facebook_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is going enter \"abcdef\" and \"fjbjsfjs\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_is_going_enter_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user sould click login button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.uh()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Validating login function wit all combinations",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on Facebook application",
  "keyword": "Given "
});
formatter.step({
  "name": "user is going enter \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user sould click login button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "abcdef",
        "fjbjsfjs"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validating login function wit all combinations",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on Facebook application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_is_on_Facebook_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is going enter \"abcdef\" and \"fjbjsfjs\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_is_going_enter_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user sould click login button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.uh()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});