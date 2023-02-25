package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverManager;
import utils.TestData;

public class HomePage {

    private final WebDriver driver;

    public HomePage() {
        this.driver = DriverManager.getDriver();
        PageFactory.initElements(this.driver, this);
    }

    public void goToHomePage() {
        driver.get(TestData.getBaseUrl());
    }

    public boolean isAt() {
        return driver.getTitle().equals("Swag Labs");
    }
}
