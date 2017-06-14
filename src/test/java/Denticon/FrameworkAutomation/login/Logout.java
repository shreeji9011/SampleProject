package Denticon.FrameworkAutomation.login;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import Denticon.FrameworkAutomation.pom.ILogin;
import Denticon.FrameworkAutomation.utilities.CommonMethods;

public class Logout { 
	 	@Test 
	 	public void logout() { 
	 		try { 
	 			CommonMethods.clickIfEnable(ILogin.LNK_SIGNOFF); 
	 			Alert alert = Denticon.FrameworkAutomation.DriverManager.getDriver().switchTo().alert(); 
	 			alert.accept(); 
	 			Thread.sleep(2000); 
	 		} catch (Exception e) { 
 
	 
				e.printStackTrace(); 
	} 
	 	}
}
