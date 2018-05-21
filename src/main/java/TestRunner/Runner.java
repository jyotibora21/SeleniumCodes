package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"C:\\Users\\boraajyo\\Documents\\Wkspc\\WebDriverTestCucumber\\src\\main\\java\\FeatureFile"},
		glue={"StepDefinition"},plugin={"html:target/cucumber-html-report","json:target/cucumber.json","pretty:target/pretty.text"},dryRun=false,
		monochrome =true
		)
		
public class Runner {
	
	
}
