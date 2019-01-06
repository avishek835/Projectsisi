package allModuleTestCases;

import org.testng.annotations.Test;

import config.Configuration;
import singletonDesignMainPackage.Base;
import singletonDesignMainPackage.SingleTon;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.ExtentReports;
public class Contact extends Base {
	ExtentReports rep=SingleTon.getInstance();
	@Test
	public void contact() throws InterruptedException
	{

		test.log(LogStatus.INFO, "Starting the test for CONTACT PAGE");
		test.log(LogStatus.INFO, "Open  Browser");
		SingleTon.Instance.navigate().to(Configuration.url.app_url);
		test.log(LogStatus.INFO, "Load URL");
		test.log(LogStatus.INFO, "Maximize Window");
		Thread.sleep(1000);
		test.log(LogStatus.INFO, "Scroll Down");
		test.log(LogStatus.INFO, "Open Hamburger Menu");
		SingleTon.hamburgerMenu();
		Thread.sleep(1000);
		test.log(LogStatus.INFO, "Click on Contact Us  from hamburger menu");
		SingleTon.Contactus();
		test.log(LogStatus.INFO, "Scroll down to check the Location, phone and email");
		SingleTon.scrollDownContactus();
		test.log(LogStatus.INFO, "Capture location information");
		SingleTon.Location();
		test.log(LogStatus.INFO, "304 Belle meade lane. address is present");
		SingleTon.Phone();
		test.log(LogStatus.INFO, "901-218-3433 no. is present");
		SingleTon.Email();
		test.log(LogStatus.INFO, "araymondmd@gmail.com emailid is present");
		
		
		SingleTon.back();
		test.log(LogStatus.INFO, "Came back to home page");
		test.log(LogStatus.PASS, "Test Pass");
		rep.endTest(test);
		rep.flush();
		
	}
	

}
