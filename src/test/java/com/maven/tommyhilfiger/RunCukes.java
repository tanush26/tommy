package com.maven.tommyhilfiger;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",dryRun = false,strict = true,tags = "@coats",
plugin = {"json:target/cucumber.json","junit:target/cucumber-report.xml","html:target/cucumber-report.html",
"usage:target/cucumber.json","pretty:target/cucumber-pretty.txt"})
public class RunCukes {


}
