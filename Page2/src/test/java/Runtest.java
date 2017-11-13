import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(format = {"html:output"},
        features = "src/test/Resources",
        tags={"@test1"})

public class Runtest {
}
