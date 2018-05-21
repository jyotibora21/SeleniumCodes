$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("featurefile.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#@selenium"
    }
  ],
  "line": 2,
  "name": "Login Functionality",
  "description": "",
  "id": "login-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6296655905,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Create Login Function",
  "description": "",
  "id": "login-functionality;create-login-function",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Enter Username and Password",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Login Successfully",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 6,
      "value": "#Then Take Login Screenshot"
    },
    {
      "line": 7,
      "value": "#Given Create a Deal"
    },
    {
      "line": 8,
      "value": "#Given Create a Product"
    },
    {
      "line": 9,
      "value": "#|Name|Inventory Amount|"
    },
    {
      "line": 10,
      "value": "#|Jyoti|abc|"
    },
    {
      "line": 11,
      "value": "#|Jasmine|abc|"
    },
    {
      "line": 13,
      "value": "#Given Create a Document Enter \u003c\"Title_Name\"\u003e and\u003c\"Description\"\u003e"
    },
    {
      "line": 15,
      "value": "#Given Create a Task"
    }
  ],
  "line": 16,
  "name": "Task are Fetched from Excel \"C:\\Users\\boraajyo\\Documents\\Wkspc\\WebDriverTestCucumber\\target\\ExcelFile\\NewTask.xlsx\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.enter_Username_and_Password()"
});
formatter.result({
  "duration": 14682417561,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.login_Successfully()"
});
formatter.embedding("image/png", "embedded0.png");
formatter.result({
  "duration": 15591777562,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "C:\\Users\\boraajyo\\Documents\\Wkspc\\WebDriverTestCucumber\\target\\ExcelFile\\NewTask.xlsx",
      "offset": 29
    }
  ],
  "location": "StepDefinition.task_are_Fetched_from_Excel(DataTable)"
});
formatter.result({
  "duration": 1000100091,
  "error_message": "java.lang.ClassCastException: gherkin.formatter.model.Comment cannot be cast to java.util.List\r\n\tat ExcelDatatoDataTable.ExcelDatatoTable.transform(ExcelDatatoTable.java:36)\r\n\tat ExcelDatatoDataTable.ExcelDatatoTable.transform(ExcelDatatoTable.java:1)\r\n\tat cucumber.api.Transformer.fromString(Transformer.java:91)\r\n\tat cucumber.runtime.ParameterInfo.convert(ParameterInfo.java:164)\r\n\tat cucumber.runtime.StepDefinitionMatch.transformedArgs(StepDefinitionMatch.java:68)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:459)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:678)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:382)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:192)\r\n\tat ✽.When Task are Fetched from Excel \"C:\\Users\\boraajyo\\Documents\\Wkspc\\WebDriverTestCucumber\\target\\ExcelFile\\NewTask.xlsx\"(featurefile.feature:16)\r\n",
  "status": "failed"
});
});