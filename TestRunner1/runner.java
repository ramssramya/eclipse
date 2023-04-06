package TestRunner1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=".//Feature1/login.feature",
glue="StepDefinition1",
dryRun=false,
monochrome=true)

public class runner {

}
