package com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\Feature"},glue= {"com\\StepDefinition"}, dryRun = false,
monochrome =true, strict =true, plugin = {"html:Reports","json:Reports//output.json"})
public class TestRunner {

}
