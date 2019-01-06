package allModuleTestCases;

import org.testng.annotations.Test;

import config.Configuration;
import singletonDesignMainPackage.Base;
import singletonDesignMainPackage.SingleTon;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.ExtentReports;

public class Blogs extends Base{
	ExtentReports rep=SingleTon.getInstance();
	@Test
	public void blogs() throws InterruptedException
	{

		test.log(LogStatus.INFO, "Starting the test for MEDIA & EVENTS");
		test.log(LogStatus.INFO, "Open  Browser");
		SingleTon.Instance.navigate().to(Configuration.url.app_url);
		test.log(LogStatus.INFO, "Load URL");
		test.log(LogStatus.INFO, "Maximize Window");
		Thread.sleep(1000);
		test.log(LogStatus.INFO, "Scroll Down");
		test.log(LogStatus.INFO, "Open Hamburger Menu");
		SingleTon.hamburgerMenu();
		test.log(LogStatus.INFO, "Click on Media & Events from hamburger menu");
		Thread.sleep(1000);
		SingleTon.Blogs();
		test.log(LogStatus.INFO, "Check the Media & Events text in the page ");
		
		SingleTon.BlogsText();
		test.log(LogStatus.INFO, "Media & Events  text is present");
		SingleTon.back();
		test.log(LogStatus.INFO, "Came back to home page");
		test.log(LogStatus.PASS, "Test Pass");
		rep.endTest(test);
		rep.flush();
		
	}

}
