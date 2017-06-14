package Denticon.FrameworkAutomation.patient;

import org.testng.annotations.Test;

import Denticon.FrameworkAutomation.SeleniumSuite;
import Denticon.FrameworkAutomation.pom.IAddPatient;
import java.util.Properties;
import Denticon.FrameworkAutomation.utilities.CommonMethods;

public class AddNewPatient{
	String stepInfo=""; 
		boolean flag=false; 
	 	String filePath=System.getProperty("user.dir") + "\\src\\main\\resources\\AddNewPatient.properties"; 
	 	@Test 
	 	public void f() { 
	 		try { 
	 			String nickname=CommonMethods.readDatafromProps(filePath,"Nickname"); 
	 			String lastName=CommonMethods.readDatafromProps(filePath,"LastName"); 
	 			String firstName=CommonMethods.readDatafromProps(filePath,"FirstName"); 
	 			String phone=CommonMethods.readDatafromProps(filePath,"Phone"); 
	 			String city=CommonMethods.readDatafromProps(filePath,"City"); 
	 			String state=CommonMethods.readDatafromProps(filePath,"City"); 
	 			String address=CommonMethods.readDatafromProps(filePath,"Address"); 
	 			String Zip = CommonMethods.readDatafromProps(filePath, "ZIP");
	 			String PrefProvider = CommonMethods.readDatafromProps(filePath, "PrefProvider");
	 			String RelToRes = CommonMethods.readDatafromProps(filePath, "RelToRes");
	 			String RefType = CommonMethods.readDatafromProps(filePath, "RefType");
	 			String cmbRespParty = CommonMethods.readDatafromProps(filePath, "cmbRespParty");
	 			 
	 			stepInfo="Click on Patient tab";
	 			flag=CommonMethods.clickIfEnable(IAddPatient.TAB_PATIENT); 
	 			stepInfo="Click on add new patient"; 
	 			flag=CommonMethods.clickIfEnable(IAddPatient.LNK_ADD_NEW_PATIENT); 
	 			stepInfo="Select title"; 
	 			flag=CommonMethods.listSelect(IAddPatient.SLC_TITLE_NICKNAME, "Mr."); 
	 			stepInfo="Enter the nick name"; 
	 			flag=CommonMethods.sendText(IAddPatient.TXT_Nick,nickname); 
	 			stepInfo="Enter last name"; 
	 			flag=CommonMethods.sendText(IAddPatient.TXT_Last_Name, lastName); 
	 			stepInfo="Enter first name"; 
	 			flag=CommonMethods.sendText(IAddPatient.TXT_First_Name, firstName); 
	 			stepInfo="Click on City"; 
	 			flag=CommonMethods.sendText(IAddPatient.TXT_City, city);
	 			stepInfo="Enter ZIP"; 
	 			flag=CommonMethods.sendText(IAddPatient.TXT_ZIP, Zip);
	 			stepInfo="Enter STATE"; 
	 			flag=CommonMethods.selectFromList(IAddPatient.SCR_City, state);
	 			stepInfo="Click on Address"; 
	 			flag=CommonMethods.sendText(IAddPatient.TXT_Address, address);
	 			stepInfo="Coverage Type"; 
	 			flag=CommonMethods.clickIfEnable(IAddPatient.CHK_NoCvg);
	 			stepInfo="Preferred Provider"; 
	 			flag=CommonMethods.selectFromList(IAddPatient.TXT_PrefProvider, PrefProvider);
	 			stepInfo="Relationship to Responsible Party";
	 			flag=CommonMethods.selectFromList(IAddPatient.DRPDWN_RelToRes, RelToRes);
	 			stepInfo="Referal Type";
	 			flag=CommonMethods.selectFromList(IAddPatient.DRPDWN_ReferralType,RefType );
	 			stepInfo="GoToResponsibleParty";
	 			flag=CommonMethods.clickIfEnable(IAddPatient.BTN_GoToResponsibleParty);
	 			
	 			stepInfo="SelectResponsbilePartyType";
	 			flag=CommonMethods.clickIfEnable(IAddPatient.RADIOBTN_SelectResonsiblePartyType);
	 			stepInfo="SelectResponsibleParty";
	 			flag=CommonMethods.selectFromList(IAddPatient.DRPDWN_SelectResponsibleParty,cmbRespParty );
	 			
	 			stepInfo="AddMedicalInformation";
	 			flag=CommonMethods.clickIfEnable(IAddPatient.BTN_AddMedicalInformation);
	 			
	 			stepInfo="EnterMedicalInformation";
	 			flag=CommonMethods.clickIfEnable(IAddPatient.CHK_premedicate);
	 			flag=CommonMethods.clickIfEnable(IAddPatient.CHK_asthma);
	 			flag=CommonMethods.clickIfEnable(IAddPatient.CHK_coumadin);

	 			stepInfo="EnterDentalQuestionnaireData";
	 			flag=CommonMethods.clickIfEnable(IAddPatient.BTN_DentalQuestionnaire);
	 			//flag=CommonMethods.sendText(IAddPatient.TXT_DentalPhone,phone);
	 			flag=CommonMethods.selectFromList(IAddPatient.SLC_Tobacco,"No"); 
	 			
	 			stepInfo="Go to Add Recall Information";
	 			flag=CommonMethods.clickIfEnable(IAddPatient.BTN_AddRecallInformation);
	 			flag=CommonMethods.clickIfEnable(IAddPatient.BTN_Finish);			
	 			 
	 		} catch (Exception e) { 
	 			// TODO Auto-generated catch block 
	 			e.printStackTrace(); 
	 		}
	 	}
}
