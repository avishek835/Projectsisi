package singletonDesignMainPackage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;


public class Base {
	
	ExtentReports rep=SingleTon.getInstance();
	protected ExtentTest test;
	protected WebDriver driver;
	
	
	@BeforeClass
	public void setup()
	{
		
		test=rep.startTest("ProjectSISI Testing");
		
		SingleTon.Initialize();
		
	}
	
	@AfterClass
	public void cleanup()
	{
		SingleTon.close();
	}

}
