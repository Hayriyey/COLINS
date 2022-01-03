$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Order.feature");
formatter.feature({
  "name": "Order an Item",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@order"
    }
  ]
});
formatter.scenario({
  "name": "A user can send an order to the basket",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@order"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to \"Giriş\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.colins.stepDefs.loginStepDefs.user_navigates_to_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user types valid username \"username\" and \"password\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.colins.stepDefs.loginStepDefs.user_types_valid_username_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click to login button",
  "keyword": "And "
});
formatter.match({
  "location": "com.colins.stepDefs.loginStepDefs.user_click_to_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks \"Kadın\" and \"Kaban\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.colins.stepDefs.OrderStepDefs.the_user_clicks_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks \"Düğme Detaylı Kapüşonlu Haki  Kaban\" button",
  "keyword": "And "
});
formatter.match({
  "location": "com.colins.stepDefs.OrderStepDefs.the_user_clicks_button(java.lang.String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementNotInteractableException: element not interactable\n  (Session info: chrome\u003d96.0.4664.110)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-4BJH945D\u0027, ip: \u0027192.168.1.28\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002714.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 96.0.4664.110, chrome: {chromedriverVersion: 96.0.4664.45 (76e4c1bb2ab46..., userDataDir: C:\\Users\\Lenovo\\AppData\\Loc...}, goog:chromeOptions: {debuggerAddress: localhost:62775}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: c5e55531cc470cc10ebacb2f70d95c40\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:564)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy20.click(Unknown Source)\r\n\tat com.colins.stepDefs.OrderStepDefs.the_user_clicks_button(OrderStepDefs.java:28)\r\n\tat ✽.the user clicks \"Düğme Detaylı Kapüşonlu Haki  Kaban\" button(file:///C:/Users/Lenovo/IdeaProjects/COLINS/src/test/resources/features/Order.feature:9)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "the user selects beden",
  "keyword": "Then "
});
formatter.match({
  "location": "com.colins.stepDefs.OrderStepDefs.the_user_selects_beden()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user should click \"Sepete Ekle\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.colins.stepDefs.OrderStepDefs.the_user_should_click(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", "screenshot");
formatter.after({
  "status": "passed"
});
});