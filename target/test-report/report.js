$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("android/cucumber/appium/features/FirstScenarios.feature");
formatter.feature({
  "line": 2,
  "name": "Amazon App works",
  "description": "",
  "id": "amazon-app-works",
  "keyword": "Feature"
});
formatter.before({
  "duration": 18898402119,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Searching in amazon",
  "description": "",
  "id": "amazon-app-works;searching-in-amazon",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "App is open",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I search for \u0027books\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should see results",
  "keyword": "Then "
});
formatter.match({
  "location": "TestSteps.GivenAppIsOpen()"
});
formatter.result({
  "duration": 5943123152,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "books",
      "offset": 14
    }
  ],
  "location": "TestSteps.searchfor(String)"
});
formatter.result({
  "duration": 12096891400,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.searchfor()"
});
formatter.result({
  "duration": 2972114317,
  "status": "passed"
});
formatter.after({
  "duration": 2394512560,
  "status": "passed"
});
});