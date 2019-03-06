package org.andestech.learning.rfb19.g3;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

@RunWith(Cucumber.class)
@CucumberOptions (
        monochrome = false,
        features = "src/test/resources/features",
        plugin = {"pretty", "html:target/cucumber-html-report"},
        glue = "org.andestech.learning.rfb19.g3",
        strict = false
        ,tags = "@summa"

//        ,
//        tags = {"@дизайнТест"}
)
public class RunnerTest extends AbstractTestNGCucumberTests{

    @BeforeClass
    public void init(){
        System.out.println("+++ Runner init: " + this);
    }


    @AfterClass
    public void teardown(){
        System.out.println("--- Runner quit: " + this);
    }

}
