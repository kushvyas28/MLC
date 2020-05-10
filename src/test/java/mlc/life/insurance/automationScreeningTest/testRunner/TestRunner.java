package mlc.life.insurance.automationScreeningTest.testRunner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src\\test\\java\\mlc\\life\\insurance\\automationScreeningTest\\features",
        glue = {"mlc.life.insurance.automationScreeningTest.stepDefinition"},
        tags = "@Exercise1"
        //tags = "@Exercise2"
        //tags = "@Exercise3"
)

public class TestRunner {

}
