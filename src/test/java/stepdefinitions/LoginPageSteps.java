package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.HomePage;
import pages.LoginPage;
import utils.DriverManager;
import utils.TestData;

public class LoginPageSteps {

    private final WebDriver driver = DriverManager.getDriver();
    private final LoginPage loginPage = new LoginPage();
    private final TestData testData = new TestData();

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        driver.get(TestData.getBaseUrl());
        boolean isUsernameVisible = loginPage.isUsernameInputVisible();
        Assert.assertTrue(isUsernameVisible, "Username input box is not visible");
        boolean isPasswordVisible = loginPage.isPasswordInputVisible();
        Assert.assertTrue(isPasswordVisible, "Password input box is not visible");
    }

    @When("I enter my username and password")
    public void i_enter_my_username_and_password() {
        loginPage.enterEmail(testData.getUsername());
        loginPage.enterPassword(testData.getPassword());
    }

    @And("I click the login button")
    public void i_click_the_login_button() {
        loginPage.clickLoginButton();
    }

    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
        boolean pageTitle = loginPage.isAt();
        Assert.assertTrue(pageTitle, "Login was not successful");
    }


}
