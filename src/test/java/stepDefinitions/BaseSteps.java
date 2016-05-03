package stepDefinitions;

import java.util.concurrent.TimeUnit;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import testSupport.Browser;

public class BaseSteps {
	
	@Before
	public void setUp(){
		Browser.initialise();
		Browser.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@After
	public void dispose(){
		Browser.quit();
	}

}
