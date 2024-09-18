package testrunners;
import org.testng.annotations.Test;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@Test
@CucumberOptions(
		features = {"src/test/resources/features/bookingcom.feature"},
		glue = {"Steps", "ApplicationHooks"},
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/"			
		}	
	)

public class TestNGRunner extends AbstractTestNGCucumberTests {

}