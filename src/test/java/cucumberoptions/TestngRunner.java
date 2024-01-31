package cucumberoptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",glue="stepdefinition",monochrome=true)
public class TestngRunner extends AbstractTestNGCucumberTests{
	

}
