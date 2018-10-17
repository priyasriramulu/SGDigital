package Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.webdriver.stubs.AlertStub;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;

import Steps.HomePageSteps;


public class AccountPage extends PageObject
{

	
	@FindBy(id="payment_plan_id")
	WebElementFacade PlanType;
	
	@FindBy(name="first_name")
	WebElementFacade ele_Fname;
	
	@FindBy(name="surname")
	WebElementFacade ele_Lname;
	
	@FindBy(name="email")
	WebElementFacade ele_email;
	
	@FindBy(name="email_confirm")
	WebElementFacade ele_email_confirm;
	
	@FindBy(name="username")
	WebElementFacade ele_username;
	
	@FindBy(name="password")
	WebElementFacade ele_password;
	
	@FindBy(name="passwordconfirm")
	WebElementFacade ele_cnf_password;
	
	@FindBy(name="agreeTerms")
	WebElementFacade agreeterms;
	
	@FindBy(id="submitButton")
	WebElementFacade SubmitBtn;
	
	@FindBy(css = ".help-block")
	WebElementFacade helpblock;
	
	@FindBy(css = "#company_name")
	WebElementFacade CompName;
	
	@FindBy(css = "#phone")
	WebElementFacade CompPhone;
	
	@FindBy(css = "#fax")
	WebElementFacade CompFax;
	
	@FindBy(css = "#company_email")
	WebElementFacade CompEmail;
	
	@FindBy(css = "#service")
	WebElementFacade CompDesc;
	
	@FindBy(css = "#address")
	WebElementFacade CompAddr;
	
	@FindBy(css = "#city")
	WebElementFacade CompCity;
	
	@FindBy(css = "#state")
	WebElementFacade CompState;
	
	@FindBy(css = "#postcode")
	WebElementFacade CompPostcode;
	
	@FindBy(name = "country")
	WebElementFacade CompCountry;
	
	@FindBy(name = "copy_address" )
	WebElementFacade chkbox;
	
	@FindBy(name = "btnSubmit")
	WebElementFacade btnContinue;
	
	@FindBy(css =".help-block")
	WebElementFacade validate;
	
	public void verplantype()
	{
		PlanType.selectByVisibleText("Free Edition");
		assertThat(PlanType.getSelectedVisibleTextValue(),is("Free Edition"));
		
	}
	public void InputFields(String plantype2, String fname2, String lname2, String email, String cnfemail, String username, String password, String cnfpassword)
	{
		System.out.println("acc page Plan type:"+plantype2);
		
		PlanType.selectByVisibleText(plantype2);
		assertThat(PlanType.getSelectedVisibleTextValue(),is("Free Edition"));
		ele_Fname.sendKeys(fname2);
		ele_Lname.sendKeys(lname2);
		ele_email.sendKeys(email);
		//System.out.println("the text is"+validate.getText());
		ele_email_confirm.sendKeys(cnfemail);
		//div.form-group:nth-child(6) > small:nth-child(4)
		//div.form-group:nth-child(7) > small:nth-child(4)
		//html.js.flexbox.flexboxlegacy.canvas.canvastext.webgl.no-touch.geolocation.postmessage.no-websqldatabase.indexeddb.hashchange.history.draganddrop.websockets.rgba.hsla.multiplebgs.backgroundsize.borderimage.borderradius.boxshadow.textshadow.opacity.cssanimations.csscolumns.cssgradients.no-cssreflections.csstransforms.csstransforms3d.csstransitions.fontface.generatedcontent.video.audio.localstorage.sessionstorage.webworkers.applicationcache.svg.inlinesvg.smil.svgclippaths.skrollr.skrollr-desktop body section div.text_normal form#multipleForm.form-horizontal.bv-form div.form-group.has-feedback.has-error small.help-block
		ele_username.sendKeys(username);
		ele_password.sendKeys(password);
		ele_cnf_password.sendKeys(cnfpassword);
		agreeterms.click();
		
		//assert.ass
		if (SubmitBtn.isEnabled())
			SubmitBtn.click();
		
		
	}
	public void Username_exist()
	{
		//alert window is found. Click on OK button
		//This block will add the alert window for the username that already exist in the database.
	}
	
	public void company_signin(String comp_name, String comp_phone, String comp_email, String comp_fax,
			String comp_desc, String comp_city, String comp_state, String comp_postcode, String comp_country)
	{
		try
		{
			if (getAlert().getText().contains("This username is already in use by another user. Please select a different username."))
			{
				System.out.println("Alert: "+getAlert().getText());
				getAlert().accept();
				return;	
			}
			
		}
		catch(NoAlertPresentException Ex)
		{
			System.out.println("no alert window found");
		}
		
		
		//withTimeoutOf(10, TimeUnit.SECONDS).waitFor(CompName).isVisible();
		//company_signin_name_;
		System.out.println("am here in company signin page");
		System.out.println("comp_name:"+comp_name);
		System.out.println("comp_phone:"+comp_phone);
		System.out.println("comp_email:"+comp_email);
		CompName.sendKeys(comp_name);
		CompPhone.sendKeys(comp_phone);
		CompEmail.sendKeys(comp_email);
		
		CompFax.sendKeys(comp_fax);
		CompDesc.sendKeys(comp_desc);
		CompCity.sendKeys(comp_city);
		CompState.sendKeys(comp_state);
		CompPostcode.sendKeys(comp_postcode);
		CompCountry.sendKeys(comp_country);
		chkbox.click();
		btnContinue.click();
	}
	
	public void Invalid_Email()
	{
		
	}
	
	public void emails_not_Same()
	{
		
	}
	
	public void passwords_not_same()
	{
		
	}
	
	
}
