package HomePageStepDefinitions;

import java.util.List;
import java.util.Map;

import Steps.HomePageSteps;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class HopePageStepDefinitions 
{
	@Steps
	HomePageSteps homesteps;
	
	
	
	@Given("^User on the home page$")
	public void user_on_the_home_page()
	{
		homesteps.OpenWebsite();
	}
	
	
	
	
	@When("^click on Sign Up Menu$")
	public void clickonSignUpMenu()
	{
		homesteps.clickMenuSignup();
	}
	
/*	@When("^I input the fields$")
	public void I_Input_the_Fields(DataTable arg1) 
	{
	    List<Map<String, String>> datalist = arg1.asMaps(String.class, String.class);
	    System.out.println("am in Account step");
	    for(int i=1;i<datalist.size();i++)
	    {
	    	System.out.println(datalist.get(i).get("PlanType"));
	    	System.out.println(datalist.get(i).get("Firstname"));
	    	System.out.println(datalist.get(i).get("Lastname"));
	    	System.out.println(datalist.get(i).get("Email"));
	    	System.out.println(datalist.get(i).get("Confirm Email"));
	    	System.out.println(datalist.get(i).get("Username"));
	    	System.out.println(datalist.get(i).get("Password"));
	    	System.out.println(datalist.get(i).get("ConfirmPassword"));
	    }
	}*/
	
	
	
	
}
