package Step_Definition;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;



public class UserStory1_StepDefinition extends Reusable
{
	
	// add the code to initialize the web driver
	
	
	String str = "careers";	
	String str2 = "Careers";
	String a;
	String linkfound, linktext, gettext;
	//System.setProperty("webdriver.gecko.driver","C:\\Users\\AU0003A7\\My Workspace\\SG_Digital_Automation\\Drivers\\geckodriver.exe");
	
	WebDriver driver = getDriver();
	
	@Given("^User is on the Home Page$")
	public void user_is_on_the_Home_Page() {
		
		driver.get("https://www.sgdigital.com/");
	}

	@Then("^TC01 menu text is displayed on top of the page$")
	public void the_menu_text_is_displayed_on_top_of_the_page()
	{
		
		
	    // Write code here that turns the phrase above into concrete actions
		List<WebElement> links = driver.findElements(By.tagName("a"));
		Iterator<WebElement> i = links.iterator();
		
		while(i.hasNext())
		{
			WebElement link = (WebElement) i.next();
			if(link.getAttribute("href").contains(str))
			{
				//To check if the menu is shown in home page
				System.out.println("Link contains"+link.getAttribute("href"));
				linkfound = link.getAttribute("href");
				linktext = link.getAttribute("innerText");
				//gettext = link.getText();
				System.out.println("Text: "+linktext);
				
				break;
			}	
		}
		
		
	}
	
	@Then("^TC02 the text is shown as Careers$")
	public void the_text_is_shown_as() throws Throwable {
	    // To verify if the display text is correct
	System.out.println("Text: "+linktext);
	Assert.assertEquals(linktext, str2);
	}

@Then("^TC03 Click on Menu$")
public void click_on_Menu() throws Throwable {
    
	driver.findElement(By.linkText(linktext)).click();
	Careerurl = driver.getCurrentUrl();
	Assert.assertEquals(driver.getTitle(), "Careers | SG Digital");
}
}

	
	
