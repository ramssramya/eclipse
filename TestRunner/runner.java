package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=".//Features/login.feature",
glue="StepDefnition",
dryRun=false,
monochrome=true)
public class runner{

}
