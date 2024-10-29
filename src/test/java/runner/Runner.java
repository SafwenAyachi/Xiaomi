package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features ="src/test/resources/Features/Panier.feature",
		glue = "testSuites",
		plugin = {"pretty","html:target/cucumber-reprot.html"}
		
		
)



public class Runner {

}
