package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class SignInSteps extends CommonUtility {
	POMFactory factory = new POMFactory();

//	@Given("User is on retail website")
//	public void userIsOnRetailWebsite() {
//		logger.info("User should be on retail website");
//	}
	@When("User click on Sign in option")
	public void userClickOnSignInOption() {
		click(factory.homePAge().signIn);
		logger.info("user clicked on Sign In option");
	}

	@And("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String email, String password) {
		sendText(factory.signInPage().emailField, email);
		sendText(factory.signInPage().passwordField, password);
		logger.info("user entered email " + email + " and password " + password);
		slowDown();
	}

	@And("User click on login button")
	public void userClickOnLoginButton() {
		click(factory.signInPage().loginButton);
		logger.info("user clicked on login button");
	}

	@Then("User should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
		Assert.assertTrue(isElementDisplayed(factory.homePAge().account));
		logger.info("user logged in into account");
		slowDown();
	}

	@And("User click on Create New Account button")
	public void userClickOnCreateNewAccountButton() {
		click(factory.signInPage().newAccountButton);
		logger.info("user clicked on Create New Account button");
	}

	@And("User fill the signUp information with below data")
	public void userFillTheSignUpInformationWithBelowData(DataTable data) {
		List<Map<String, String>> signUpData = data.asMaps(String.class, String.class);
		sendText(factory.signInPage().nameInput, signUpData.get(0).get("name"));
		sendText(factory.signInPage().emailInput, signUpData.get(0).get("email"));
		sendText(factory.signInPage().passwordInput, signUpData.get(0).get("password"));
		sendText(factory.signInPage().confirmPasswordInput, signUpData.get(0).get("confirmPassword"));
		logger.info("user entered required information into sign up form");

		List<List<String>> signup = data.asLists(String.class);
		System.out.println(signup.get(1).get(0) + " This value is from list +++++++++++++++");
		slowDown();
	}

	@And("User click on SignUp button")
	public void userClickOnSignUpButton() {
		click(factory.signInPage().signUpButton);
		logger.info("user clicked on Sign up Button");
	}

	@Then("User should be logged into account page")
	public void userShouldBeLoggedIntoAccountPage() {
		Assert.assertTrue(isElementDisplayed(factory.signInPage().profileImage));
		Assert.assertTrue(isElementDisplayed(factory.homePAge().account));
		logger.info("Account was created");
		slowDown();
	}

	@When("User should be logged in into Accout")
	public void userShouldBeLoggedInIntoAccout() {
		logger.info("User should be logged into account");
		slowDown();
	}

	@When("User click on Account option")
	public void UserClickOnAccountOption() {
		click(factory.homePAge().account);
		logger.info("User Should be on Accout page");
		slowDown();
	}

	@When("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String Name, String Phone) {
		sendText(factory.signInPage().chName, Name);
		sendText(factory.signInPage().chPhoneNumb, Phone);
		logger.info("User Should be able to see inserted value");
		slowDown();
	}

	@When("User click on Update button")
	public void UserClickOnUptadeButton() {
		click(factory.signInPage().UpdateBtn);
		logger.info("User should be able to click on uptade bttn");
		slowDown();

	}

	@Then("user profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		logger.info("User info should be update");
		slowDown();
	}

	@And("User enter below information")
	public void Userenterbelowinformation(DataTable changepassword) {

		List<Map<String, String>> password = changepassword.asMaps(String.class, String.class);
		sendText(factory.signInPage().previousPassword, password.get(0).get("previousPassword"));
		sendText(factory.signInPage().newPasswordInput, password.get(0).get("newPassword"));
		sendText(factory.signInPage().confirmPasswordInput1, password.get(0).get("confirmPassword"));
		logger.info("User should be able to change password");
		slowDown();

	}

	@And("User click on Change Password button")
	public void UserclickonChangePasswordbutton() {
		click(factory.signInPage().changepassbtn);
		logger.info("User should be able to change her password succesfully ");
		slowDown();
	}

	@Then("a message should be displayed ‘Password Updated Successfully’")
	public void aMessageShouldBeDisplayedPasswordUpdatedSuccessfully() {
		Assert.assertTrue(isElementDisplayed(factory.signInPage().PasswordUpdatedSuccessfully));
		logger.info("User should be able to see the that the pass world was changed succsefully");
		slowDown();
	}

	@When("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
		click(factory.signInPage().addPayMethod);
		logger.info("User should be able to click on Add Pyment Method Link");
		slowDown();
	}

	@When("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable cardInfo) {
		List<Map<String, String>> Payment = cardInfo.asMaps(String.class, String.class);
		sendText(factory.signInPage().cardNumberInput, Payment.get(0).get("cardNumber"));
		sendText(factory.signInPage().nameOnCardInput, Payment.get(0).get("nameOnCard"));
		sendText(factory.signInPage().expirationMounthInput, Payment.get(0).get("expirationMonth"));
		sendText(factory.signInPage().expirationYearInput, Payment.get(0).get("expirationYear"));
		sendText(factory.signInPage().securityCodeInput, Payment.get(0).get("securityCode"));
		logger.info("User should be able to change password");
		slowDown();
	}

	@When("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.signInPage().paymentSubmitBtn);
		logger.info("User should be able see the submitbtn");
		slowDown();
	}

	@Then("a message should be displayed ‘Payment Method added successfully’")
	public void aMessageShouldBeDisplayedPaymentMethodAddedSuccessfully() {
		Assert.assertTrue(isElementDisplayed(factory.signInPage().Paymentmethodaddsuccfully));
		logger.info("User card should be added");
		slowDown();
	}

	@When("User select card with ending {string}")
	public void userSelectCardwithEnding(String cardEndingNumber) {
		List<WebElement> cards = factory.signInPage().cardEndingNumber;
		for (WebElement card : cards) {
			if (card.getText().equals(cardEndingNumber))
				System.out.println(card.getText() + "======================");
			click(card);
			logger.info(cardEndingNumber + "is selected");
			break;
		}
	}

	@When("User click on Edit option of card section")
	public void userClickOnEditOption0fCardSection() {
		click(factory.signInPage().cardEditButton);
		logger.info("user clicked on Edit Option");
		slowDown();
	}

	@When("user edit information with below data")
	public void userEditInformationWithBelowData(DataTable dataTable) {
		List<Map<String, String>> paymentInformation = dataTable.asMaps(String.class, String.class);
		// this did not work for me and did not clear text for somehow
		// clearTextUsingSendKeys(factory.signInPage().cardNumberInput);

		WebElement cardNumberInput = (factory.signInPage().cardNumberInput);
		cardNumberInput.clear();
		sendText(factory.signInPage().cardNumberInput, paymentInformation.get(0).get("cardNumber"));
		slowDown();

		WebElement nameOnCardInput = (factory.signInPage().nameOnCardInput);
		nameOnCardInput.clear();
		// this did not work for me and did not clear text for somehow
		// clearTextUsingSendKeys(factory.signInPage().nameOnCardInput);
		sendText(factory.signInPage().nameOnCardInput, paymentInformation.get(0).get("nameOnCard"));
		slowDown();
		selectByVisibleText(factory.signInPage().expirationMounthInput,
				paymentInformation.get(0).get("expirationMonth"));
		selectByVisibleText(factory.signInPage().expirationYearInput, paymentInformation.get(0).get("expirationYear"));

		WebElement securityCodeInput = (factory.signInPage().securityCodeInput);
		securityCodeInput.clear();
		// this did not work for me and did not clear text for somehow
		// clearTextUsingSendKeys(factory.signInPage().securityCodeInput);
		sendText(factory.signInPage().nameOnCardInput, paymentInformation.get(0).get("securityCode"));
		logger.info("user entered required card information");
	}

	@When("user click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
		click(factory.signInPage().updateYourCardButton);
		logger.info("user clicked on Update your card button");
	}

	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String expectedMessage) {
		if (expectedMessage.contains("Password")) {
			waitTillPresence(factory.signInPage().PasswordUpdatedSuccessfully);
			Assert.assertEquals(expectedMessage, factory.signInPage().PasswordUpdatedSuccessfully.getText());
			logger.info(expectedMessage + "Is displayed");

		} else if (expectedMessage.contains("Payment Method added")) {
			waitTillPresence(factory.signInPage().paymentMethodAddedSuccessfullyMessage);
			Assert.assertEquals(expectedMessage, factory.signInPage().paymentMethodAddedSuccessfullyMessage.getText());
			logger.info(expectedMessage + "Is displayed");

		} else if (expectedMessage.contains("Payment Method added")) {
			waitTillPresence(factory.signInPage().paymentMethodAddedSuccessfullyMessage);
			Assert.assertEquals(expectedMessage, factory.signInPage().paymentMethodAddedSuccessfullyMessage.getText());
			logger.info(expectedMessage + "Is displayed");

		} else if (expectedMessage.contains("Address Added Successfully")) {
			waitTillPresence(factory.signInPage().AddressAddedSuccessfully);
			Assert.assertEquals(expectedMessage, factory.signInPage().AddressAddedSuccessfully.getText());
			logger.info(expectedMessage + "Is displayed");
		}
	}

	@When("User click on Add address option")
	public void userClickOnAddAddressOption() {
		click(factory.signInPage().addaddress);
		logger.info("User should see the form to fill out the information");
	}

	@When("user fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) {
		List<Map<String, String>> Addaddress = dataTable.asMaps(String.class, String.class);
		selectByVisibleText(factory.signInPage().countryDropDown, Addaddress.get(0).get("country"));
		click(factory.signInPage().countryDropDown);
		sendText(factory.signInPage().nameontheaddress, Addaddress.get(0).get("fullName"));
		sendText(factory.signInPage().phonenumberaddress, Addaddress.get(0).get("phoneNumber"));
		sendText(factory.signInPage().streetinput, Addaddress.get(0).get("streetAddress"));
		sendText(factory.signInPage().apartmentInput, Addaddress.get(0).get("apt"));
		sendText(factory.signInPage().cityInput, Addaddress.get(0).get("city"));
		selectByVisibleText(factory.signInPage().State, Addaddress.get(0).get("state"));
		click(factory.signInPage().State);
		sendText(factory.signInPage().zipCodeInput, Addaddress.get(0).get("zipCode"));
		logger.info("User should see all the information they fill out");

	}

	@When("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
		click(factory.signInPage().cardRemoveBttn);
		logger.info("User should be able to clik on remove button");
		slowDown();

	}

	@And("User click on the card added to his account")
	public void userClickOnTheCardAddedToHisAccount() {
		click(factory.signInPage().addCardBtton);
		logger.info("User should able to click on card");

	}

	@Then("payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {
		logger.info("User's card should remove from account page");

	}

	@And("User click on edit address option")
	public void Userclickoneditaddressoption() {
		click(factory.signInPage().addreaseditedbtn);
		logger.info("User click on the edited btn");
		slowDown();
	}

	@And("User fill Upated information below")
	public void UserfillUpatedinformationbelow(DataTable editAddress) {
		List<Map<String, String>> EditAddress = editAddress.asMaps(String.class, String.class);
		selectByVisibleText(factory.signInPage().countryDropDown, EditAddress.get(0).get("country"));
		click(factory.signInPage().countryDropDown);
		slowDown();
//        sendText(factory.signInPage().nameontheaddress,Addaddress.get(0).get("country"));
//        slowDown();
		clearTextUsingSendKeys(factory.signInPage().nameontheaddress);
		sendText(factory.signInPage().nameontheaddress, EditAddress.get(0).get("fullName"));
		slowDown();
		clearTextUsingSendKeys(factory.signInPage().phonenumberaddress);
		sendText(factory.signInPage().phonenumberaddress, EditAddress.get(0).get("phoneNumber"));
		slowDown();
		clearTextUsingSendKeys(factory.signInPage().streetinput);
		sendText(factory.signInPage().streetinput, EditAddress.get(0).get("streetAddress"));
		slowDown();
		clearTextUsingSendKeys(factory.signInPage().apartmentInput);
		sendText(factory.signInPage().apartmentInput, EditAddress.get(0).get("apt"));
		slowDown();
		clearTextUsingSendKeys(factory.signInPage().cityInput);
		sendText(factory.signInPage().cityInput, EditAddress.get(0).get("city"));
		slowDown();
		selectByVisibleText(factory.signInPage().State, EditAddress.get(0).get("state"));
		click(factory.signInPage().State);
		slowDown();
		clearTextUsingSendKeys(factory.signInPage().zipCodeInput);
		sendText(factory.signInPage().zipCodeInput, EditAddress.get(0).get("zipCode"));
		slowDown();
		logger.info("User should see all the information they fill out");
		slowDown();
	}

	@And("User click update Your Address button")
	public void UserclickupdateYourAddressbutton() {
		click(factory.signInPage().addaddressbtn);
		logger.info("User clicked on the update btn");
	}

	@Then("a message should be displayed ‘Address Updated Successfully’")
	public void aMessageShouldBeDisplayedAddressUpdatedSuccessfully() {
		Assert.assertTrue(isElementDisplayed(factory.signInPage().AddressAddedSuccessfully));
		logger.info("User information should be upadate it");

	}
	
	@When("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
	    click(factory.signInPage().removeAddressButtn);
	    logger.info("User should be able to click on remove button");
	}
	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
	   logger.info("User address should be remove");
	} 
}
