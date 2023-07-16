$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/WhatsApp.feature");
formatter.feature({
  "name": "To extract data from WhatsApp",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To get the number of people who have read a particular input message in a group",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "To launch the chrome browser and maximize the window",
  "keyword": "Given "
});
formatter.match({
  "location": "WhatsAppTest.to_launch_the_chrome_browser_and_maximize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To launch the URL of the WhatsApp",
  "keyword": "When "
});
formatter.match({
  "location": "WhatsAppTest.to_launch_the_URL_of_the_WhatsApp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To scan the QR code manually through mobile",
  "keyword": "And "
});
formatter.match({
  "location": "WhatsAppTest.to_scan_the_QR_code_manually_through_mobile()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the WhatsApp Group",
  "keyword": "And "
});
formatter.match({
  "location": "WhatsAppTest.to_click_the_WhatsApp_Group()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//span[text()\u003d\u0027WhatsApp Testing\u0027]\"}\n  (Session info: chrome\u003d114.0.5735.199)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-MN5RQUC\u0027, ip: \u0027192.168.1.11\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.4.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 114.0.5735.199, chrome: {chromedriverVersion: 114.0.5735.90 (386bc09e8f4f..., userDataDir: C:\\Users\\Dell\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:61623}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: dc359dc78de58f9b03fab399c132bdb7\n*** Element info: {Using\u003dxpath, value\u003d//span[text()\u003d\u0027WhatsApp Testing\u0027]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat jdk.proxy2/jdk.proxy2.$Proxy16.click(Unknown Source)\r\n\tat org.base.BaseClass.clickButton(BaseClass.java:38)\r\n\tat org.stepdefinition.WhatsAppTest.to_click_the_WhatsApp_Group(WhatsAppTest.java:40)\r\n\tat ✽.To click the WhatsApp Group(src/test/resources/WhatsApp.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "To send message in the group",
  "keyword": "And "
});
formatter.match({
  "location": "WhatsAppTest.to_send_message_in_the_group()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To read the peolpe count and display",
  "keyword": "And "
});
formatter.match({
  "location": "WhatsAppTest.to_read_the_peolpe_count_and_display()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To delete the sent message",
  "keyword": "And "
});
formatter.match({
  "location": "WhatsAppTest.to_delete_the_sent_message()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To click the menu",
  "keyword": "And "
});
formatter.match({
  "location": "WhatsAppTest.to_click_the_menu()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To click the log out",
  "keyword": "And "
});
formatter.match({
  "location": "WhatsAppTest.to_click_the_log_out()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "WhatsAppTest.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});