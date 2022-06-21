package step.definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.object.HomePagePage;

public class HomePageStepDef extends Base{

	HomePagePage HomePage = new HomePagePage();
	
	
	
	@When("User click on Currency")
	public void user_click_on_currency() {
		HomePage.clickCurrency();
		logger.info("user click on currency");
	}
	@When("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		HomePage.clickEUR();
		logger.info("user chose Euro form dropdown");
	}
	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
	   Assert.assertTrue(HomePage.EURDisplayed());
	   logger.info("currency value should change to Euro");
	}
	
	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
		HomePage.clickShoppingCart();
		logger.info("user click on shopping cart");
	}
	@Then("{string} message should display")
	public void message_should_display(String string) {
		Assert.assertTrue(HomePage.emptyisDisplayed(string));
	    logger.info("success message should display");
	}
	    
	
}