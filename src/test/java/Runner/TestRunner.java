package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features= "src/test/java/Resources",
        glue = {"com.standardsaustralia.homeEnquiry.stepDefs"},
        plugin = {"pretty","html:report","json:report//cucumber.json","junit:report//cucumber.xml"},
        dryRun =false,
        strict=true,
        monochrome =true
         
        )
public class TestRunner {
    
}