package skeleton;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions(features="src/main/resources/feature3.feature",
plugin="html:target/htmlreport")

public class runner {

}
