
package NEXTeTICKET_TestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import NEXTeTICKET_Utility.NEXTeTICKET_Base;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/NEXTeTICKET_Features"},
plugin = {"json:target/cucumber.json"},
glue = "NEXTeTICKET_StepDefinition",

   //tags = {"@NEXT1"})
  //tags = {"@NEXT2"})
  //tags = {"@NEXT3"})
//tags = {"@NEXT4"})
  tags = {"@NEXT5"})

   public class NEXTeTICKET_Test_Runner extends AbstractTestNGCucumberTests {
	
	
	@BeforeTest
	public void NetStartURL() {
		NEXTeTICKET_Base net = new NEXTeTICKET_Base();
		net.NetBrowser();
	
	}
	
	@AfterTest
	public void BoiCloseURL() {
		NEXTeTICKET_Base net = new NEXTeTICKET_Base();
		net.driver.quit();
	}
}
