package Step_Definition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Reusable {

	protected static WebDriver driver;
	String  Careerurl;
	protected WebDriver getDriver() 
	{
		if(driver == null)
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\AU0003A7\\My Workspace\\SG_Digital_Automation\\Drivers\\geckodriver.exe");
		 driver = new FirefoxDriver();
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\AU0003A7\\My Workspace\\SG_Digital_Automation\\Drivers\\geckodriver.exe");
		
		}
		 return driver;
	}
	
}
