package org.test.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\hp\\eclipse-workspace\\Cucumber\\src\\test\\resources\\AdactinLogin.feature",
glue= {"org.step"})
public class TestRunner {

}
