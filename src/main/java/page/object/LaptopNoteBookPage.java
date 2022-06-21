package page.object;

import java.util.concurrent.TimeoutException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopNoteBookPage extends Base{

	public LaptopNoteBookPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[normalize-space()='TEST ENVIRONMENT']")
	private WebElement retailWebsite;

	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement clickLaptopsNotebooks;
	
	@FindBy(xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement clickShowAllLaptops;
	
	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement clickMacBookItem;//done
	
	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement clickAddtoCartButton;//done
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessageIsDisplayed;//done
	
	@FindBy(xpath = "//span[text()=' 1 item(s) - $602.00']")
	private WebElement itemDisplayedonCart;//done
	
	@FindBy(xpath ="//*[@id=\"cart\"]/button")
	private WebElement clickOnCart;//done
	
	@FindBy(xpath = "//button[@title='Remove']")
	private WebElement clickOnXButton;//done
	
	@FindBy(xpath = "//*[@id=\"cart-total\"]")
	private WebElement itemRemovedDisplayed;//done
	
	@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[2]/div/div[2]/div[2]/button[3]")
	private WebElement clickMacBookComparisonButton;//done
	
	@FindBy(xpath ="//*[@id=\"content\"]/div[4]/div[3]/div/div[2]/div[2]/button[3]")
	private WebElement MacBookAirComparisonButton;//done
	
	@FindBy(xpath ="//*[@id=\"product-category\"]/div[1]/a[2]")
	private WebElement clickProductComparison;//done
	
	@FindBy(xpath = "//strong[normalize-space()='Product Details']")
	private WebElement comparisonChartDisplayed;//done
	
	@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[4]/div/div[2]/div[2]/button[2]")
	private WebElement clickSonyVAIOHeart;//done
	
	@FindBy(xpath ="//*[@id=\"product-category\"]/div[1]")
	private WebElement createAccountMessageDisplayed;//done
	
	@FindBy(xpath = "//a[normalize-space()='MacBook Pro']")
	private WebElement clickMacBookPro;//done
	
	@FindBy(xpath ="//*[@id=\"content\"]/div/div[2]/ul[2]/li[1]/h2")
	private WebElement priceTagDisplayed;//done
	
	public boolean isLogoDisplayed() {
		if (retailWebsite.isDisplayed())
			return true;
		else
			return false;
	}

	
	
	public void clickLaptopsNotebooks() {
		clickLaptopsNotebooks.click();
	}
	
	public void clickShowAllLaptops() {
		clickShowAllLaptops.click();
	}

	public void clickMacBookItem() {
		clickMacBookItem.click();
	}
	
	public void clickAddtoCartButton() throws TimeoutException, InterruptedException {
		Thread.sleep(5000);
		clickAddtoCartButton.click();
	}
	
	public boolean successMessageIsDisplayed() {
		if(successMessageIsDisplayed.isDisplayed())
			return true;
		else
			return false;
	}
	
	public boolean itemDisplayedonCart() {
		if(itemDisplayedonCart.isDisplayed())
			return true;
		else 
			return false;
	}
	
	public void clickOnCart() {
		clickOnCart.click();
	}
	
	public void clickOnXButton() {
		clickOnXButton.click();
	}
	
	public boolean itemRemovedDisplayed() {
		if(itemRemovedDisplayed.isDisplayed())
			return true;
		else 
			return false;
	}
	
	public void clickMacBookComparisonButton() {
		clickMacBookComparisonButton.click();
	}
	
	public void MacBookAirComparisonButton() {
		MacBookAirComparisonButton.click();
	}
	
	public void clickProductComparison() {
		try {
			clickProductComparison.click();
		}catch(org.openqa.selenium.StaleElementReferenceException e) {
			driver.navigate().refresh();
			clickProductComparison.click();
		}
		
		
	}
	
	public boolean comparisonChartDisplayed() {
		if(comparisonChartDisplayed.isDisplayed())
			return true;
		else 
			return false;
	}
	
	public void clickSonyVAIOHeart() {
		clickSonyVAIOHeart.click();
	}
	
	public boolean createAccountMessageDisplayed() {
		if(createAccountMessageDisplayed.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void clickMacBookPro() {
		clickMacBookPro.click();
	}
	
	public boolean priceTagDisplayed() {
		if(priceTagDisplayed.isDisplayed())
			return true;
		else
			return false;
	}
		
	
}