package tek.sdet.framework.base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import tek.sdet.framework.utilities.CommonUtility;

public class BaseUITest extends CommonUtility {
	
	@Before
	public void setupTest() {
		super.setupBrowser();
	}
	// once we start executing text case before any case execute this will run
	// will be calling the setup browser method 
	
	@After
	public void closeTests(Scenario scenario) {
		if (scenario.isFailed()) {
			byte[] screenshot = takeScreenShotAsBytes();
			scenario.attach(screenshot, "iamge/png", scenario.getName() + "scenario Failed");
			}
			
			super.quitBrowser();
		}
	}

