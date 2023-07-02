package runners;

        import io.cucumber.testng.AbstractTestNGCucumberTests;
        import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/StudentLogin.feature"},
        glue = {"StepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "json:target/cucumber/cucumber.json"},
        dryRun = false
)
public class TestRunnerStudentLogin extends AbstractTestNGCucumberTests {
}