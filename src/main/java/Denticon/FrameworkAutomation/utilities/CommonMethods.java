package Denticon.FrameworkAutomation.utilities;

import java.io.File;  
import java.io.FileInputStream;  
import java.io.FileNotFoundException;  
import java.util.List;  
import java.util.Properties;

   
import org.openqa.selenium.By;  
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Denticon.FrameworkAutomation.DriverManager;  
import com.relevantcodes.extentreports.ExtentReports;  
import com.relevantcodes.extentreports.ExtentTest;  
import com.relevantcodes.extentreports.LogStatus;
import org.testng.ITestResult;



public class CommonMethods{  
 
	static String url = "http://dev.denticon.com/aspx/home/login.aspx";    

	public static List<WebElement> getListelements(By lst){  
  
		List<WebElement> lstcommon= DriverManager.getDriver().findElements(lst);  
		if(lstcommon.isEmpty()){  
			return null;  
		}  
		else		  
			return lstcommon;  
	}  
	
	public static boolean clickIfEnable(By link){  
		boolean flag=false;  
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),15);
		wait.until(ExpectedConditions.elementToBeClickable(link));
		WebElement element=DriverManager.getDriver().findElement(link);  
		if(element.isEnabled()){  
			element.click();  
			flag=true;	  
		}  
		return flag;  
	}  
	
  
	public static boolean sendText(By loc, String text){  
		boolean flag=false;  
		WebElement element=DriverManager.getDriver().findElement(loc);  
		if(element!=null){  
			element.clear();  
			element.sendKeys(text);  
			flag=true;  
		}  
		return flag;  
  
	}  
  
	
	public static boolean selectFromList(By dropdwon, String seletedvalue){  
		boolean flag=false;  
		try{  
			WebElement element=DriverManager.getDriver().findElement(dropdwon);  
			if(element!=null){  
				new Select(element).selectByVisibleText(seletedvalue);  
				flag=true;  
			}  
		}catch(NoSuchElementException e){}  
		return flag;		  
	}  
	
	
	public static ExtentReports getReport(ExtentReports repo){  
		repo = new ExtentReports("E:/Selenium_Test/SeleniumAuto/report/report.html");  
		return repo;  
	} 
	
	
	public static void closeReport(ExtentReports repo, ExtentTest test ){  
		repo.endTest(test);  
		repo.flush();  
	}  
	
	
	public static String readDatafromProps(String filePath, String key)  
	{  
		File f=new File(filePath);  
		Properties prop= new Properties();  
		FileInputStream fileInput;  
		String value="";  
		try {				  
			fileInput = new FileInputStream(f);  
			prop.load(fileInput);  
			value=prop.getProperty(key);  
		} catch (Exception e) {  
			e.printStackTrace();  
		}  
		return value;  
  
	}  

	public static boolean isElementPresent(By by) {
		 		List<WebElement> elements = DriverManager.getDriver().findElements(by);
		 		return !elements.isEmpty();
	}
		 	


public static boolean listSelect(By lstPracArea, String lstValue) throws Exception {
			WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(),15);
				wait.until(ExpectedConditions.presenceOfElementLocated(lstPracArea));
	 		boolean result = false;
	 		WebElement element = getWebElement(lstPracArea);
	 		if (element != null) {
	 			new Select(element).selectByVisibleText(lstValue);
	 			result = true;
	 		}
	 		Thread.sleep(3000);
	 		return result;
	 	}


	 	public static WebElement getWebElement(By by) {
	 		WebElement result = null;
	 		List<WebElement> elements = DriverManager.getDriver().findElements(by);
	 		if (!elements.isEmpty()) {
	 			result = DriverManager.getDriver().findElement(by);
	 		} else {
	 			return null;
	 		}
	 		int attempts = 0;
	 		while (attempts < 3) {
	 			try {
	 				result.isEnabled();
	 				break;
	 			} catch (StaleElementReferenceException e) {
	 				result = DriverManager.getDriver().findElement(by);
	 			}
	 			attempts++;
	 		}
	 
	 		return result;
	 	}
	 	
	 	
	 	public static boolean isAlertPresent(){
	 	    boolean foundAlert = false;
	 	    WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 20);
	 	    try {
	 	        wait.until(ExpectedConditions.alertIsPresent());
	 	        DriverManager.getDriver().switchTo().alert().accept();
	 	        foundAlert = true;
	 	    } catch (Exception eTO) {
	 	        foundAlert = false;
	 	    }
	 	    return foundAlert;
	 	}
	 
	 }