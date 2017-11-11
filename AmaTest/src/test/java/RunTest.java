import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import pages.Hooks;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"html:output"},
        features = "src/test/resources/Homepage.feature/",dryRun = false,
        tags = "@prime"
)



public class RunTest extends Hooks {
}
