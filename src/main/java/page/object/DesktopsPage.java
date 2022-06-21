package page.object;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class DesktopsPage extends Base {

	public DesktopsPage() {
		PageFactory.initElements(driver, this);
		}

		@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
		private WebElement retailWebsite; //create a display method

		@FindBy(xpath = "//a[text()='Desktops']")
		private WebElement desktopTab; // click

		@FindBy(xpath = "//a[text()='Show All Desktops']")
		private WebElement showAllDesktops; //click

		@FindBy(xpath = "//div[@class='image']//a//img")
		private List<WebElement> items;

		@FindBy(xpath = "//div[3]//div[1]//div[2]//div[2]//button[1]//span[1]")
		private WebElement addToCart; //click

		@FindBy(xpath = "//input[@id='input-quantity']")
		private WebElement selectQty; //click - Map-list

		@FindBy(xpath = "//button[@id='button-cart']")
		private WebElement clickCart; //click

		@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
		private WebElement successMessage; //Displayed

		@FindBy(xpath = "//span[@xpath='1']")
		private WebElement addCanon; //added manually / click

		@FindBy(xpath = "//select/option[@value='15']")
		private WebElement colorRed;

		@FindBy(xpath = "//input[@id='input-quantity']")
		private WebElement selectQty2; //String - Map-list

		@FindBy(xpath = "//button[@id='button-cart']")
		private WebElement addtoCart2; //click

		@FindBy(xpath = "//div[@xpath='1']")
		private WebElement successMessage2; //boolean displayed

		@FindBy(xpath = "//a[@xpath='1']")
		private WebElement clickCanon5D; //click

		@FindBy(xpath = "//a[text()='Write a review']")
		private WebElement writeReview; //click

		@FindBy(xpath = "//input[@name='name']")
		private WebElement writeNameField; //Map-list

		@FindBy(xpath = "//textarea[@name='text']")
		private WebElement writeReviewField; //Map-list

		@FindBy(xpath = "//*[@id=\"form-review\"]/div[4]/div/input[1]")
		private WebElement ReviewRating; //click

		@FindBy(xpath = "//button[@id='button-review']")
		private WebElement continueButton; //click

		@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
		private WebElement successMessage3;

		public boolean isLogoDisplayed() {
		if (retailWebsite.isDisplayed())
		return true;
		else
		return false;
		}

		public void desktopTab() {
		desktopTab.click();
		}

		public void showAllDesktops() {
		showAllDesktops.click();
		}

		public List<WebElement> elements() {
		List<WebElement> DesktopsItems = items;
		return DesktopsItems;
		}

		public void addToCart() {
		addToCart.click();
		}

//		public void selectQty(String value1) {
//		selectQty.sendKeys(value1);
//		}
		public boolean selectQuantity1() {
			if(selectQty.isDisplayed()) {
			return true;
		}else {
			return false;
		}
}
		public void clickCart() {
		clickCart.click();
		}

		public boolean isSuccessMessageDisplayed() {
		if (successMessage.isDisplayed())
		return true;
		else
		return false;
		}

		public void addCanon(String canon5D) {
		addCanon.click();
		}

		public void colorRed(String red) {
		colorRed.click();
		}

		public void selectQty2(String value2) {
		selectQty2.sendKeys(value2);
		}

		public void addtoCart2() {
		addtoCart2.click();
		}

		public boolean isSuccessMessage2Displayed(String message2) {
		if (successMessage2.isDisplayed())
		return true;
		else
		return false;
		}


		public void clickCanon5D() {
		clickCanon5D.click();

		}

		public void writeReview() {
		writeReview.click();

		}

		public void writeNameField(String enterName) {
		writeNameField.sendKeys(enterName);

		}

		public void writeReviewField(String enterReview) {
		writeReviewField.sendKeys(enterReview);

		}



		public void reviewRating() {
		ReviewRating.click();

		}

		public void continueButton() {
		continueButton.click();

		}

		public boolean isSuccessMessage3Displayed() { if
		(successMessage3.isDisplayed()) return true; else return false;

		}
		}