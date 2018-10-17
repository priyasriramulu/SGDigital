package Steps;

import org.openqa.selenium.Alert;


import Pages.AccountPage;
import Pages.HomePage;
import net.thucydides.core.annotations.Step;

public class AccPageStep 
{
	AccountPage Accpage;

	String Acc_Page_Url;
	@Step
	public void verifyAccPage()
	{
		Accpage.getTitle();
		Acc_Page_Url = Accpage.getDriver().getCurrentUrl();
		System.out.println("Account Page Title is"+Accpage.getTitle());
	}
	@Step
	public void selectplantype()
	{
		//Accpage.selectplantype();
	}
	@Step
	public void InputFields(String plantype, String fname, String lname, String email, String cnfemail, String username, String password, String cnfpassword)
	{
		Accpage.InputFields(plantype,fname,lname,email,cnfemail,username,password,cnfpassword);
		
	}
	@Step
	public void CompanyDetails(String comp_name, String comp_phone, String comp_email, String comp_fax,
			String comp_desc, String comp_city, String comp_state, String comp_postcode, String comp_country) 
	{
		// TODO Auto-generated method stub
		System.out.println("company name:" +comp_name);
		
		
		Accpage.company_signin(comp_name,comp_phone,comp_email,comp_fax,comp_desc,comp_city,comp_state,comp_postcode,comp_country);
	}
}
