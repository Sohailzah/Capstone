package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailSignInPage extends BaseSetup {

	public RetailSignInPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(id = "email")
	public WebElement emailField;

	@FindBy(id = "password")
	public WebElement passwordField;

	@FindBy(xpath = "//button[@type='submit']")
	public WebElement loginButton;

	@FindBy(id = "newAccountBtn")
	public WebElement newAccountButton;

	@FindBy(id = "nameInput")
	public WebElement nameInput;

	@FindBy(id = "emailInput")
	public WebElement emailInput;

	@FindBy(id = "passwordInput")
	public WebElement passwordInput;

	@FindBy(id = "confirmPasswordInput")
	public WebElement confirmPasswordInput;

	@FindBy(id = "signupBtn")
	public WebElement signUpButton;

	@FindBy(id = "profileImage")
	public WebElement profileImage;

	@FindBy(id = "accountLink")
	public WebElement accountLink;

	@FindBy(id = "nameInput")
	public WebElement chName;

	@FindBy(id = "personalPhoneInput")
	public WebElement chPhoneNumb;

	@FindBy(id = "personalUpdateBtn")
	public WebElement UpdateBtn;

	@FindBy(id = "previousPasswordInput")
	public WebElement previousPassword;

	@FindBy(id = "newPasswordInput")
	public WebElement newPasswordInput;

	@FindBy(id = "confirmPasswordInput")
	public WebElement confirmPasswordInput1;

	@FindBy(id = "credentialsSubmitBtn")
	public WebElement changepassbtn;

	@FindBy(className = "Toastify")
	public WebElement PasswordUpdatedSuccessfully;

	@FindBy(className = "w-full")
	public WebElement addPayMethod;

	@FindBy(id = "cardNumberInput")
	public WebElement cardNumberInput;

	@FindBy(id = "nameOnCardInput")
	public WebElement nameOnCardInput;

	@FindBy(id = "expirationMonthInput")
	public WebElement expirationMounthInput;

	@FindBy(id = "expirationYearInput")
	public WebElement expirationYearInput;

	@FindBy(id = "securityCodeInput")
	public WebElement securityCodeInput;

	@FindBy(id = "paymentSubmitBtn")
	public WebElement paymentSubmitBtn;

	@FindBy(className = "Toastify")
	public WebElement Paymentmethodaddsuccfully;

	@FindBy(id = "paymentSubmitBtn")
	public WebElement addYourCardButton;

	@FindBy(xpath = "//div[text()='Payment Method added sucessfully']")
	public WebElement paymentMethodAddedSuccessfullyMessage;

	@FindBy(xpath = "//div[@class='account__payment-sub']/p")
	public List<WebElement> cardEndingNumber;

	@FindBy(xpath = "//button[text()='Edit']")
	public WebElement cardEditButton;

	@FindBy(xpath = "//button[text()='Update Your Card']")
	public WebElement updateYourCardButton;

	@FindBy(xpath = "//div[text(='Password Updated Successfully']")
	public WebElement passwordUpdatedSuccessfullyMessage;

	@FindBy(className = "account__address-new")
	public WebElement addaddress;

	// @FindBy(xpath = "//option[text()='United States']")
	// @FindBy(xpath = "//option[text()='United States']")
	// @FindBy(xpath =
	// "//select[@class='account__address-new-dropdown']//child::option[text()='United
	// States']")
	@FindBy(id = "countryDropdown")
	public WebElement countryDropDown;

	@FindBy(id = "fullNameInput")
	public WebElement nameontheaddress;

	@FindBy(id = "phoneNumberInput")
	public WebElement phonenumberaddress;

	@FindBy(id = "streetInput")
	public WebElement streetinput;

	@FindBy(id = "apartmentInput")
	public WebElement apartmentInput;

	@FindBy(id = "cityInput")
	public WebElement cityInput;

	// @FindBy(xpath="//select[@class='account__address-new-dropdown']//child::option[text()='California']")
	// @FindBy(xpath="//select//option[text()='California']")
	// @FindBy(class="account__address-new-dropdown")
	@FindBy(xpath = "//select[@name='state']//self::select")
	public WebElement State;

	@FindBy(id = "zipCodeInput")
	public WebElement zipCodeInput;

	@FindBy(id = "addressBtn")
	public WebElement addaddressbtn;

	@FindBy(className = "Toastify")
	public WebElement AddressAddedSuccessfully;

	@FindBy(xpath = "//button[text()='remove']")
	public WebElement cardRemoveBttn;

	@FindBy(xpath = "//p[text()='Master Card']")
	public WebElement addCardBtton;

	@FindBy(xpath = "//div//button[text()='Edit']")
	public WebElement addreaseditedbtn;

	@FindBy(xpath = "//button[text()='Remove']")
	public WebElement removeAddressButtn;
}
