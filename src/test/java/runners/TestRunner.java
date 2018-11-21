package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "C:\\Users\\user\\eclipse-workspace\\Cosco_BDD_FrameWork\\src\\test\\resources\\features"
				, glue= {"stepFiles"})

public class TestRunner {

}
