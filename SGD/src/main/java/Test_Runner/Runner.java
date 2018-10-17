package Test_Runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;


import com.vimalselvam.cucumber.listener.Reporter;

import java.io.File;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/main/java/Feature/Login.Feature" , glue={"HomePageStepDefinitions"},//the path of the step definition files
monochrome = true, plugin = {"pretty:STDOUT","html:C:\\Users\\AU0003A7\\My Workspace\\SGD\\target\\Reporter\\cucumber-pretty",
		 "json:C:\\Users\\AU0003A7\\My Workspace\\SGD\\target\\Reporter\\cucumber.json"},
	//	"com.cucumber.listener.ExtentCucumberFormatter:C:\\Users\\AU0003A7\\My Workspace\\SGD\\target\\Reporter\\report.html"},
strict = true)
public class Runner
{
	@AfterClass
	public static void writeExtentReport() 
	{
		Reporter.loadXMLConfig(new File("src/java/resources/extent-config.xml"));
	}
}
	