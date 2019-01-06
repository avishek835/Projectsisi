package allModuleTestCases;




import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import config.Configuration;
import singletonDesignMainPackage.Base;
import singletonDesignMainPackage.SingleTon;
import com.relevantcodes.extentreports.LogStatus;
public class Home extends Base{

	ExtentReports rep=SingleTon.getInstance();

	@Test
	public void home() throws InterruptedException
	{

		test.log(LogStatus.INFO, "Starting the test for HOME PAGE");
		test.log(LogStatus.INFO, "Open  Browser");
		SingleTon.Instance.navigate().to(Configuration.url.app_url);
		test.log(LogStatus.INFO, "Load URL");
		test.log(LogStatus.INFO, "Maximize Window");
		//Thread.sleep(1000);
		test.log(LogStatus.INFO, "Scroll Down to check the Welcome text");
		SingleTon.scrollDown();
		test.log(LogStatus.INFO, "Check the Welcome Text");
		SingleTon.Welcometext();
		test.log(LogStatus.INFO, "Welcome To Project Sisi. text is present");
		Thread.sleep(1000);
		SingleTon.homereadmore1();
		test.log(LogStatus.INFO, "Click the readmore button just below Welcome Text");
		test.log(LogStatus.INFO, "About us page visible");
		test.log(LogStatus.INFO, "Click the browser back button");
		SingleTon.back();
		test.log(LogStatus.INFO, "Home page is showing");
		
				
		test.log(LogStatus.INFO, "Click Hamburger Menu");
		SingleTon.hamburgerMenu();
		
		Thread.sleep(1000);
		SingleTon.closeHamburgermaenu();
		test.log(LogStatus.INFO, "Close the hamburger menu");
		
		SingleTon.scrollDownNews();
		test.log(LogStatus.INFO, "Scroll down to News section to check and click the two readmore button one by one");
		SingleTon.homenewsreadmore1();
		test.log(LogStatus.INFO, "Click on 1st readmore button");
		SingleTon.back();
		test.log(LogStatus.INFO, "Came back to click on second readmore button");
		Thread.sleep(1000);
		SingleTon.homenewsreadmore2();
		test.log(LogStatus.INFO, "Click on 2nd read button ");
		SingleTon.back();
		test.log(LogStatus.INFO, "Came back to home page");
		test.log(LogStatus.PASS, "Test Pass");
		rep.endTest(test);
		rep.flush();
	}
	/*@Test
	public void scrollDown()
	{
		SingleTon.scrollDown();
	}
	@Test
	public void closeHamburgermenu()
	{
		SingleTon.closeHamburgermaenu();
	}*/

}
