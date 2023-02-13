package TestRunners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/AppFeatureList/Search.feature", "src/test/java/AppFeatureList/Uber.feature"},
        glue = {"StepDefinitions"},
        plugin = {"pretty"}

)
public class TestRunnerSearch {


}
