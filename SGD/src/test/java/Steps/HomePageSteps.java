package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.core.annotations.Step;

public class HomePageSteps 
{
	HomePage homepage;
	public WebDriver firefox;
	JavascriptExecutor js = ((JavascriptExecutor) firefox);
	
	@Step
	public void OpenWebsite()
	{
		
		WebDriverManager.firefoxdriver().setup();
	//	ChromeOptions chromeoptions = new ChromeOptions();
		firefox = new FirefoxDriver();
		
		homepage.setDriver(firefox);
		homepage.getDriver().manage().deleteAllCookies();
		homepage.open();
		
	}
	
	@Step
	public void verifyburgermenu()
	{
		homepage.verifyburgermenu();
	}
	
	@Step
	public void clickMenuSignup()
	{
		homepage.verifyMenuSignup();
		WebDriverWait Wait = new WebDriverWait(firefox, 30);
		Wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("preloader")));
		homepage.clickMenuSignup();
	}
	
}
