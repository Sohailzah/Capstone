package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup {

	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);
	}
	@FindBy(xpath = "//a[@class='top-nav__logo active']")
	public WebElement logo;

	@FindBy(id = "search")
	public WebElement allDepartments;

	@FindBy(id = "searchInput")
	public WebElement searchInputField;

	@FindBy(id = "searchBtn")
	public WebElement searchButton;

	@FindBy(xpath = "//im[@alt='PlayStation 5 Console']")
	public WebElement playStationItem;

	@FindBy(xpath = "//span[text ()='A11']")
	public WebElement allElement;

	@FindBy(id = " contentHeader")
	public WebElement shopByDepartment;

	@FindBy(xpath= "//button[@class='second-nav__all-btn']")
	public WebElement allDep;
	
	@FindBy(id = "cartBtn")
	public WebElement cart;

	@FindBy(id = "signinLink")
	public WebElement signIn;

	@FindBy(id = "accountLink")
	public WebElement account;

	@FindBy(id = "search")
	public WebElement all;

	@FindBy(xpath = "//div//span[text ()='Electronics']")
	public WebElement Electronics;

	@FindBy(xpath = "//span[text ()='Computers']")
	public WebElement Computers;
	
	@FindBy(xpath = "//span[text ()='Accessories']")
	public WebElement Accessiries;
	
	@FindBy(xpath = "//span[text ()='Networking']")
	public WebElement Networking;
	
	@FindBy(xpath = "//span[text ()='Athletic Clothing']")
	public WebElement AtheticClothing;
	
	@FindBy(xpath = "//span[text ()='Exercise & Fitness']")
	public WebElement ExerciseFitness;
	
	@FindBy(xpath = "//span[text ()='Automative Parts & Accessories']")
	public WebElement AutomativePartsAccessoriecs;
	
	@FindBy(xpath = "//span[text ()='MotorCycle & Powersports']")
	public WebElement MotorCyclePowerSports;
	
	@FindBy(xpath = "//div//option[text()='Smart Home']")
	public WebElement smartHome;
	
	@FindBy(xpath = "//div//span[text()='Smart Home']")
	public WebElement SmartHome;

	@FindBy(xpath = "//div//span[text()='Smart Home Lightning']")
	public WebElement SmartHomeLighting;
	
	@FindBy(xpath = "//div//span[text()='Plugs and Outlets']")
	public WebElement PlugsAndOultlets;
	
	@FindBy(xpath = "//span[text ()='Sports']")
	public WebElement sports;

	@FindBy(xpath = "//span[text ()='Automative']")
	public WebElement automative;

	@FindBy(xpath = "//span[text()='TV & Video']")
	public WebElement TVAndVideo;

	@FindBy(xpath = "//span[text()='Video Games']")
	public WebElement videoGames;

	@FindBy(id = "email")
	public WebElement emailField;

	@FindBy(id = "password")
	public WebElement passwordField;

	@FindBy(xpath = "//option[text()='2']")
	public WebElement qtyTwo;

	@FindBy(id = "loginBtn")
	public WebElement loginBtn;

	@FindBy(xpath = "//span[text()='Add to Cart']")
	public WebElement addToTheCard;

	@FindBy(className = "products__name")
	public WebElement itemkassaoutdoor;

	@FindBy(id = "proceedBtn")
	public WebElement proccedBtn;

	@FindBy(id = "addAddressBtn")
	public WebElement addAddressBtn;

	@FindBy(id = "countryDropdown")
	public WebElement country;

	@FindBy(id = "fullNameInput")
	public WebElement fullName;

	@FindBy(id = "phoneNumberInput")
	public WebElement phoneNumberInput;

	@FindBy(id = "streetInput")
	public WebElement streetInput;

	@FindBy(id = "apartmentInput")
	public WebElement apartmentInput;

	@FindBy(id = "cityInput")
	public WebElement cityInput;

	@FindBy(xpath = "//select[@name='state']//self::select")
	public WebElement state;

	@FindBy(id = "addressBtn")
	public WebElement addressBtn;

	@FindBy(id = "zipCodeInput")
	public WebElement zipCodeInput;

	@FindBy(id = "addPaymentBtn")
	public WebElement addPaymentBtn;

	@FindBy(id = "cardNumberInput")
	public WebElement cardNumberInput;

	@FindBy(id = "nameOnCardInput")
	public WebElement nameOnCardInput;

	@FindBy(id = "expirationMonthInput")
	public WebElement expirationMonthInput;

	@FindBy(id = "expirationYearInput")
	public WebElement expirationYearInput;

	@FindBy(id = "securityCodeInput")
	public WebElement securityCodeInput;

	@FindBy(id = "paymentSubmitBtn")
	public WebElement paymentSubmitBtn;

	@FindBy(id = "placeOrderBtn")
	public WebElement placeOrderBtn;

	@FindBy(className = "Toastify")
	public WebElement orderPlacedSuccessfully;

	@FindBy(xpath = "//option[text()='5']")
	public WebElement qty5;

	@FindBy(id = "cartQuantity")
	public WebElement qtyFive;

	@FindBy(id = "orderLink")
	public WebElement orderLink;

	@FindBy(xpath = "//p[text()='Show Details']")
	public WebElement showDetails;

	@FindBy(id = "cancelBtn")
	public WebElement cancelBttn;

	@FindBy(xpath = "//option[text()='Bought wrong item']")
	public WebElement reasonforreturn;

	@FindBy(id = "orderSubmitBtn")
	public WebElement cancelOrderSubmitBtn;

	@FindBy(xpath = "//p[text()='Your Order Has Been Cancelled']")
	public WebElement yourOrderCancelled;
	
	@FindBy(id = "returnBtn")
	public WebElement returnItemsBtn;
	
	@FindBy(xpath = "//option[text()='Item damaged']")
	public WebElement damgeItemReturn;
	
	@FindBy(xpath="//option[text()='FedEx']")
	public WebElement fedExDropoff;
	
	@FindBy(id = "orderSubmitBtn")
	public WebElement returnOrderBtn;
	
	@FindBy(xpath = "//p[text()='Return was successfull']")
	public WebElement returnWasSuccessfully;
	
	@FindBy(id = "reviewBtn")
	public WebElement reviwBtn;
	
	@FindBy(id="headlineInput")
	public WebElement addaHeadline;
	
	@FindBy(id="descriptionInput")
	public WebElement reiewDescription;
	
	@FindBy(id="reviewSubmitBtn")
	public WebElement reviewSubmitBtn;
	
	@FindBy(xpath = "//div[text()='Your review was added successfully']")
	public WebElement yourReviewMesg;
	
}
