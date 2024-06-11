package page_Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import step_Definition.Login;

public class LoginPages {

	  WebDriver driver;
 
  public LoginPages(WebDriver driver1) {
      this.driver =driver1;
     // PageFactory.initElements(driver, this);

  }

  @FindBy(id = "email")
  WebElement username;

  @FindBy(id = "pass")
  WebElement password;

  @FindBy(name = "login")
  WebElement loginButton;
  
  
  
  public void enterUsername(String user) {
      username.sendKeys(user);
  }

  public void enterPassword(String pass) {
      password.sendKeys(pass);
  }

  public void clickLogin() {
      loginButton.click();
  }
}
