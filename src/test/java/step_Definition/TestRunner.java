package step_Definition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "D:\\Akruti\\BDD_With_PageFactory\\Feature\\Login.feature",
    glue = "step_Definition",
    plugin = {"pretty", "html:target/cucumber-reports"}
)
public class TestRunner {

}
