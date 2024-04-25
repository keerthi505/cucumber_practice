package testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"features"},//where feature file is located
        glue={"steps"},//where step def file is located
        plugin = {"pretty","junit:report3"},//what kind of report we need
        dryRun=true,
        //it just finds out if there are any sc
        //scenarios without stepdef
        monochrome = true,
        tags= "@P3" //to run a specific scenario with a particular tag
        //we can have multiple tags

        //strict=true//it compulsory to add step-defitions to all scenarios in feature file

        //name={"Logo"}//pickup scenarios which contain this keyword in the
        //scnerio name

)
public class TestRunner {
}
