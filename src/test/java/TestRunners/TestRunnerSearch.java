package TestRunners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
//        features = "src/test/java/AppFeatureList/Search.feature",
//       features = "src/test/java/AppFeatureList/Uber.feature",
//        features = "src/test/java/AppFeatureList/Order.feature",
//        features = "src/test/java/AppFeatureList/Registration.feature",
        features = "src/test/java/AppFeatureList/Login.feature",
        glue = {"StepDefinitions", "Hooks"},
//        tags = "@All",
//        tags = "@Smoke or @Regression",
        plugin = {"pretty", "json:target/MyReports/report.json",
                        "junit:target/MyReports/report.xml"
       }
)
public class TestRunnerSearch {

}
