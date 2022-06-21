package page.object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePagePage extends Base{

	public HomePagePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement retailWebsite; //create a display method
	
	@FindBy(xpath = "//span[normalize-space()='Currency']")
	private WebElement clickCurrency;
	
	@FindBy(xpath = "//button[@name='EUR']")
	private WebElement clickEUR;
	
	@FindBy(xpath ="//strong[contains(text(),'€')]")
	private WebElement EURDisplayed;
	
	@FindBy(xpath = "//span[@id = 'cart-total']")
	private WebElement clickShoppingCart;
	
	@FindBy(xpath = "//p[text()='Your shopping cart is empty!']")
	private WebElement emptyisDisplayed;
	
	public boolean isLogoDisplayed() {
		if (retailWebsite.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void clickCurrency() {
		clickCurrency.click();
	}
	
	public void clickEUR() {
		clickEUR.click();
	}
	
	public boolean EURDisplayed() {
		if(EURDisplayed.isDisplayed())
			return true;
		else 
			return false;
	}
	
	public void clickShoppingCart() {
		clickShoppingCart.click();
	}
	
	public boolean emptyisDisplayed(String empty) {
		if(emptyisDisplayed.isDisplayed())
			return true;
		else
			return false;
	}
	
}