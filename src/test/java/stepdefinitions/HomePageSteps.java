package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.HomePage;
import pages.LoginPage;
import utils.DriverManager;

public class HomePageSteps {

    private final WebDriver driver = DriverManager.getDriver();
    private final HomePage homePage = new HomePage();
    private final LoginPage loginPage = new LoginPage();

    @Given("User launch the web app URL")
    public void user_launch_the_web_app_url() {
        homePage.goToHomePage();
    }

    @When("User is on the landing page")
    public void user_is_on_the_landing_page() {
        boolean homePageTitle = homePage.isAt();
        Assert.assertTrue(homePageTitle, "Home page title is not correct");
    }

    @Then("Username and password input box are available")
    public void username_and_password_input_box_are_available() {
        boolean userNameVisibility = loginPage.isUsernameInputVisible();
        Assert.assertTrue(userNameVisibility, "Username input NOT visible");
        boolean passwordVisibility = loginPage.isPasswordInputVisible();
        Assert.assertTrue(passwordVisibility, "Password input is NOT visible");
    }

}
