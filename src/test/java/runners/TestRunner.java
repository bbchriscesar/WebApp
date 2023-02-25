package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.*;
import utils.DriverManager;

@CucumberOptions(
        features = "src/test/resources/features/",
        glue = {"stepdefinitions"},
        tags = "@homepage or @login-page",
        plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class TestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider()
    public Object[][] scenarios() {
        return super.scenarios();
    }

    @AfterMethod
    public void afterMethod() {
        DriverManager.quitDriver();
    }
}