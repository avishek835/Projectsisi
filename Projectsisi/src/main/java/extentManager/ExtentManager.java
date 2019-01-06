package extentManager;

import java.io.File;
import java.util.Date;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {
	private static ExtentReports extent;
	//static String reportPath="E:\\SELENIUM\\report\\report1.html";
	
	/*public static ExtentReports getInstance()
	{
		if(extent==null){
			extent=new ExtentReports(reportPath, true, DisplayOrder.NEWEST_FIRST);
			extent.loadConfig(new File(System.getProperty("user.dir")+"//ReportsConfig.xml"));
		}
		return extent;
		
	}*/
	public static ExtentReports getInstance()
	{
		if(extent==null){
			Date d=new Date();
			String fileName=d.toString().replace(":","_").replace(" ","_")+".html";
			extent=new ExtentReports("E:\\Avishek\\Report\\"+fileName, true, DisplayOrder.NEWEST_FIRST);
			extent.loadConfig(new File(System.getProperty("user.dir")+"//ReportsConfig.xml"));
		}
		return extent;
		
	}
}
