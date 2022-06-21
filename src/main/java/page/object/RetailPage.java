package page.object;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RetailPage extends Base{
	
	String paymentMethod = "";
	boolean affiliateAccountExists = false;

	
	public RetailPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//a[text()='TEST ENVIRONMENT']")
	private WebElement retailWeb;
	
	@FindBy(xpath ="//a[@title='My Account']")
	private WebElement myAccount;
	
	@FindBy(xpath ="//li/a[text()='Login']")
	private WebElement login;
	
	@FindBy(xpath ="//input[@name='email']")
	private WebElement username; //comes under same stepDef
	
	@FindBy(xpath ="//input[@id='input-password']")
	private WebElement password; //comes under same stepDef
	
	@FindBy(xpath ="//input[@value='Login']")
	private WebElement loginButton;
	
	@FindBy(xpath ="//a[text()='Account']")
	private WebElement dashBoard;
//	
//	@FindBy(xpath ="//*[@id=\"content\"]/ul[3]/li/a")
//	private WebElement affiliateAccount;
//	
//	@FindBy(xpath ="//input[@id='input-company']")
//	private WebElement companyName; //comes under same stepDef method
//	
//	@FindBy(xpath ="//input[@id='input-website']")
//	private WebElement websiteName; //comes under same stepDef method
//	
//	@FindBy(xpath ="//input[@id='input-tax']")
//	private WebElement taxName; //comes under same stepDef method
//	
//	@FindBy(xpath ="//input[@value='paypal']")
//	private WebElement paymentMethodPaypal; //comes under same stepDef method
//	
//	@FindBy(xpath ="//input[@value='cheque']")
//	private WebElement paymentMethodCheque;//newly added
//	
//	@FindBy(xpath ="//input[@value='bank']")//newly added
//	private WebElement paymentMethodBankTransfer;
//	
//	@FindBy(xpath ="//input[@placeholder='Cheque Payee Name']")//link changed! 
//	private WebElement payeeNameCheque; //newly added
//	
//	@FindBy(xpath = "//input[@placeholder='PayPal Email Account']")
//	private WebElement payeeNamePaypal;
//	
//	@FindBy(xpath ="//*[@id=\"content\"]/form/div/div/input[1]")
//	private WebElement checkBox;
//	
//	@FindBy(xpath ="//input[@value='Continue']")
//	private WebElement continueButtonZero;
//	
//	@FindBy(xpath ="/html/body/div[2]/div[1]")
//	private WebElement messageZero;
	
	@FindBy(xpath = "//a[text()='Register for an affiliate account']")
	private WebElement registerAsAffiliateUserLink;

	@FindBy(xpath = "//input[@id='input-company']")
	private WebElement companyInput;

	@FindBy(xpath = "//input[@id='input-website']")
	private WebElement websiteInput;

	@FindBy(xpath = "//input[@id='input-tax']")
	private WebElement taxIDInput;

	@FindBy(xpath = "//label[normalize-space()='PayPal']")
	private WebElement paymentMethodRadioButtonPayPal;

	@FindBy(xpath = "//input[@id='input-paypal']")
	private WebElement inputPayPalEmailAccount;

	@FindBy(xpath = "//label[normalize-space()='Cheque']")
	private WebElement paymentMethodRadioButtonCheque;

	@FindBy(xpath = "//input[@id='input-cheque']")
	private WebElement inputChequePayeeName;

	@FindBy(xpath = "//input[@name='agree']")
	private WebElement aboutUsRadioButton;

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButtonAffiliateUser;

	@FindBy(xpath = "//div[text()=' Success: Your account has been successfully updated.']")
	private WebElement successMessageAffiliateUserCreated;
	
	@FindBy(xpath ="//a[contains(text(),'Edit your affiliate information')]")
	private WebElement editAffiliateLink;
	
	@FindBy(xpath ="//input[@value='bank']")
	private WebElement bankTransferRadio;
	
	@FindBy(xpath ="//input[@id='input-bank-name']")
	private WebElement bankName; //same stepDef 
	
	@FindBy(xpath ="//input[@id='input-bank-branch-number']")
	private WebElement abaNumber; //same stepDef 
	
	@FindBy(xpath ="//input[@id='input-bank-swift-code']")
	private WebElement swiftCode; //same stepDef 
	
	@FindBy(xpath ="//input[@id='input-bank-account-name']")
	private WebElement accountName; //same stepDef 
	
	@FindBy(xpath ="//input[@id='input-bank-account-number']")
	private WebElement accountNumber; //same stepDef 
	
	@FindBy(xpath ="//input[@value='Continue']")
	private WebElement bankContineButton;
	
	@FindBy(xpath ="//div/div[@class='alert alert-success alert-dismissible']")
	private WebElement messageTwo;
	
	@FindBy(xpath ="//li/a[contains(text(),'Edit your account information')]")
	private WebElement accountInfo;
	
	@FindBy(xpath ="//input[@placeholder='First Name']")
	private WebElement firstName; //same stepDef 
	
	@FindBy(xpath ="//input[@placeholder='Last Name']")
	private WebElement lastName;
	
	@FindBy(xpath ="//input[@placeholder='E-Mail']")
	private WebElement email;
	
	@FindBy(xpath ="//input[@placeholder='Telephone']")
	private WebElement telephone;
	
	@FindBy(xpath ="//input[@class='btn btn-primary']")
	private WebElement continueButtonTwo;
	
	@FindBy(xpath ="/html/body/div[2]/div[1]")
	private WebElement messageLast;
	
	public boolean retailWebDisplayed() {
		if(retailWeb.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void clickMyAccount() {
		myAccount.click();
	}
	public void clickLogin() {
		login.click();
	}
	public void sendUsername(String username2) {
		username.sendKeys(username2);//comes under same stepDef
		
	}
	public void sendPassword(String password2) {
		password.sendKeys(password2);//comes under same stepDef
		
	}
	public void clickLoginButton() {
		loginButton.click();
	}
	public boolean dashBoardDisplayed() {
		if(dashBoard.isDisplayed())
			return true;
		else
			return false;
	}
	//=========================================

	//=======================================
//	public void clickAffiliateAccount() {
//		try {
//			affiliateAccount.click();
//			affiliateAccountExists = true;
//		} catch (NoSuchElementException e) {
//			logger.error("Registration link does not exist: Affliate account already exists.");
//			affiliateAccountExists = false;
//		}
//		
//	}
//	public void sendCompanyName(String ComName) {//the following 4 come under same step def
//		if(affiliateAccountExists) {
//			companyName.sendKeys(ComName);
//		}else {
//			logger.info("Company name skipped: affiliate account already exists");
//		}
//	}
//	public void sendWebsiteName(String website) {//same stepDef
//		if(affiliateAccountExists) {
//			websiteName.sendKeys(website);
//		}else {
//			logger.info("Website skipped: affiliate account already exists");
//		}
//		
//		
//	}
//	public void sendTaxName(String tax) {//same stepDef
//		if(affiliateAccountExists) {
//			taxName.sendKeys(tax);
//		}else {
//			logger.info("TaxID skipped: affiliate account already exists");
//		}
//		
//		
//	}
//	public void clickPaymentMethod(String method) {//same stepDef
//		if(affiliateAccountExists) {
//			switch(method) {
//			case "PayPal":
//				paymentMethodPaypal.click();
//				paymentMethod = "PayPal";
//				break;
//			case "Cheque":
//				paymentMethodCheque.click();
//				paymentMethod = "Cheque";
//				break;
//			case "Bank Transfer":
//				paymentMethodBankTransfer.click();
//				paymentMethod = "Bank Transfer";
//				break;
//			}
//		}else {
//			logger.info("Payment Method skipped: affiliate account already exists");
//		}
//		
//	}
//	
//	public void sendPayeeName(String payee) {//same stepDef
//		if(affiliateAccountExists) {
//			if(paymentMethod.equals("Cheque")) {
//				payeeNameCheque.sendKeys(payee);
//			} else if(paymentMethod.equals("PayPal")) {
//				payeeNamePaypal.sendKeys(payee);
//			}
//		}else {
//			logger.info("Payee Name skipped: affiliate account already exists");
//		}	
//	}
//	public void clickCheckBox() {//same stepDef
//		if(affiliateAccountExists) {
//			checkBox.click();
//		}else {
//			logger.info("About us checkbox skipped: affiliate account already exists");
//		}	
//		
//	}
//	public void clickContinueButtonZero() {
////		if(affiliateAccountExists) {
////			System.out.println("CONTINUE BUTTON ERROR ====>" + affiliateAccountExists);
//			continueButtonZero.click();
////		}else {
////			logger.info("Continue button skipped: affiliate account already exists");
////		}
//		
//	}
//	public boolean messageZeroDisplayed() {
//		if(affiliateAccountExists) {
//			if(messageZero.isDisplayed())
//				return true;
//			else
//				return false;
//		}else {
//			logger.info("Continue button skipped: affiliate account already exists");
//			return false;
//		}		
//	}
	
	public void clickOnRegisterAsAffiliateAccountLink() {
		registerAsAffiliateUserLink.click();
	}

	public void enterCompanyName(String companyName) {
		companyInput.sendKeys(companyName);
	}

	public void enterwebsite(String websiteName) {
		websiteInput.sendKeys(websiteName);
	}

	public void enterTaxID(String taxID) {
		taxIDInput.sendKeys(taxID);
	}

	public void selectPaymentMethod(String paymentMethod, String chequePayeOrPaypalEmail) {
		if (paymentMethod.equals("cheque")) {
			paymentMethodRadioButtonCheque.click();
			if (inputChequePayeeName.isEnabled() && inputChequePayeeName.isDisplayed()) {
				inputChequePayeeName.sendKeys(chequePayeOrPaypalEmail);
			}
		}

		else if (paymentMethod.equals("paypal")) {
			paymentMethodRadioButtonPayPal.click();
			if (inputPayPalEmailAccount.isEnabled() && inputPayPalEmailAccount.isDisplayed()) {
				inputPayPalEmailAccount.sendKeys(chequePayeOrPaypalEmail);
			}
		}
	}

	public void clickOnAboutUsOption() {
		aboutUsRadioButton.click();
	}

	public void clickOnContinueButtonAffiliateUser() {
		continueButtonAffiliateUser.click();
	}

	public boolean successMessageAffiliateUserCreatedIsDisplayed() {
		if (successMessageAffiliateUserCreated.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	
	
	public void clickEditAffiliateLink() {
		editAffiliateLink.click();
	}
	public void clickBankTransferRadio() {//same stepDef
		bankTransferRadio.click();
	}
	public void sendBankName(String bankName1) {//same stepDef
		bankName.sendKeys(bankName1);
		
	}
	public void sendAbaNumber(String abaNumber1) {//same stepDef
		abaNumber.sendKeys(abaNumber1);
		
	}
	public void sendSwiftCode(String swift) {//same stepDef
		swiftCode.sendKeys(swift);
		
	}
	public void sendAccountName(String account) {//same stepDef
		accountName.sendKeys(account);
		
	}
	public void sendAccountNumber(String accNumber) {//same stepDef
		accountNumber.sendKeys(accNumber);
		
	}
	public void clickBankContineButton() {
		bankContineButton.click();
	}
	public boolean messageTwoDisplayed() {
		if(messageTwo.isDisplayed())
			return true;
		else
			return false;
	}
	public void clickAccountInfo() {
		accountInfo.click();
	}
	public void sendFirstName(String fName) {//same stepDef
		firstName.sendKeys(fName);
		
	}
	public void sendLastName(String lName) {//same stepDef
		lastName.sendKeys(lName);
		
	}
	public void sendEmail(String email2) {//same stepDef
		email.sendKeys(email2);
		
	}
	public void sendTelephone(String phone) {//same stepDef
		telephone.sendKeys(phone);
		
	}
	public void clickContinueButtonTwo() {
		continueButtonTwo.click();
	}
	public boolean messageLastDisplayed() {
		if(messageLast.isDisplayed())
			return true;
		else 
			return false;
	}
	
	
	
	
	

}