package page.object;
 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
import core.Base;
 
public class LoginPage extends Base {
    
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(id = "input-email")
    private WebElement emailInput;
    
    @FindBy(id = "input-password")
    private WebElement passwordInput;
    
    @FindBy(xpath ="//input[@value='Login']")
    private WebElement loginButton;
    
    @FindBy(xpath = "//a[@class='list-group-item']")
    private WebElement myAccountText;
    
    public void enterEmail(String emailValue) {
        emailInput.sendKeys(emailValue);
    }
    
    public void enterPassword(String passwordValue) {
        passwordInput.sendKeys(passwordValue);
    }
    
    public void clickOnLoginButton() {
        loginButton.click();
    }
    
    public boolean myAccountTextIsPresent() {
        if(myAccountText.isDisplayed())
            return true;
        else 
            return false;
    }
 
    
}