package com.cybertek.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\resources\\features" ,//feature file's content root path
        glue = "com\\cybertek\\step_definitions" //where we implement our code. we will implement our codes in step definitions so we need to get its source path
)
public class CukesRunner {
    ///cccc


}
