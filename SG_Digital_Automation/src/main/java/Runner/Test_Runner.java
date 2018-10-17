package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features = { "C:\\Users\\AU0003A7\\My Workspace\\SG_Digital_Automation\\src\\main\\java\\Features\\UserStory1.Feature","C:\\\\Users\\\\AU0003A7\\\\My Workspace\\\\SG_Digital_Automation\\\\src\\\\main\\\\java\\\\Features\\\\UserStory2.Feature"}, //the path of the feature files
		//tags = {"@UserStory1,@UserStory2"},
		glue={"Step_Definition"},//the path of the step definition files
				monochrome = true, 
		strict = true //it will check if any step is not defined in step definition file
)
	
public class Test_Runner 
{

}
