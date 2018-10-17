package Step_Definition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.DataTable;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserStory2_StepDefinition extends Reusable
{
	
	//UserStory2
	
		//public WebDriver driver ;
	    WebDriver driver = getDriver();
	    String Filter_Classname;
	    WebDriverWait wait = new WebDriverWait(driver, 30);
	    
		@Given("^User is on Careers Page$")
		public void user_is_on_Careers_Page() throws Throwable {
		 	
			Assert.assertEquals(driver.getTitle(), "Careers | SG Digital");
			
		}

		@Then("^there is free text filter field is available$")
		public void list_of_open_vacancies_are_listed() throws Throwable {
		    //
			// Locate all input tags on the page
			List<WebElement> ele = driver.findElements(By.cssSelector("input")); 

			// Now iterate through them and check for our desired match
			for (WebElement anElement : ele) {
			    if (anElement.getAttribute("value").equals("Filter by title, expertise")) {
			        			    	
			    		Filter_Classname = anElement.getAttribute("class");
			    	
			    }
			    
			}
		}

		@Then("^I give input in search field$")
		public void i_give_valid_by_Search_button(DataTable arg1) throws Throwable 
		{
				
		    	driver.findElement(By.id("cn-accept-cookie")).click();
			    wait.until(ExpectedConditions.invisibilityOfAllElements(driver.findElement(By.id("cn-accept-cookie"))));
			    wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(" //input[@value='Search'and @type='button' and @class='srSearchButton']"))));
		   
			List<String> data = arg1.asList(String.class);
			for (int i=0;i<arg1.raw().size();i++)
			{
				
		    driver.findElement(By.xpath(" //input[@class='srSearchInput'and @type='text']")).sendKeys(data.get(i));
		   			
			driver.findElement(By.xpath(" //input[@class='srSearchInput'and @type='text']")).sendKeys(Keys.ENTER);

		    
			}
		}
		
		@Then("^I give valid input by Search button$")
		public void i_check_for_result() throws Throwable 
		{
			driver.findElement(By.xpath(" //input[@class='srSearchInput'and @type='text']")).clear();	
			
			 driver.findElement(By.xpath(" //input[@class='srSearchInput'and @type='text']")).sendKeys("test");
			    driver.findElement(By.xpath(" //input[@value='Search'and @type='button' and @class='srSearchButton']")).click();
		    
		}
		
		
		@When("^Filter by location$")
		public void the_specific_location_is_given() throws Throwable {
			driver.findElement(By.xpath(" //input[@class='srSearchInput'and @type='text']")).clear();			 
			driver.findElement(By.xpath(" //input[@class='srSearchInput'and @type='text']")).sendKeys(Keys.ENTER);
			
			driver.findElement(By.id("facet_location")).click();
			WebElement countryUL= driver.findElement(By.id("facet_location"));
			List<WebElement> countriesList=countryUL.findElements(By.tagName("li"));
			
			WebElement element;
			for (int i=0;i<countriesList.size();i++) 
			{
				
				 element = countriesList.get(i);  //1
				 
				 
				if (element.getAttribute("innerText").equals("Chicago")) {
					//wait.until(ExpectedConditions.elementToBeClickable(element));
					 element.click();	
					 wait.until(ExpectedConditions.visibilityOf(element));
					 wait.until(ExpectedConditions.visibilityOfAllElements(element));
					 
					 break;
								
				   }
				
				
					
			}
			//driver.close();
		}
		
		
		
}
