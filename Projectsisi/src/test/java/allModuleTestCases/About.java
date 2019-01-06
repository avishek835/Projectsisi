package allModuleTestCases;

import org.testng.annotations.Test;

import config.Configuration;
import singletonDesignMainPackage.Base;
import singletonDesignMainPackage.SingleTon;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.ExtentReports;

public class About extends Base
{
	ExtentReports rep=SingleTon.getInstance();
	@Test
	public void contact() throws InterruptedException
	{

		test.log(LogStatus.INFO, "Starting the test for ABOUT PAGE");
		test.log(LogStatus.INFO, "Open  Browser");
		SingleTon.Instance.navigate().to(Configuration.url.app_url);
		test.log(LogStatus.INFO, "Load URL");
		test.log(LogStatus.INFO, "Maximize Window");
		//Thread.sleep(1000);
		test.log(LogStatus.INFO, "Scroll Down");
		test.log(LogStatus.INFO, "Open Hamburger Menu");
		SingleTon.hamburgerMenu();
		Thread.sleep(1000);
		test.log(LogStatus.INFO, "Click on About Us button from Hamburger Menu");
		SingleTon.AboutUs();
		test.log(LogStatus.INFO, "Check the About us text in banner section under About us page");
		SingleTon.AboutUsText();
		test.log(LogStatus.INFO, "ABOUT US text is present");
				
		SingleTon.back();
		test.log(LogStatus.INFO, "Coming back to home page");
		test.log(LogStatus.PASS, "Test Pass");
		rep.endTest(test);
		rep.flush();
		
	}
	


}
