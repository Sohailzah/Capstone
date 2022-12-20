package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class HomeSteps extends CommonUtility {
	POMFactory factory = new POMFactory();

	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		String expectedTitle = "React App";
		String actualTitle = getTitle(); // wrote this one in CommonUtility
		Assert.assertEquals(expectedTitle, actualTitle);
		logger.info(actualTitle + " is equal to " + expectedTitle);
	}

	@Then("User verify retail page logo is present")
	public void userVerifyRetailPageLogoIsPresent() {
		Assert.assertTrue(isElementDisplayed(factory.homePAge().logo));
		logger.info("logo is present");

	}

	@When("User search for an item {string}")
	public void userSearchForAnItem(String value) {
		sendText(factory.homePAge().searchInputField, value);
		logger.info("user entered " + value);

	}

	@When("User click on Search icon")
	public void userClickOnSearchIcon() {
		click(factory.homePAge().searchButton);
		logger.info("user clicked on search button");
	}

	@Then("Item should be present")
	public void itemShouldBePresent() {
		Assert.assertTrue(isElementDisplayed(factory.homePAge().playStationItem));
		logger.info("item is present");

	}

//	@When("User click on All section")
//	public void userClickOnAllSection() {
//		click(factory.homePAge().allElement);
//		logger.info("user clicked on All element");
//	}

	@Then("User verifies {string} is present")
	public void user_verifies_is_present(String value) {
		String expectedValue = value;
		String actualValue = getElementText(factory.homePAge().shopByDepartment);
		Assert.assertEquals(expectedValue, actualValue);
		logger.info(expectedValue + " is present");
	}

	@And("User verifies cart icon is present")
	public void userVerifiesCartIconIsPresent() {
		slowDown();
		HighlightElement(factory.homePAge().cart);
		slowDown();
		Assert.assertTrue(isElementDisplayed(factory.homePAge().cart));
		logger.info("cart icon is present");
		scrollPageDownWithJS();
		slowDown();
	}

	@When("User click on All section")
	public void UserClickOnAllSectionBtn() {
		click(factory.homePAge().allDep);
		slowDown();
		Assert.assertTrue(isElementDisplayed(factory.homePAge().all));
		logger.info("user click on all section");
	}

	@When("User on Electronics")
	public void userOnElectronics() {
		click(factory.homePAge().Electronics);
		Assert.assertTrue(isElementDisplayed(factory.homePAge().TVAndVideo));
		Assert.assertTrue(isElementDisplayed(factory.homePAge().videoGames));
		logger.info("user On Electronics");
	}

	@When("User on Computers")
	public void userOnComputers() {
		click(factory.homePAge().Computers);
		slowDown();
		Assert.assertTrue(isElementDisplayed(factory.homePAge().Accessiries));
		Assert.assertTrue(isElementDisplayed(factory.homePAge().Networking));
		logger.info("user On Computers");
	}

	@When("User on Smart Home")
	public void userOnSmartHome() {
		click(factory.homePAge().SmartHome);
		slowDown();
		Assert.assertTrue(isElementDisplayed(factory.homePAge().SmartHomeLighting));
		Assert.assertTrue(isElementDisplayed(factory.homePAge().PlugsAndOultlets));
		logger.info("user On Smart Home");

	}

	@When("User on Sports")
	public void userOnSports() {
		click(factory.homePAge().sports);
		slowDown();
		Assert.assertTrue(isElementDisplayed(factory.homePAge().AtheticClothing));
		Assert.assertTrue(isElementDisplayed(factory.homePAge().ExerciseFitness));
		logger.info("user On Sports");
	}

	@When("User on Automotive")
	public void userOnAutomotive() {
		click(factory.homePAge().automative);
		slowDown();
		Assert.assertTrue(isElementDisplayed(factory.homePAge().AutomativePartsAccessoriecs));
		Assert.assertTrue(isElementDisplayed(factory.homePAge().MotorCyclePowerSports));
		logger.info("user On Automotive");
	}

	@Then("below options are present in department")
	public void belowOptionsArePresentInDepartment(DataTable dataTable) {
		List<List<String>> department = dataTable.asLists();
		switch (department.toString()) {
		case "Electronics":
			click(factory.homePAge().Electronics);
			String video = getText(factory.homePAge().videoGames);
			String TVAndVideo = getText(factory.homePAge().TVAndVideo);
			Assert.assertEquals(TVAndVideo, department.get(0).get(0));
			Assert.assertEquals(video, department.get(0).get(1));
			logger.info(video + " options are present in department" + TVAndVideo);
			break;
		case "Computers":
			click(factory.homePAge().Computers);
			String Accessories = getText(factory.homePAge().Accessiries);
			String Networking = getText(factory.homePAge().Networking);
			Assert.assertEquals(Accessories, department.get(0).get(0));
			Assert.assertEquals(Networking, department.get(0).get(1));
			logger.info(Accessories + " options are present in department" + Networking);
			break;
		case "Sports":
			click(factory.homePAge().sports);
			String AthleticClothing = getText(factory.homePAge().AtheticClothing);
			String ExerciseFitness = getText(factory.homePAge().ExerciseFitness);
			Assert.assertEquals(AthleticClothing, department.get(0).get(0));
			Assert.assertEquals(ExerciseFitness, department.get(0).get(1));
			logger.info(AthleticClothing + " options are present in department" + ExerciseFitness);
			break;
		case "Automotive":
			click(factory.homePAge().automative);
			String AutomativePartsAccessories = getText(factory.homePAge().AutomativePartsAccessoriecs);
			String MotorCyclePowersports = getText(factory.homePAge().MotorCyclePowerSports);
			Assert.assertEquals(AutomativePartsAccessories, department.get(0).get(0));
			Assert.assertEquals(MotorCyclePowersports, department.get(0).get(1));
			logger.info(MotorCyclePowersports + " options are present in department" + AutomativePartsAccessories);
			break;
		}
	}

	@When("User change the Category to {string}")
	public void userChangetheCategoryTo(String value) {
		sendText(factory.homePAge().all, value);
		logger.info(value + " was selected from the drop down");
		slowDown();

	}

	@And("User click on item")
	public void Userclickonitem() {
		click(factory.homePAge().itemkassaoutdoor);
		logger.info("User should click on the item");
		slowDown();

	}

	@And("User select quantity ‘2’")
	public void Userselectquantity() {
		click(factory.homePAge().qtyTwo);
		logger.info("User should change quintidy to two");
		slowDown();

	}

	@And("User click add to Cart button")
	public void UserclickaddtoCartbutton() {
		click(factory.homePAge().addToTheCard);
		logger.info("user Should see that the it add to the card");
		slowDown();

	}

	@Then("the cart icon quantity should change to ‘2’")
	public void thecartconquantityshouldchangeto() {
		Assert.assertTrue(isElementDisplayed(factory.homePAge().cart));
		logger.info("User should it added");
		slowDown();
	}

	@When("User change the category to {string}")
	public void userChangeTheCategoryTo(String value) {
		sendText(factory.homePAge().all, value);
		logger.info(value + " was selected from the drop down");
		slowDown();
	}

	@Then("User click on Cart option")
	public void userClickOnCartOption() {
		waitTillPresence(factory.homePAge().cart);
		click(factory.homePAge().cart);
		logger.info("User should be able to click on cart option");
		slowDown();
	}

	@Then("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
		waitTillPresence(factory.homePAge().proccedBtn);
		click(factory.homePAge().proccedBtn);
		logger.info("User click on Proceed to Checkout button");
		slowDown();
	}

	@Then("User click Add a new address link for shipping address")
	public void userClickAddANewAddressLinkForShippingAddress() {
		waitTillPresence(factory.homePAge().addAddressBtn);
		click(factory.homePAge().addAddressBtn);
		logger.info("User should be able to click on add a new address button");
		slowDown();
	}

	@Then("User fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) {
		List<Map<String, String>> Addaddress = dataTable.asMaps(String.class, String.class);
		selectByVisibleText(factory.homePAge().country, Addaddress.get(0).get("country"));
		click(factory.homePAge().country);
		sendText(factory.homePAge().fullName, Addaddress.get(0).get("fullName"));
		sendText(factory.homePAge().phoneNumberInput, Addaddress.get(0).get("phoneNumber"));
		sendText(factory.homePAge().streetInput, Addaddress.get(0).get("streetAddress"));
		sendText(factory.homePAge().apartmentInput, Addaddress.get(0).get("apt"));
		sendText(factory.homePAge().cityInput, Addaddress.get(0).get("city"));
		selectByVisibleText(factory.homePAge().state, Addaddress.get(0).get("state"));
		click(factory.homePAge().state);
		sendText(factory.homePAge().zipCodeInput, Addaddress.get(0).get("zipCode"));
		logger.info("User should see all the information they fill out");

	}

	@Then("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
		click(factory.homePAge().addressBtn);
		logger.info("User click on Add Your Address Buttn");
		slowDown();
	}

	@Then("User click Add a credit card or Debit Card for Payment method")
	public void userClickAddACreditCardOrDebitCardForPaymentMethod() {
		click(factory.homePAge().addPaymentBtn);
		logger.info("User should be able to click on Add Your payment Buttn");
		slowDown();
		click(factory.homePAge().paymentSubmitBtn);
	}

	@Then("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
		click(factory.homePAge().placeOrderBtn);
		logger.info("User click on Add Your Address Buttn");
		slowDown();
	}

	@Then("A Message Should be displayed ‘Order Placed, Thanks’")
	public void aMessageShouldBeDisplayedOrderPlacedThanks() {
		Assert.assertTrue(isElementDisplayed(factory.homePAge().orderPlacedSuccessfully));
		logger.info("Order Placed Successfully Message is displayed");
	}

	@And("User select quantity ‘5’")
	public void UserSelectQuantityFive() {
		click(factory.homePAge().qty5);
		logger.info("User should change quintidy to five");
		slowDown();
	}

	@Then("the cart icon quantity should change to ‘5’")
	public void theCartIconQuantityShouldChangeTo() {
		Assert.assertTrue(isElementDisplayed(factory.homePAge().qtyFive));
		logger.info("Quantity should change to five");
	}

	@When("User click on Orders section")
	public void userClickOnOrdersSection() {
		click(factory.homePAge().orderLink);
		logger.info("User clicked on Order section");
	}

	@When("User click on first order in list")
	public void userClickOnFirstOrderInList() {
		logger.info("User should see the first order");
	}

	@When("User click on Cancel The Order button")
	public void userClickOnCancelOrderButton() {
		click(factory.homePAge().cancelBttn);
		logger.info("User clicked on cancel button");
	}

	@And("User select the cancelation Reason ‘Bought wrong item’")
	public void UserselectthecancelationReason() {
		click(factory.homePAge().reasonforreturn);
		logger.info("user should see the option for return");
		slowDown();
	}

	@When("User click on Cancel Order Button")
	public void UserClickOnCancelOrderButton() {
		click(factory.homePAge().cancelOrderSubmitBtn);
		logger.info("User clicked on cancel button");
	}

	@Then("a cancelation message should be displayed ‘Your Order Has Been Cancelled’")
	public void aCancelationMessageShouldBeDisplayedYourOrderHasBeenCancelled() {
		Assert.assertTrue(isElementDisplayed(factory.homePAge().yourOrderCancelled));
		logger.info("Your Order Cancelled Successfully Message is displayed");
	}

	@When("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
		click(factory.homePAge().returnItemsBtn);
		logger.info("User click on Return button item");
		slowDown();
	}

	@When("User select the Return Reason ‘Item damaged’")
	public void userSelectTheReturnReasonItemDamaged() {
		click(factory.homePAge().damgeItemReturn);
		logger.info("User select the return reason");
	}

	@When("User select the drop off service ‘FedEx’")
	public void userSelectTheDropOffServiceFedEx() {
		click(factory.homePAge().fedExDropoff);
		logger.info("User select drop off service FedEx");

	}

	@When("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
		click(factory.homePAge().returnOrderBtn);
		logger.info("User click on retuen order button");

	}

	@Then("a cancelation message should be displayed ‘Return was successful’")
	public void aCancelationMessageShouldBeDisplayedReturnWasSuccessful() {
		Assert.assertTrue(isElementDisplayed(factory.homePAge().returnWasSuccessfully));
		logger.info("Cancelation message should be displayed ‘Return was successful’");
	}

	@When("User click on Review button")
	public void userClickOnReviewButton() {
		click(factory.homePAge().reviwBtn);
		logger.info("User click on review button");

	}

	@When("User write Review headline {string} and {string}")
	public void userWriteReviewHeadlineHeadlineValueAndReviewText(String headline, String review) {
		sendText(factory.homePAge().addaHeadline, headline);
		sendText(factory.homePAge().reiewDescription, review);
		logger.info("User submit a review message");
		slowDown();
	}

	@When("User click Add your Review button")
	public void userClickAddYourReviewButton() {
		click(factory.homePAge().reviewSubmitBtn);
		logger.info("User click on Add your Review button");
		slowDown();
	}

	@Then("a review message should be displayed ‘Your review was added successfully’")
	public void aReviewMessageShouldBeDisplayedYourReviewWasAddedSuccessfully() {
		Assert.assertTrue(isElementDisplayed(factory.homePAge().yourReviewMesg));
		logger.info("Review message should be displayed ‘Return was successful’");
	}
}
