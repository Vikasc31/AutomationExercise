package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReportManager {
	
	private static ExtentReports extent;
	private static ExtentTest test;
	
	public static ExtentReports getreportInstance() {
		
		if(extent == null) {
			
			ExtentSparkReporter spark = new ExtentSparkReporter("test-output/ExtentReport.html");
			extent = new ExtentReports();
			extent.attachReporter(spark);

		}
		return extent;
	}
	
	public static ExtentTest createTest(String testName) {
		
		test = getreportInstance().createTest(testName);
		return test;
	}
	
	public static ExtentTest getTest() {
		
		return test;
	}
	
	public static void flush() {
		
		if(extent != null)
			extent.flush();
	}

}
