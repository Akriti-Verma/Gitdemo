package step_Definition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_Factory.LoginPages;

public class Login {
    WebDriver driver = new ChromeDriver();
    LoginPages loginPage=PageFactory.initElements(driver, LoginPages.class);
    //LoginPages loginPage = new LoginPages(driver);

    @Given("User is on Login Page")
    public void user_is_on_login_page() {
        driver.get("https://www.facebook.com/");
    }

    @When("User enters username {string}")
    public void user_enters_username(String username) {
    	loginPage.enterUsername(username);
    }

    @When("User enters password {string}")
    public void user_enters_password(String password) {
    	loginPage.enterPassword(password);
    }

    @When("User clicks on login button")
    public void user_clicks_on_login_button() {
    	loginPage.clickLogin();
    }

    @Then("User is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
    	
    }


}
