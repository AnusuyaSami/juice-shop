package selenium;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class JuiceShop {

	public static WebDriver driver;
	String URL = "https://juice-shop.herokuapp.com/#/login ";
	String generatedString = RandomStringUtils.randomAlphanumeric(10);
	@FindBy(xpath = "//span[contains(text(),'Dismiss')]")
	WebElement dismissBtn;
	@FindBy(xpath = "//a[contains(text(),'Me want it!')]")
	WebElement cookieBtn;
	@FindBy(xpath = "//a[@href='#/register']")
	WebElement notyetcustomer;

	@FindBy(id = "emailControl")
	WebElement emailID;
	@FindBy(id = "passwordControl")
	WebElement password;
	@FindBy(id = "repeatPasswordControl")
	WebElement confirmPassword;
	@FindBy(xpath = "//span[@class='mat-slide-toggle-bar']")
	WebElement showPassword;
	@FindBy(xpath = "//span[contains(@class,'mat-select-placeholder mat-select-min-line')]")
	WebElement securityQnBox;
	@FindBy(xpath = "//span[contains(text(),'Your eldest siblings middle name?')]")
	WebElement securityQn;
	@FindBy(id = "securityAnswerControl")
	WebElement securityQnAns;
	@FindBy(id = "registerButton")
	WebElement registerBtn;

	@FindBy(id = "email")
	WebElement loginEmailID;
	@FindBy(id = "password")
	WebElement loginPassword;
	@FindBy(id = "loginButton")
	WebElement loginBtn;

	@FindBy(xpath = "//*[contains(text(),' Apple Juice (1000ml)')]/../../..//*[contains(text(),'Add to Basket')]")
	WebElement appleJuiceaddCartBtn;
	@FindBy(xpath = "//img[@src='assets/public/images/products/lemon_juice.jpg']")
	WebElement lemonJuice;
	@FindBy(xpath = "//*[contains(text(),' Lemon Juice (500ml) ')]/../../..//*[contains(text(),'Add to Basket')]")
	WebElement lemonJuiceaddCartBtn;
	@FindBy(xpath = "//div[2]/button[2]")
	WebElement nextpageBtn;

	@FindBy(xpath = "//*[contains(text(),'CTF Girlie-Shirt')]/../../..//*[contains(text(),'Add to Basket')]")
	WebElement ctfgirleShritBtn;
	@FindBy(xpath = "//img[src='assets/public/images/products/sticker_single.jpg']")
	WebElement StickerSingle;
	@FindBy(xpath = "//*[contains(text(),'Sticker Single')]/../../..//*[contains(text(),'Add to Basket')]")
	WebElement stickerSingleBtn;

	@FindBy(xpath = "//*[contains(text(),'Orange Juice (1000ml)')]/../../..//*[contains(text(),'Add to Basket')]")
	WebElement orangeJuiceBtn;
	@FindBy(xpath = "//img[@src='assets/public/images/products/raspberry_juice.jpg']")
	WebElement RaspberryJuice;
	@FindBy(xpath = "//*[contains(text(),'Raspberry Juice (1000ml)')]/../../..//*[contains(text(),'Add to Basket')]")
	WebElement RaspberryJuiceBtn;

	@FindBy(xpath = "//button[@routerlink='/basket']")
	WebElement basketBtn;
	@FindBy(xpath = "//mat-cell[contains(text(),'Apple Juice')]/..//button[2]")
	WebElement addappleJuiceQn;
	@FindBy(xpath = "//mat-cell[contains(text(),'Lemon Juice (500ml)')]/..//button[2]")
	WebElement addlemonJuiceQn;
	@FindBy(xpath = "//mat-cell[contains(text(),'Shop CTF Girlie-Shirt ')]/..//button[2]")
	WebElement addGirlieShritQn;
	@FindBy(xpath = "//mat-cell[contains(text(),'Sticker Single')]/..//button[2]")
	WebElement addStickersingleQn;
	@FindBy(xpath = "//mat-cell[contains(text(),'Orange Juice (1000ml)')]/..//button[2]")
	WebElement addOrangeJuiceQn;
	@FindBy(xpath = "//mat-cell[contains(text(),'Raspberry Juice (1000ml)')]/..//button[2]")
	WebElement addRaspberryJuiceQn;
	@FindBy(xpath = "//mat-cell[contains(text(),'Raspberry Juice (1000ml)')]/..//button[2]")
	WebElement addRaspberryJuiceQn1;
	@FindBy(xpath = "//*[contains(text(),' Checkout')]")
	WebElement checkOutBtn;

	@FindBy(xpath = "//span[contains(text(),'Add New Address')]")
	WebElement newAddress;
	@FindBy(id = "mat-input-1")
	WebElement countryBox;
	@FindBy(id = "mat-input-2")
	WebElement nameBox;
	@FindBy(id = "mat-input-3")
	WebElement mobileNo;
	@FindBy(id = "mat-input-4")
	WebElement zipCode;
	@FindBy(id = "address")
	WebElement address;
	@FindBy(id = "mat-input-6")
	WebElement city;
	@FindBy(id = "mat-input-7")
	WebElement state;
	@FindBy(xpath = "//i[contains(text(),'send')]")
	WebElement submitBtn;
	@FindBy(xpath = "//span[@class='mat-radio-container']")
	WebElement selectAddress;
	@FindBy(xpath = "//*[contains(text(),'Continue')]")
	WebElement continueBtn;
	@FindBy(xpath = "//*[@id='mat-radio-43']//span[@class='mat-radio-container']")
	WebElement oneDayDelivery;

	@FindBy(id = "mat-expansion-panel-header-0")
	WebElement addNewCard;
	@FindBy(id = "mat-input-8")
	WebElement cardName;
	@FindBy(id = "mat-input-9")
	WebElement cardNo;
	@FindBy(id = "mat-input-10")
	WebElement expiryDate;
	@FindBy(id = "submitButton")
	WebElement submit2Btn;

	@FindBy(id = "mat-expansion-panel-header-1")
	WebElement addCouponBtn;
	@FindBy(id = "coupon")
	WebElement CouponCodeBtn;
	@FindBy(xpath = "//span[contains(text(),'Redeem')]")
	WebElement redeemBtn;
	String cpnerrormsg;

	@FindBy(xpath = "//*[@id='mat-radio-46-input']/..//../span")
	WebElement cardSelcBtn;
	@FindBy(id = "checkoutButton")
	WebElement placeOrderBtn;
	@FindBy(id = "navbarAccount")
	WebElement myAccountBtn;
	@FindBy(xpath = "//div[2]//*[contains(text(),'Orders & Payment')]")
	WebElement ODandPayment;
	@FindBy(xpath = "//*[contains(text(),' Order History ')]")
	WebElement orderHistory;
	@FindBy(xpath = "//*[contains(text(),' note ')]")
	WebElement prntOrderBtn;
	@FindBy(xpath = "//*[contains(text(),'local_shipping')]")
	WebElement trackOrder;
	@FindBy(id = "navbarLogoutButton")
	WebElement logoutBtn;

	void homepage() {

		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		PageFactory.initElements(driver, this);
		dismissBtn.click();
		cookieBtn.click();
		notyetcustomer.click();
	}

	public void register() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		emailID.sendKeys(generatedString + "@gmail.com");
		password.sendKeys("Abcde!23");
		confirmPassword.sendKeys("Abcde!23");
		// showPassword.click();
		securityQnBox.click();
		securityQn.click();
		securityQnAns.sendKeys("thamarai");
		WebElement registerBtn = new WebDriverWait(driver, Duration.ofSeconds(5))
				.until(ExpectedConditions.elementToBeClickable(By.id("registerButton")));
		registerBtn.click();
	}

	public void login() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		loginEmailID.click();
		loginEmailID.sendKeys(generatedString + "@gmail.com");
		loginPassword.click();
		loginPassword.sendKeys("Abcde!23");
		loginBtn.click();
	}

	public void firstPageItems() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		appleJuiceaddCartBtn.click();
		Actions action = new Actions(driver);
		action.scrollToElement(lemonJuice).perform();
		WebElement lemonJuiceaddCartBtn = new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions
				.elementToBeClickable(By.xpath("//mat-grid-tile[10]//*[contains(text(),'Add to Basket')]")));
		lemonJuiceaddCartBtn.click();

		Actions action1 = new Actions(driver);
		action1.scrollToElement(nextpageBtn).perform();
		nextpageBtn.click();
	}

	public void secondPageItems() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		ctfgirleShritBtn.click();
		Actions action = new Actions(driver);
		action.scrollToElement(stickerSingleBtn).perform();
		WebElement stickerSingleBtn = new WebDriverWait(driver, Duration.ofSeconds(15))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(
						"//*[contains(text(),'Sticker Single')]/../../..//*[contains(text(),'Add to Basket')]")));
		stickerSingleBtn.click();

		Actions action1 = new Actions(driver);
		action1.scrollToElement(nextpageBtn).perform();
		nextpageBtn.click();
	}

	public void thirdPageItems() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions action = new Actions(driver);
		action.scrollToElement(orangeJuiceBtn).perform();
		orangeJuiceBtn.click();
		WebElement RaspberryJuiceBtn = new WebDriverWait(driver, Duration.ofSeconds(15))
				.until(ExpectedConditions.elementToBeClickable(By.xpath(
						"//*[contains(text(),'Raspberry Juice (1000ml)')]/../../..//*[contains(text(),'Add to Basket')]")));
		RaspberryJuiceBtn.click();

		Actions action1 = new Actions(driver);
		action1.scrollToElement(nextpageBtn).perform();
		nextpageBtn.click();
	}

	public void shoppingCart() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		basketBtn.click();
		addappleJuiceQn.click();
		addlemonJuiceQn.click();
		addGirlieShritQn.click();
		addStickersingleQn.click();
		Actions action1 = new Actions(driver);
		action1.scrollToElement(addOrangeJuiceQn).perform();
		addOrangeJuiceQn.click();
		driver.navigate().refresh();
		WebElement addRaspberryJuiceQn1 = driver
				.findElement(By.xpath("//mat-cell[contains(text(),'Raspberry Juice (1000ml)')]/..//button[2]"));
		addRaspberryJuiceQn1.click();
		checkOutBtn.click();

	}

	public void newAddress() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		newAddress.click();
		driver.navigate().refresh();
		countryBox.click();
		countryBox.sendKeys("United States");
		nameBox.click();
		nameBox.sendKeys("Kavya");
		mobileNo.click();
		mobileNo.sendKeys("1021511156");
		zipCode.click();
		zipCode.sendKeys("19341");
		address.click();
		address.sendKeys("121 grove dr");
		city.click();
		city.sendKeys("Easton");
		state.click();
		state.sendKeys("pennsylvania");
		submitBtn.click();

		WebElement selectAddress = new WebDriverWait(driver, Duration.ofSeconds(35))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='mat-radio-container']")));
		selectAddress.click();
		continueBtn.click();
		WebElement oneDayDelivery = new WebDriverWait(driver, Duration.ofSeconds(35)).until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id='mat-radio-43']//span[@class='mat-radio-container']")));
		oneDayDelivery.click();
		continueBtn.click();

	}

	public void paymentoption() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		addNewCard.click();
		cardName.click();
		cardName.sendKeys("Kavya Thamarai");
		cardNo.click();
		cardNo.sendKeys("5231 5633 6543 4455");
		WebElement expiryDate = driver.findElement(By.id("mat-input-10"));

		Select dropdown = new Select(expiryDate);
		dropdown.selectByValue("3");

		WebElement expiryYear = driver.findElement(By.id("mat-input-11"));

		Select dropdown2 = new Select(expiryYear);
		dropdown2.selectByValue("2088");

		submit2Btn.click();

	}

	public void couponOption() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement addCouponBtn = new WebDriverWait(driver, Duration.ofSeconds(15))
				.until(ExpectedConditions.elementToBeClickable(By.id("mat-expansion-panel-header-1")));
		addCouponBtn.click();

		CouponCodeBtn.click();
		CouponCodeBtn.sendKeys("1234567890");
		redeemBtn.click();
		String cpnerrormsg = driver.findElement(By.xpath("//div[contains(text(),'Invalid coupon.')]")).getText();
		System.out.println(cpnerrormsg);

	}

	public void reviewOption() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		cardSelcBtn.click();
		continueBtn.click();
	}

	public void placeOrder() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		placeOrderBtn.click();
	}

	public void myAccount() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		myAccountBtn.click();
		ODandPayment.click();
		orderHistory.click();
		prntOrderBtn.click();
		trackOrder.click();
		myAccountBtn.click();
		Actions action = new Actions(driver);
		action.scrollToElement(logoutBtn).perform();
		WebElement logoutBtn = new WebDriverWait(driver, Duration.ofSeconds(15))
				.until(ExpectedConditions.elementToBeClickable(By.id("navbarLogoutButton")));
		logoutBtn.click();
	}

	public static void main(String[] args) {

		JuiceShop obj = new JuiceShop();
		obj.homepage();
		obj.register();
		obj.login();
		obj.firstPageItems();
		obj.secondPageItems();
		obj.thirdPageItems();
		obj.shoppingCart();
		obj.newAddress();
		obj.paymentoption();
		obj.couponOption();
		obj.reviewOption();
		obj.placeOrder();
		obj.myAccount();
	}
}