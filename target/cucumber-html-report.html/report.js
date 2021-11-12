$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/RegisterUser.feature");
formatter.feature({
  "name": "Register new user",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Sing up successfully",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is in the homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "RegisterUserStepDefinitions.theUserIsInTheHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user wants to sing up",
  "keyword": "When "
});
formatter.match({
  "location": "RegisterUserStepDefinitions.theUserWantsToSingUp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate sing up complete",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterUserStepDefinitions.validateSingUpComplete()"
});
formatter.result({
  "status": "passed"
});
});