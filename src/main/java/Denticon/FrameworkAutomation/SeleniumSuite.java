package Denticon.FrameworkAutomation;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;


import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class SeleniumSuite {
	public RemoteWebDriver driver;
	
	//ExtentHtmlReporter htmlReporter;
    ExtentReports extent;
    ExtentTest test;    
    
	
	
	   public void config()
    {
        //htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/MyDemoReport.html");
        extent = new ExtentReports("true");
        //extent.attachReporter();
    }
                                      
	@BeforeTest
	@Parameters({"browserType","url"})
	public RemoteWebDriver setUpSuite(String browserType, String url) {
		Config config = new Config();
		if (driver == null) {
			driver = Denticon.FrameworkAutomation.DriverManager.getDriver();
			driver = config.setupBrowser(browserType, url);
			
			Denticon.FrameworkAutomation.DriverManager.setWebDriver(driver);
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		return driver;
	}
	
	  
/*	@Test
    public void logsGeneration()
    {
        test = extent.createTest("logsGeneration");
        test.log(Status.INFO,"createTest() method will return the ExtentTest object");
        test.log(Status.INFO, "I am in actual Test");
        test.log(Status.INFO, "We can write the actual test logic in this Test");
         
        // Using Labels
        test.log(Status.INFO, MarkupHelper.createLabel("*************** Using Labels ***************", ExtentColor.RED));
        test.log(Status.INFO, MarkupHelper.createLabel("This is Test Logger 1", ExtentColor.BLUE));
        test.log(Status.INFO, MarkupHelper.createLabel("This is Test Logger 2", ExtentColor.BLUE));
        test.log(Status.INFO, MarkupHelper.createLabel("This is Test Logger 3", ExtentColor.BLUE));
        test.log(Status.INFO, MarkupHelper.createLabel("This is Test Logger 4", ExtentColor.BLUE));
    }

	
	 @Test
	    public void demoTestPass()
	    {
	        test = extent.createTest("demoTestPass", "This test will demonstrate the PASS test case");
	        Assert.assertTrue(true);
	    }
	     
	    @Test
	    public void demoTestFail()
	    {
	        test = extent.createTest("demoTestFail", "This test will demonstrate the FAIL test case");
	        Assert.assertTrue(false);
	    }
	     
	    @Test
	    public void demoTestSkip()
	    {
	        test = extent.createTest("demoTestSkip", "This test will demonstrate the SKIP test case");
	        throw new SkipException("This test case not ready for execution");
	    }
	    
	    
	    @AfterMethod
	    public void getResult(ITestResult result)
	    {
	        if(result.getStatus() == ITestResult.FAILURE)
	        {
	            test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" Test case FAILED due to below issues:", ExtentColor.RED));
	            test.fail(result.getThrowable());
	        }
	        else if(result.getStatus() == ITestResult.SUCCESS)
	        {
	            test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" Test Case PASSED", ExtentColor.GREEN));
	        }
	        else
	        {
	            test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" Test Case SKIPPED", ExtentColor.ORANGE));
	            test.skip(result.getThrowable());
	        }
	    }                                   */
	     
	
	@AfterTest
	public void afterTest(){
		 
	//	extent.flush();
		   
		driver.close();
		driver.quit();
	}						
}
