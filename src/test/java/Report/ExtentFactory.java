package Report;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentFactory {

	public static ExtentReports Instance () {

		ExtentReports extent;

		String Path =  "C://Users//Oguntoye//eclipse-workspace//SeleniumJavaFramework//ExtentReport.html";

		extent = new ExtentReports(Path, true);

		extent 
		.addSystemInfo("Selenium Version","3.141" )
		.addSystemInfo("Platform","Windows");


		return extent;


	}



}
