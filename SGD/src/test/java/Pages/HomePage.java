package Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://www.freecrm.com/index.html")
public class HomePage extends PageObject
{
	 
	@FindBy(css = "#navbar-collapse")
	private WebElementFacade burgermenu;
	
	@FindBy(css = ".nav > li:nth-child(2) > a:nth-child(1) > font:nth-child(1)")
	private WebElementFacade MenuSignup;
	
	//@FindBy(css = "#li_myaccount .dropdown-menu .go-text-right[href*='Login']")
	//private WebElementFacade MenuLogin;
		
	@FindBy(css = "#payment_plan_id")
	private WebElementFacade plantype;
	
	@FindBy(css = "div.form-group:nth-child(4) > input:nth-child(1)")
	private WebElementFacade Fname;
	
	public void verifyburgermenu()
	{
		burgermenu.shouldBeVisible();
		burgermenu.shouldBePresent();
	}
	
	public void verifyMenuSignup()
	{
		MenuSignup.shouldBePresent();
	}	
	public void clickMenuSignup()
	{
		MenuSignup.click();
	}
	/*public void verifyMenuLogin()
	{
		MenuLogin.shouldBeVisible();
		MenuLogin.shouldBePresent();
	}
	public void clickMenuLogin()
	{
		MenuLogin.click();
	}*/
	public void verifyregisterpage()
	{
		
	}
	
}
