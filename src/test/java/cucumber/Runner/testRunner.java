package cucumber.Runner;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="FeatureFile//SAPTwo.feature", //the path of the feature file
		glue= {"cucumber.BDD"}, //path/package name of the setpDefinition file 
		dryRun = false, // to check if mapping is proper between feature and setpDefinition file
		monochrome = true, // to display the output pretty/proper readable format
		strict = true, //will check if any step is not defined in stepDefinition file
		plugin= {"pretty","html:test_output","json:json_output/cucumber.json"}
		//tags = {"@Login"}
		)
public class testRunner {

}
