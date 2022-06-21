package step.definition;

import java.util.concurrent.TimeoutException;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.object.LaptopNoteBookPage;

public class LaptopNoteBookStepDef extends Base {

	LaptopNoteBookPage laptopNotebook = new LaptopNoteBookPage();
	
	@Given("User is on Retail websitee")
	public void user_is_on_retail_websitee() {
	    Assert.assertTrue(laptopNotebook.isLogoDisplayed());
	    logger.info("user is on retail website");
	}
	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
	    //click
		laptopNotebook.clickLaptopsNotebooks();
		logger.info("user click on laptop &NoteBook tab");
	}
	@When("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
	    //click
		laptopNotebook.clickShowAllLaptops();
		logger.info("user click on show all laptop &notebook option");
	}
	@Given("User click on MacBook item")
	public void user_click_on_mac_book_item() throws TimeoutException, InterruptedException {
	    //click
		Thread.sleep(5000);
		laptopNotebook.clickMacBookItem();
		logger.info("user click on MackBook item");
	}
	@Given("User click add to Cart button")
	public void user_click_add_to_cart_button() throws TimeoutException, InterruptedException {
	    //click
		Thread.sleep(5000);
		laptopNotebook.clickAddtoCartButton();
		logger.info("user click add to cart button");
	}
	@Then("User should see a message laptop{string}")
	public void user_should_see_a_message_laptop(String string) {
	    //Displayed
		Assert.assertTrue(laptopNotebook.successMessageIsDisplayed());
		logger.info("user should see a success message");
	}
	@Then("User should see {string} showed to the cart")
	public void user_should_see_showed_to_the_cart(String string) throws TimeoutException, InterruptedException {
	    //Displayed
		Thread.sleep(5000);
		Assert.assertTrue(laptopNotebook.itemDisplayedonCart());
		logger.info("user should see 1 item showed to the cart");
		
	}
	@Then("User click on cart option")
	public void user_click_on_cart_option() {
	    //click
		laptopNotebook.clickOnCart();
		logger.info("user click on cart option");
	}
	@Then("user click on red X button to remove the item from car")
	public void user_click_on_red_x_button_to_remove_the_item_from_car() {
	    //click
		laptopNotebook.clickOnXButton();
		logger.info("user click on red X button to remove the item from car");
	}
	@Then("item should be removed and cart should show {string}")
	public void item_should_be_removed_and_cart_should_show(String string) {
	    //displayed
		Assert.assertTrue(laptopNotebook.itemRemovedDisplayed());
		logger.info("item should be removed and cart should show zero item");
	}
	@Given("User click on product comparison icon on {string}")
	public void user_click_on_product_comparison_icon_on(String string) {
	    //click
		laptopNotebook.clickMacBookComparisonButton();
		logger.info("user click on product comparison icon on MacBook");
	}
	@Given("User click on product comparison icon onn {string}")
	public void user_click_on_product_comparison_icon_onn(String string) {
	    //click
		laptopNotebook.MacBookAirComparisonButton();
		logger.info("user click on product comparison icon onn Macbook air");
	}
	
	@Then("User click on Product comparison link")
	public void user_click_on_product_comparison_link() throws TimeoutException, InterruptedException {
	    //click
		Thread.sleep(5000);
		laptopNotebook.clickProductComparison();
		logger.info("user click on product comparison link on");
	}
	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
	    //displayed
		Assert.assertTrue(laptopNotebook.comparisonChartDisplayed());
		logger.info("user should see product comparison chart");
	}

	@When("User click on heart icon to add {string} laptop to wish list")
	public void user_click_on_heart_icon_to_add_laptop_to_wish_list(String string) {
	    //click
		laptopNotebook.clickSonyVAIOHeart();
		logger.info("user click on heart icon to add VAIO Heart laptop to wish list");
	}
	@Then("User should get a message {string}")
	public void user_should_get_a_message(String string) {
	    //displayed
		Assert.assertTrue(laptopNotebook.createAccountMessageDisplayed());
		logger.info("user should get a message you must login");
	}
	@When("User click on {string} item")
	public void user_click_on_item(String string) throws TimeoutException, InterruptedException {
	    //click
		Thread.sleep(5000);
		laptopNotebook.clickMacBookPro();
		logger.info("user click on MacBook Pro item");
	}
	@Then("User should see {string} price tag is present on UI.")
	public void user_should_see_price_tag_is_present_on_ui(String string) throws TimeoutException, InterruptedException {
	    Thread.sleep(5000);
		Assert.assertTrue(laptopNotebook.priceTagDisplayed());
	    logger.info("user should see price tag");
	}
}