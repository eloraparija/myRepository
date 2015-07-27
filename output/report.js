$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/com/cucumber/learning/Test.feature");
formatter.feature({
  "id": "test-gmail",
  "tags": [
    {
      "name": "@tag1",
      "line": 1
    }
  ],
  "description": "In order to test gmail",
  "name": "Test gmail",
  "keyword": "Feature",
  "line": 2
});
formatter.scenario({
  "id": "test-gmail;test-gmail;;2",
  "tags": [
    {
      "name": "@tag1",
      "line": 1
    }
  ],
  "description": "",
  "name": "Test gmail",
  "keyword": "Scenario Outline",
  "line": 15,
  "type": "scenario"
});
formatter.step({
  "name": "I go to http://eloraparija.com of gmail",
  "keyword": "Given ",
  "line": 8,
  "matchedColumns": [
    0
  ]
});
formatter.step({
  "name": "I click on the link",
  "keyword": "When ",
  "line": 9
});
formatter.step({
  "name": "it should show me the page",
  "keyword": "Then ",
  "line": 10
});
formatter.match({
  "arguments": [
    {
      "val": "http://eloraparija.com",
      "offset": 8
    }
  ],
  "location": "websiteTest.gotoUrl(String)"
});
formatter.result({
  "duration": 313746511101,
  "status": "failed",
  "error_message": "org.openqa.selenium.TimeoutException: timeout: Timed out receiving message from renderer: 0.001\n  (Session info: chrome\u003d43.0.2357.134)\n  (Driver info: chromedriver\u003d2.14.313457 (3d645c400edf2e2c500566c9aa096063e707c9cf),platform\u003dWindows NT 6.1 SP1 x86) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 301.37 seconds\nBuild info: version: \u00272.45.0\u0027, revision: \u00275017cb8e7ca8e37638dc3091b2440b90a1d8686f\u0027, time: \u00272015-02-27 09:10:26\u0027\nSystem info: host: \u0027N4425\u0027, ip: \u0027172.23.4.124\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027x86\u0027, os.version: \u00276.1\u0027, java.version: \u00271.7.0_25\u0027\nSession ID: 505af896d83bdfffe7f4cda391f00949\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{platform\u003dXP, acceptSslCerts\u003dtrue, javascriptEnabled\u003dtrue, browserName\u003dchrome, chrome\u003d{userDataDir\u003dC:\\Users\\ELORA~1.PAR\\AppData\\Local\\Temp\\scoped_dir67964_17148}, rotatable\u003dfalse, locationContextEnabled\u003dtrue, mobileEmulationEnabled\u003dfalse, version\u003d43.0.2357.134, takesHeapSnapshot\u003dtrue, cssSelectorsEnabled\u003dtrue, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, browserConnectionEnabled\u003dfalse, webStorageEnabled\u003dtrue, nativeEvents\u003dtrue, applicationCacheEnabled\u003dfalse, takesScreenshot\u003dtrue}]\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:57)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:526)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:204)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:156)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:599)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:304)\r\n\tat com.cucumber.learning.websiteTest.gotoUrl(websiteTest.java:25)\r\n\tat ✽.Given I go to http://eloraparija.com of gmail(src/test/resources/com/cucumber/learning/Test.feature:8)\r\n"
});
formatter.match({
  "location": "websiteTest.clickLink()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "websiteTest.verifyPage()"
});
formatter.result({
  "status": "skipped"
});
});elenium(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SearchText.it_should_show_me_the_result()"
});
formatter.result({
  "status": "skipped"
});
});