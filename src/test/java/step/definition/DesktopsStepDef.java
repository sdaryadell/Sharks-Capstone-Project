package step.definition;

import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.object.DesktopsPage;



public class DesktopsStepDef extends Base{

DesktopsPage desktops = new DesktopsPage();

@Given("User is on Retail website")
public void user_is_on_retail_website() {
Assert.assertTrue(desktops.isLogoDisplayed());//if the logo is present, it will return true otherwise it will return false and the assertion will fail
logger.info("user is on retail website");

}

@When("User click on Desktops tab")
public void user_click_on_desktops_tab() {
desktops.desktopTab();
logger.info("user click on desktops tab");
}

@When("User click on Show all desktops")
public void user_click_on_show_all_desktops() {
desktops.showAllDesktops();
logger.info("user click on show all desktops");
}

@Then("User should see all items are present in Desktop page")
public void user_should_see_all_items_are_present_in_desktop_page() {
List<WebElement> items = desktops.elements();
for (WebElement element : items) {
Assert.assertTrue(element.isDisplayed());
logger.info(element.getAttribute("alt") + " is present in this page");
}
}

@And("User click ADD TO CART option on {string} itemm")
public void user_click_add_to_cart_option_on_item(String HP) {
desktops.addToCart();
logger.info("user click add to cart option HP LP3065 item");
}

@And("^User select quantityy '1'$")
public void user_select_quantity() {
//why do we use wrapper classes here?
	Assert.assertTrue(desktops.selectQuantity1());
//desktops.selectQty(value1);
logger.info("user select quantity 1");
}

@And("User click add to Cart buttonn")
public void user_click_add_to_cart_buttonn() {
desktops.clickCart();
logger.info("user click add to cart button");
}

@Then("User should see a message {string}")
public void user_should_see_a_messagee(String successMessage) {
Assert.assertTrue(desktops.isSuccessMessageDisplayed());
logger.info("user should see a message success");
}

@And("User click ADD TO CART option on {string} item")
public void user_click_add_cart_option(String canon5D) {
//added manually
desktops.addCanon(canon5D);
logger.info("user click add to cart option on Canon EOS 5D item");
}

@And("User select color from dropdown {string}")
public void user_select_color_from_dropdown(String red) {
//Check for possible single-used xpath error (may need to extract 2 xpaths for this)
desktops.colorRed(red);
logger.info("user select color from dropdown red");
}

@And("User select quantity{string}")
public void user_select_quantity_one(String value2) {
desktops.selectQty2(value2);
logger.info("user select quantity 2");
}

@And("User click add to Cart button2")
public void user_click_add_to_cart_button2() {
desktops.addtoCart2();
logger.info("user click add to cart button");
}

@Then("User should see a message2 {string}")
public void user_should_see_a_message2(String message2) {
Assert.assertTrue(desktops.isSuccessMessage2Displayed(message2));
logger.info("user should see a message success2");
}

@And("User click on Canon EOS 5D item")
public void user_click_on_canon_eos_5d_item() {
desktops.clickCanon5D();
logger.info("user click on Canon EOS 5D item");
}

@And("User click on write a review link")
public void user_click_on_write_a_review_link() {
desktops.writeReview();
logger.info("user click on write a review link");
}

@And("user fill the review information with below information")
public void user_fill_the_review_information_with_below_information(io.cucumber.datatable.DataTable dataTable) {
List<Map<String, String>> information = dataTable.asMaps(String.class,String.class);
desktops.writeNameField(information.get(0).get("writeNameField"));
desktops.writeReviewField(information.get(0).get("writeReviewField"));
desktops.reviewRating();
logger.info("user fill the review information with below information");

}

@And("User click on Continue Button")
public void user_click_on_continue_button() {
desktops.continueButton();
logger.info("user click on continue button");
}

@Then("User should see a message with {string}")
public void user_should_see_a_message_with(String successMessage3) {
Assert.assertTrue(desktops.isSuccessMessage3Displayed());
logger.info("user should see a message with");

}
}