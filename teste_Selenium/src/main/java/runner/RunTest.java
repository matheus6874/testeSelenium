package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", 
				 glue = "steps", 
				 tags = "@CT01")
public class RunTest {
	
}
