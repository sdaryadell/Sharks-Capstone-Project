package page.object;
 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
import core.Base;
 
public class HomePage extends Base {
/* In this class we will store all UI Elements that belongs to Home page of this application. */
/* We will use PageFactory Class to initialize the UI elements we store in this class. PageFactory class provides a method called .initElements and this method job is to initialize all UI (User Interface) Elements. */
 
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

// @FindBy annotation is == driver.findElement()

	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement logo;

	@FindBy(xpath = "//input[@name='search']")
	private WebElement searchbar;

	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccount;

	@FindBy(xpath = "//a[text()='Register']")
	private WebElement register;

	@FindBy(xpath = "//a[text()='Login']")
	private WebElement login;

	public boolean isLogoDisplayed() {
		if (logo.isDisplayed())
			return true;
		else
			return false;
	}

	public void searchInput(String value) {
		searchbar.sendKeys(value);
	}

	public void clickOnMyAccount() {
		myAccount.click();
	}

	public void clickOnRegister() {
		register.click();
	}

	public void clickOnLogin() {
		login.click();
	}
 

}