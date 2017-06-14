/*package Denticon.FrameworkAutomation.patient;

import org.testng.annotations.Test;
import Denticon.FrameworkAutomation.pom.IAddPatient;
import Denticon.FrameworkAutomation.utilities.CommonMethods;
import java.util.Properties;

import org.testng.annotations.Test; 

 public class SaddNewPatient {
	 
			String filePath	= System.getProperty("user.dir") + "\\src\\main\\resources\\AddNewPatient.properties";
			
			String stepInfo="";
			boolean flag=false;
			
			Properties prop= new Properties();
			
	@Test(description="Verify Patient tab functionality")
	public boolean verifyPatientTabModule() {
 		if(verifyAddNewPatientPage())
 			System.out.println("Patient page verification passed");
 		else
 			System.out.println("Patient page verification failed");
		return flag;
	}								
				
	public boolean verifyAddNewPatientPage(){
		
		try{
			stepInfo="Click on Patient tab";
			flag=CommonMethods.clickIfEnable(IAddPatient.Tab_Patient);
			stepInfo="Select Add Patient";
			flag=CommonMethods.clickIfEnable(IAddPatient.Tab_AddNewPatient);
			stepInfo="verify Add new Patient page is displayed";
			flag=CommonMethods.isElementPresent(IAddPatient.Title_AddPatientInfo);
			stepInfo="verify add Patient info title";
			Thread.sleep(1000);
		
			flag=CommonMethods.isElementPresent(IAddPatient.TXT_Nick);
			flag=CommonMethods.isElementPresent(IAddPatient.TXT_Last_Name);
			flag=CommonMethods.isElementPresent(IAddPatient.TXT_First_Name);
			flag=CommonMethods.isElementPresent(IAddPatient.TXT_MidI);
			
			flag=CommonMethods.isElementPresent(IAddPatient.TXT_Address);
			
			flag=CommonMethods.isElementPresent(IAddPatient.TXT_City);
			flag=CommonMethods.isElementPresent(IAddPatient.SCR_State);
			flag=CommonMethods.isElementPresent(IAddPatient.TXT_ZIP);
			
			flag=CommonMethods.isElementPresent(IAddPatient.TXT_Email);
			flag=CommonMethods.isElementPresent(IAddPatient.TXT_Bdate);
			
/*			flag=CommonMethods.isElementPresent(IAddPatient.SCR_MStatus);
			flag=CommonMethods.isElementPresent(IAddPatient.TXT_Sex);
			flag=CommonMethods.isElementPresent(IAddPatient.TXT_HCGN);
			flag=CommonMethods.isElementPresent(IAddPatient.TXT_HCGP);
			flag=CommonMethods.isElementPresent(IAddPatient.SLC_PatientStatus);						*/
			
			
/*			String Nick = CommonMethods.readDatafromProps(filePath,"Nick");
			String Last_name = CommonMethods.readDatafromProps(filePath,"Last_name");
			String First = CommonMethods.readDatafromProps(filePath,"First");
			String MidI = CommonMethods.readDatafromProps(filePath,"MidI");
			
			String Address = CommonMethods.readDatafromProps(filePath,"Address");
			
			String City = CommonMethods.readDatafromProps(filePath,"City");
			String State = CommonMethods.readDatafromProps(filePath,"State");
			String ZIP = CommonMethods.readDatafromProps(filePath,"ZIP");
			
			String Email = CommonMethods.readDatafromProps(filePath,"Email");
			String Bdate = CommonMethods.readDatafromProps(filePath,"Bdate");
/*			String MStatus = CommonMethods.readDatafromProps(filePath,"MStatus");
			String Sex = CommonMethods.readDatafromProps(filePath,"Sex");
			String HCGN = CommonMethods.readDatafromProps(filePath,"HCGN");
			String HCGP = CommonMethods.readDatafromProps(filePath,"HCGP");
			String PatientStatus = CommonMethods.readDatafromProps(filePath,"PatientStatus");				*/

/*			CommonMethods.sendText(IAddPatient.TXT_Nick,Nick);
			
			CommonMethods.sendText(IAddPatient.TXT_Last_Name,Last_name);		
			CommonMethods.sendText(IAddPatient.TXT_First_Name,First);
			CommonMethods.sendText(IAddPatient.TXT_MidI,MidI);
			
			CommonMethods.sendText(IAddPatient.TXT_Address,Address);
			
			CommonMethods.sendText(IAddPatient.TXT_City,City);
			CommonMethods.sendText(IAddPatient.SCR_State,State);
			CommonMethods.sendText(IAddPatient.TXT_ZIP,ZIP);
			
			CommonMethods.sendText(IAddPatient.TXT_Email,Email);
			CommonMethods.sendText(IAddPatient.TXT_Bdate,Bdate);
	//		CommonMethods.sendText(IAddPatient.SCR_MStatus,MStatus);
	//		CommonMethods.sendText(IAddPatient.TXT_HCGN,HCGN);
	//		CommonMethods.sendText(IAddPatient.TXT_Age,Age);
	//		CommonMethods.sendText(IAddPatient.TXT_HCGP,HCGP);      

			
			Thread.sleep(2000);
			
			 
			
			
		}
		catch (Exception e) {
			e.getStackTrace();
		}
 		return flag;
	}
	
 } */