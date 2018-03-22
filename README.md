# SimpleTests
Requriments:
JDK 1.8,
Maven 3,
Docker

Run UI tests:
>mvn clean -Dtype=UI test

Run API tests:
>mvn clean -Dtype=API test


Show tests results:
>mvn  allure:serve

The current implementation of Firefox WebDriver does not allow the use of Mouse Move functionality. It is Mouse Move that most accurately describes the possible behavior of the user on this site. Therefore, the test using this browser does not work properly.. 
