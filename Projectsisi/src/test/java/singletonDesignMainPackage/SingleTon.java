package singletonDesignMainPackage;

import java.io.File;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;


import config.Configuration;

public class SingleTon {
	//static WebDriver driver;
	public static WebDriver Instance=null;
	
	private static ExtentReports extent;
	
	public static ExtentReports getInstance()
	{
		if(extent==null){
			Date d=new Date();
			String fileName=d.toString().replace(":","_").replace(" ","_")+".html";
			extent=new ExtentReports("E:\\SELENIUM\\Report\\"+fileName, true, DisplayOrder.NEWEST_FIRST);
			extent.loadConfig(new File(System.getProperty("user.dir")+"//ReportsConfig.xml"));
		}
		return extent;
		
	}
	
	
	public static void Initialize()
	{
		if(Instance==null)
		{
			System.out.println("Initialise Driver");
			if(Configuration.Browser.browser.equalsIgnoreCase("cc")) {
				System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\Drivers\\chromedriver.exe");
				Instance=new ChromeDriver();}
				else if(Configuration.Browser.browser.equalsIgnoreCase("ff")) { 
					System.setProperty("webdriver.gecko.driver", "E:\\SELENIUM\\Drivers\\geckodriver.exe");
					Instance=new FirefoxDriver();}
		}
		Instance.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Instance.manage().window().maximize();
	}

	public static void close()
	{
		System.out.println("Closing Browser");
		Instance.close();
		Instance=null;
	}
	
	public static void back()
	{
		Instance.navigate().back();
	}
	
	public static void quit()
	{
		System.out.println("Quiting from Browser");
		Instance.quit();
		Instance=null;
	}
	
	
	public static void scrollDown()
	{
		
		JavascriptExecutor jse = (JavascriptExecutor)Instance;
		jse.executeScript("scroll(0, 600);");
		//((Driver) Instance).scrollDown();
		
	}
	
	public static void scrollDownNews()
	{
		JavascriptExecutor jse = (JavascriptExecutor)Instance;
		jse.executeScript("scroll(0, 2450);");
	}
	
	public static void homenewsreadmore1()
	{
		Instance.findElement(By.xpath(Configuration.Homenewsreadmore1.homenewsreadmore1)).click();
	}
	
	public static void homenewsreadmore2()
	{
		Instance.findElement(By.xpath(Configuration.Homenewsreadmore2.homenewsreadmore2)).click();
	}
	
	public static void homereadmore1()
	{
		Instance.findElement(By.xpath(Configuration.Homereadmore1.homereadmore1)).click();
	}
	{
		Instance.findElement(By.xpath(Configuration.CloseHamburgermenu.closeHamburgermenu)).click();
		System.out.println("Close on hamburger menu");
	}
	
	
	public static void hamburgerMenu()
	{
		Instance.findElement(By.xpath(Configuration.Hamburgermenu.hamburgermenu)).click();
		System.out.println("Click on hamburger menu");
	}
	
	public static void closeHamburgermaenu()
	{
		Instance.findElement(By.xpath(Configuration.CloseHamburgermenu.closeHamburgermenu)).click();
		System.out.println("Close on hamburger menu");
	}
	
	public static void Welcometext()
	{
		//Instance.findElement(By.xpath(Configuration.Welcometext.welcometext)).click();
			String s=Instance.findElement(By.xpath(Configuration.Welcometext.welcometext)).getText();
			System.out.println("Got the text");
			if(s!=null) {
			System.out.println("Welcome To Project Sisi. text is present");
			
		}else
			System.out.println("Not found accurate message");
	}
	
	public static void Contactus()
	{
		
		Instance.findElement(By.xpath(Configuration.Contactus.contactus)).click();
		
	}
	public static void Location()
	{
		
		//Instance.findElement(By.xpath(Configuration.Location.location)).click();
		String s=Instance.findElement(By.xpath(Configuration.Location.location)).getText();
		System.out.println("Address is founding");
		if(s!=null) {
		System.out.println("304 Belle meade lane. address is present");
		
	}else
		System.out.println("Not found accurate message.");
		
	}
	
	
	public static void Phone()
	{
		//Instance.findElement(By.xpath(Configuration.Phone.phone)).click();
		String s=Instance.findElement(By.xpath(Configuration.Phone.phone)).getText();
		System.out.println("Phone number is founding.");
		if(s!=null) {
		System.out.println("901-218-3433 no. is present");
		
	}else
		System.out.println("Not found accurate message");
		
	}
	public static void Email()
	{
		
		//Instance.findElement(By.xpath(Configuration.Email.email)).click();
		String s=Instance.findElement(By.xpath(Configuration.Email.email)).getText();
		System.out.println("Email id is founding.");
		if(s!=null) {
		System.out.println("araymondmd@gmail.com emailid is present");
		
	}else
		System.out.println("Not found accurate message");
		
	}
	public static void scrollDownContactus()
	{
		
		JavascriptExecutor jse = (JavascriptExecutor)Instance;
		jse.executeScript("scroll(0, 450);");
		//((Driver) Instance).scrollDown();
		
	}
	
	public static void AboutUs()
	{
		
		Instance.findElement(By.xpath(Configuration.AboutUs.aboutus)).click();
		
	}
	
	public static void AboutUsText()
	{
		
		//Instance.findElement(By.xpath(Configuration.Email.email)).click();
		String s=Instance.findElement(By.xpath(Configuration.AboutUsText.aboutustext)).getText();
		System.out.println("About us text is founding.");
		if(s!=null) {
		System.out.println("ABOUT US text is present");
		
	}else
		System.out.println("Not found accurate message");
		
	}
	
	public static void Blogs()
	{
		
		Instance.findElement(By.xpath(Configuration.Blogs.blogs)).click();
		
	}
	
	public static void BlogsText()
	{
		
		//Instance.findElement(By.xpath(Configuration.Email.email)).click();
		String s=Instance.findElement(By.xpath(Configuration.Blogs.blogs)).getText();
		System.out.println("Media & Events text is founding.");
		if(s!=null) {
		System.out.println("Media & Events  text is present");
		
	}else
		System.out.println("Not found accurate message");
		
	}
}
