package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

// informar que vamos utilizar o Cucumber
@RunWith(Cucumber.class)
// informar algumas opções de execução
@CucumberOptions(
        plugin = {"json:target/reports/cucumberReport.json", "html:target/reports/"},
        features = "src/test/resources/features",
        glue = {"steps"},
        tags = {"@login"}
)
public class RunCucumber extends RunBase {

    @AfterClass
    public static void stop() {
        getDriver().quit();

    }

}
