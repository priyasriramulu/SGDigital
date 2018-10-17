package HomePageStepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.support.ui.ExpectedConditions;

import com.openhtmltopdf.css.newmatch.Matcher;

import Steps.AccPageStep;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Steps;

public class AccStepDefinitions 
{
	@Steps
	AccPageStep AccPageStep;
	Matcher matcher;
	
		
	@Then("^I can see Account creation page$")
	public void i_can_see_Account_creation_page(DataTable arg1) throws Throwable
	{
		AccPageStep.verifyAccPage();
	    System.out.println("am here");
	    List<String> data = arg1.asList(String.class);
	    System.out.println("Data: "+data.get(0));
	    
	}


	@Then("^I input the fields$")
	public void I_input_the_fields(DataTable arg1)  
	{
	    List<Map<String,String>> datalist = arg1.asMaps(String.class,String.class);
	
	    
	    System.out.println("am in Account step");
	    System.out.println("Size:"+arg1.raw().size());
	    String Plantype,Fname,Lname,email,username,cnfemail,password,cnfpassword,comp_name,comp_phone,comp_email,comp_fax,comp_desc,comp_city,comp_state,comp_postcode,comp_country;
	    System.out.println(datalist.get(0).get("Firstname"));
	    System.out.println(datalist.get(0).get("Lastname"));
	      
	    for(int i=0;i<arg1.raw().size()-1;i++)
	    {
	    	Plantype = datalist.get(i).get("PlanType");
	    	Fname = datalist.get(i).get("Firstname");
	    	Lname = datalist.get(i).get("Lastname");
	    	email = datalist.get(i).get("Email");
	    	cnfemail = datalist.get(i).get("Confirm Email");
	    	username = datalist.get(i).get("Username");
	    	password = datalist.get(i).get("Password");
	    	cnfpassword = datalist.get(i).get("ConfirmPassword");
	    	comp_name = datalist.get(i).get("company_name");
	    	comp_phone = datalist.get(i).get("company_phone");
	    	comp_email = datalist.get(i).get("company_email");
	    	comp_fax = datalist.get(i).get("company_fax");
	    	comp_desc = datalist.get(i).get("company_desc");
	    	comp_city = datalist.get(i).get("city");
	    	comp_state = datalist.get(i).get("state");
	    	comp_postcode = datalist.get(i).get("postcode");
	    	comp_country = datalist.get(i).get("country");
	    	System.out.println("Company name:" +comp_name);
	    	System.out.println("Company email:"+comp_email);
	    	
	    	AccPageStep.InputFields(Plantype,Fname,Lname,email,cnfemail,username,password,cnfpassword);
	    	
	    	AccPageStep.CompanyDetails(comp_name,comp_phone,comp_email,comp_fax,comp_desc,comp_city,comp_state,comp_postcode,comp_country);
	    }
	}
	
	
	
	
}
