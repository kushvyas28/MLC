# Instructions to run the code
Import the code in your local IDE.
To run the coding exercises please ensure corresponding tag is enabled in TestRunner.java present at "src\test\java\mlc\life\insurance\automationScreeningTest\testRunner\" . For instance for UI Test 1 tag "@Exercise1" should be enabled, for UI Test 2 tag "@Exercise2" should be enabled and in the same way for API Test "@Exercise3" should be enabled.
Currently the browser set to run the UI Tests is set as "Chrome", if you intend to change it you can do that in serenity.conf present at "src\test\resources\"
Before running the API Test, you will have to register with Australia Post Developer Centre in order to receive the API access key. Once you have the key update it against "ACCESS_KEY" variable in APIConstants.java present at "src\test\java\mlc\life\insurance\automationScreeningTest\apiRequestResponse\"
Once above mentioned setup is complete you can execute the code by running TestRunner.java as JUnit Test
After executing API Test you can find the prices calculated for posting items to different countries in console, search for "**  Price for".
HTML Reports are generated at "target\site\serenity" for each test run.