package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
					features= {"./FeatureFiles"},
					glue="stepDefenitions",
					plugin= {"pretty", "html:reports/myreport.html", 
							  "rerun:target/rerun.txt",
							  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
							},
	
					dryRun=false,    
					monochrome=true,    
					publish=true   
//					,tags="@regression",
//					,tags="@sanity"
//					,tags="@regression or @sanity"
					,tags="not @sanity and not @regression"
		)
public class TestRunner {

		}
