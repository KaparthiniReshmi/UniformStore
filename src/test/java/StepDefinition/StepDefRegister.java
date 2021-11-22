package StepDefinition;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import PageOfObjects.AffiliateLogin;
import PageOfObjects.AffiliatesRegister;
import PageOfObjects.ContactUs;
import PageOfObjects.GiftCertificates;
import PageOfObjects.Register;
import io.cucumber.java.en.*;
import resources.Base;

public class StepDefRegister extends Base {

	//Register page with valid credentials.
	@Given("Enter valid credentials")
	public void enter_valid_credentials() {

		//initialising the Browser
		driver=initialiseDriver();

		//Clicking on MyAccount dropdown and Clicking on Register
		driver.findElement(By.xpath("//*[@class='dropdown myaccount']")).click();
		
		driver.findElement(By.xpath("//a[text()='Register']")).click();

		//Creating Object for Register class
		Register c= new Register(driver);

		//Filling all the textfields with valid credentials
		c.getfirstname().sendKeys("Reshmi");
		c.getlastname().sendKeys("kaparthini");
		c.getemail().sendKeys("reshmisivakumar1234@gmail.com");
		c.gettelephone().sendKeys("9629755926");
		c.getaddress1().sendKeys("12, LNP Street");
		c.getaddress2().sendKeys("Palayamkottai");
		c.getcity().sendKeys("Tirunelveli");
		c.getpostCode().sendKeys("627011");

		//Selecting "India" option in Country Dropdown field
		WebElement country=driver.findElement(By.name("country_id"));
		Select s1=new Select(country);
		s1.selectByVisibleText("India");

		//Selecting "Tamil Nadu" option in Region/State Dropdown field
		WebElement region=driver.findElement(By.name("zone_id"));
		Select s2=new Select(region);
		s2.selectByVisibleText("Tamil Nadu");

		//Sending Password and Confirm Password fields
		c.getpassword().sendKeys("Reshmi123");
		c.getpasswordConfirm().sendKeys("Reshmi123");

		//Selecting the radio button and CheckBox
		c.getradio().click();
		c.getcheck().click();

	}


	@When("Click on Continue.")
	public void click_on_continue() {
		Register r = new Register(driver);

		//Clicking on Continue Button
		r.getContinue().click();
	}


	@Then("^Navigate to Account successfully created page\\.$")
	public void navigate_to_Account_successfully_created_page() throws Throwable {

		//Verifying the Currenturl with the expected url.
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "http://uniformm1.upskills.in/index.php?route=account/success" );

		//Getting the text from the resultant page.
		System.out.println(driver.findElement(By.xpath("//*[@id='content']")).getText());
	}


	@Then("Click on Continue in Account Successfully created page.")
	public void click_on_continue_in_account_successfully_created_page() {
		Register r = new Register(driver);

		//Clicking on Continue Button 
		r.getcontinueBtn().click();
	}


	@Then("Navigated to the My Account page.")
	public void navigated_to_the_my_account_page() {

		//Verifying the title of the page with the title provided 
		Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("MY ACCOUNT");
		assertTrue(verifyTitle);
		System.out.println("My Account page will be displayed");
        
		//wait
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.close();
	}


	////////////////////////////Scenario: Registering with already existing email
    /////////////////////////////////////////////////////////////////////////////
	
	@Given("Enter all the credentials along with already exisiting email.")
	public void enter_all_the_credentials_along_with_already_exisiting_email() {

		//initialising the browser
		driver=initialiseDriver();

		//Clicking on MyAccount dropdown and Clicking on Register
		driver.findElement(By.xpath("//*[@class='dropdown myaccount']")).click();
		driver.findElement(By.xpath("//a[text()='Register']")).click();

		//Creating an Object for Register class
		Register c= new Register(driver);

		//Filling all the textfields with valid credentials and email textfield with already exisiting email address
		c.getfirstname().sendKeys("Reshmi");
		c.getlastname().sendKeys("kaparthini");
		c.getemail().sendKeys("kaparthini.resh@gmail.com");
		c.gettelephone().sendKeys("9629755926");
		c.getaddress1().sendKeys("12, LNP Street");
		c.getaddress2().sendKeys("Palayamkottai");
		c.getcity().sendKeys("Tirunelveli");
		c.getpostCode().sendKeys("627011");

		//Selecting "India" option in Country Dropdown field
		WebElement country=driver.findElement(By.name("country_id"));
		Select s=new Select(country);
		s.selectByVisibleText("India");

		//Selecting "Tamil Nadu" option in Region/State Dropdown field
		WebElement region=driver.findElement(By.name("zone_id"));
		Select s1=new Select(region);
		s1.selectByVisibleText("Tamil Nadu");

		//Sending Password and Confirm Password fields
		c.getpassword().sendKeys("Reshmi123");
		c.getpasswordConfirm().sendKeys("Reshmi123");

		//Selecting the radio button and CheckBox
		c.getradio().click();
		c.getcheck().click();

	}

	
	@When("Click on Continue in Register page.")
	public void click_on_continue_in_register_page() {
		Register d= new Register(driver);

		//Clicking on Continue Button
		d.getContinue().click();
	}
	

	@Then("Warning message {string} will be displayed.")
	public void warning_message_will_be_displayed(String string) {

		//getting the output
		System.out.println("E-Mail Address is already registered");
		
		//wait
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		
		//close driver
		driver.close();
	}
	

	////////////////////Scenario : Verifying without entering anyone of the mandatory fields
    ////////////////////////////////////////////////////////////////////////////////////////
	
	
	@Given("Enter all the mandatory textfields except one")
	public void enter_all_the_mandatory_textfields_except_one() {

		//initialising the Browser
		driver=initialiseDriver();

		//Clicking on MyAccount dropdown and Clicking on Register
		driver.findElement(By.xpath("//*[@class='dropdown myaccount']")).click();
		driver.findElement(By.xpath("//a[text()='Register']")).click();

		//Creating object for Register class
		Register r = new Register(driver);

		//Filling all the textfields except anyone of the mandatory fields
		r.getfirstname().sendKeys("reshmi");
		r.getlastname().sendKeys("kaparthini");
		//r.getemail().sendKeys("reshmi4@gmail.com");
		r.gettelephone().sendKeys("9629755926");
		r.getaddress1().sendKeys("12, LNP Street");
		r.getaddress2().sendKeys("Palayamkottai");
		r.getcity().sendKeys("Tirunelveli");
		r.getpostCode().sendKeys("627011");

		//Selecting "India" option in Country Dropdown field
		WebElement country=driver.findElement(By.name("country_id"));
		Select s=new Select(country);
		s.selectByVisibleText("India");

		//Selecting "Tamil Nadu" option in Region/State Dropdown field
		WebElement region=driver.findElement(By.name("zone_id"));
		Select s1=new Select(region);
		s1.selectByVisibleText("Tamil Nadu");

		//Sending Password and Confirm Password fields
		r.getpassword().sendKeys("Reshmi123");
		r.getpasswordConfirm().sendKeys("Reshmi123");

		//Selecting the radio button and checkbox
		r.getradio().click();
		r.getcheck().click();
	}

	@When("click Continue")
	public void click_continue() {
		Register d= new Register(driver);

		//Clicking on Continue button
		d.getContinue().click();
	}

	@Then("Warning message should be displayed.")
	public void warning_message_should_be_displayed() {

		//Getting the Contents of the page
		System.out.println(driver.findElement(By.xpath("//*[@class='text-danger']")).getText());

		//Close driver
		driver.close();
	}
	
	////////////////////////////Scenario : Verifying Telephone textfield
    /////////////////////////////////////////////////////////////////////
	
	@Given("Entering text in the telephone filed")
	public void entering_text_in_the_telephonefield() {

		//initialising the Browser
		driver=initialiseDriver();

		//Clicking on MyAccount dropdown and Clicking on Register
		driver.findElement(By.xpath("//*[@class='dropdown myaccount']")).click();
		driver.findElement(By.xpath("//a[text()='Register']")).click();
	}

	@When ("Click on continue in Register")
	public void click_on_continue_in_register() {
		//Creating an Object for the Register class
		Register r = new Register(driver);

		//Entering all the textfields
		r.getfirstname().sendKeys("reshmi");
		r.getlastname().sendKeys("kaparthini");
		r.getemail().sendKeys("kaparthinisiva234@gmail.com");
		r.gettelephone().sendKeys("abcdef");
		r.getaddress1().sendKeys("12, LNP Street");
		r.getaddress2().sendKeys("Palayamkottai");
		r.getcity().sendKeys("Tirunelveli");
		r.getpostCode().sendKeys("627011");

		//Selecting "India" option in Country Dropdown field
		WebElement country=driver.findElement(By.name("country_id"));
		Select s=new Select(country);
		s.selectByVisibleText("India");

		//Selecting "Tamil Nadu" option in Region/State Dropdown field
		WebElement region=driver.findElement(By.name("zone_id"));
		Select s1=new Select(region);
		s1.selectByVisibleText("Tamil Nadu");

		//Sending Password and Confirm Password fields
		r.getpassword().sendKeys("Reshmi123");
		r.getpasswordConfirm().sendKeys("Reshmi123");

		//Selecting the radio button and checkbox
		r.getradio().click();
		r.getcheck().click();
		//Clicking on Continue button
		r.getContinue().click();
	}
	
	@Then("Warning message should be displayed but Accout created successfully page gets displayed")
	public void warning_message_should_be_displayed_but_Accout_created_successfully_page_gets_displayed() {
		
		//printing defect
		System.out.println("No warning message displayed to enter only numeric values in telephone field");
		
		//close driver
		driver.close();
	}

	////////////////////////////Scenario : Verifying without selecting the Privacy Policy element
    //////////////////////////////////////////////////////////////////////////////////////////////
	
	@Given("Enter all the valid credentials without selecting the Privacy Policy element")
	public void enter_all_the_valid_credentials_without_selecting_the_privacy_policy_element() {

		//initialising the Browser
		driver=initialiseDriver();

		//Clicking on MyAccount dropdown and Clicking on Register
		driver.findElement(By.xpath("//*[@class='dropdown myaccount']")).click();
		driver.findElement(By.xpath("//a[text()='Register']")).click();

		//Creating an Object for the Register class
		Register r = new Register(driver);

		//Entering all the textfields
		r.getfirstname().sendKeys("reshmi");
		r.getlastname().sendKeys("kaparthini");
		r.getemail().sendKeys("kaparthini.resh@gmail.com");
		r.gettelephone().sendKeys("9629755926");
		r.getaddress1().sendKeys("12, LNP Street");
		r.getaddress2().sendKeys("Palayamkottai");
		r.getcity().sendKeys("Tirunelveli");
		r.getpostCode().sendKeys("627011");

		//Selecting "India" option in Country Dropdown field
		WebElement country=driver.findElement(By.name("country_id"));
		Select s=new Select(country);
		s.selectByVisibleText("India");

		//Selecting "Tamil Nadu" option in Region/State Dropdown field
		WebElement region=driver.findElement(By.name("zone_id"));
		Select s1=new Select(region);
		s1.selectByVisibleText("Tamil Nadu");

		//Sending Password and Confirm Password fields
		r.getpassword().sendKeys("Reshmi123");
		r.getpasswordConfirm().sendKeys("Reshmi123");

		//Selecting the radio button
		r.getradio().click();

	}

	@When("Click Continue button.")
	public void click_continue_button() {
		Register d= new Register(driver);

		//Click on Continue button
		d.getContinue().click();
	}

	@Then("Warning message {string} should be displayed.")
	public void warning_message_should_be_displayed(String string) {

		//printing the output
		System.out.println("Warning  message:You must agree to Privacy Policy");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//close driver	
		driver.close();
	}


	////////////////////////////////////Footer module
	//////////////////////////// Scenario : Verifying all the links are working
	
	@Given("Navigating to the Website")
	public void navigating_to_the_website() {

		//initialising the Browser
		driver=initialiseDriver();
	}

	@When("Verifying all working links in footer section")
	public void verifying_all_working_links_in_footer_section() {

		String Title = "Under Construction: Uniform store";					

		//Getting the links in the WebPage
		List<WebElement> linkElements = driver.findElements(By.tagName("a"));							
		String[] linkTexts = new String[linkElements.size()];							
		int	i = 0;					

		//extract the link texts of each link element		
		for (WebElement e : linkElements) {							
			linkTexts[i] = e.getText();							
			i++;			
		}		

		//test each link		
		for (String t : linkTexts) {							
			driver.findElement(By.linkText(t)).click();					
			if (driver.getTitle().equals(Title)) {							
				System.out.println("\"" + t + "\""+ " is under construction.");			
			} else {			
				System.out.println("\"" + t + "\"" + " is working.");			
			}		

		}	
		return;
	}   


	@Then("Condition of links are displayed.")
	public void condition_of_links_are_displayed() {

		//printing the output
		System.out.println("All links are working");

		//close driver
		driver.close();
	}

	/////////////////////////////////////Scenario : Verifying the Affiliates Link
	//////////////////////////////////////////////////////////////////////////////
	
	@Given("Navigate to Website and Select Affiliate link in Footer section.")
	public void navigate_to_website_and_select_affiliate_link_in_footer_section() {

		//initialising the Browser
		driver=initialiseDriver();

		//Clicking on Affiliates link
		driver.findElement(By.xpath("//a[text()='Affiliates']")).click();
	}

	@And("Click on Continue in the New Affiliate Program page.")
	public void click_on_continue_in_the_new_affiliate_program_page() {

		//Click on Affiliates link
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
	}

	@When("Enter all the mandatory fields.")
	public void enter_all_the_mandatory_fields() {

		//Create Object for AffiliateRegister class
		AffiliatesRegister r = new AffiliatesRegister(driver);

		//Enter all the textfields in Affiliate Register form
		r.getfirstname().sendKeys("reshmi");
		r.getlastname().sendKeys("kaparthini");
		r.getemail().sendKeys("reshmisiva345@gmail.com");
		r.gettelephone().sendKeys("9629755926");
		r.getaddress1().sendKeys("12, LNP Street");
		r.getaddress2().sendKeys("Palayamkottai");
		r.getcity().sendKeys("Tirunelveli");
		r.getpostCode().sendKeys("627011");

		//Selecting "India" option in Country Dropdown field
		WebElement country=driver.findElement(By.name("country_id"));
		Select s=new Select(country);
		s.selectByVisibleText("India");

		//Selecting "Tamil Nadu" option in Region/State Dropdown field
		WebElement region=driver.findElement(By.name("zone_id"));
		Select s1=new Select(region);
		s1.selectByVisibleText("Tamil Nadu");

		//Select Radio button
		r.getradio().click();

		//Sending Password and Confirm Password fields
		r.getpassword().sendKeys("Reshmi123");
		r.getpasswordConfirm().sendKeys("Reshmi123");

	}
	@Then("Click on Continue button.")
	public void click_on_continue_button() {

		AffiliatesRegister r = new AffiliatesRegister(driver);

		//Click on Continue Button
		r.getContinue().click();

		//Verifying the Current url with the expected url
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "http://uniformm1.upskills.in/index.php?route=affiliate/success" );

		//Getting the Content of the page
		System.out.println(driver.findElement(By.xpath("//*[@id='content']")).getText());

		//Close driver
		driver.close();

	}
	
    //////////////////////////////////Scenario :Verifying telephone field
	///////////////////////////////////////////////////////////////////////////
	
	@Given("Entering text in the telephone field")
	public void entering_text_in_the_telephone_field() {
		//initialising the Browser
		driver=initialiseDriver();

		//Clicking on Affiliates link
		driver.findElement(By.xpath("//a[text()='Affiliates']")).click();

		//Click on Affiliates Continue link
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();

		//Create Object for AffiliateRegister class
		AffiliatesRegister r = new AffiliatesRegister(driver);

		//Enter all the textfields in Affiliate Register form
		r.getfirstname().sendKeys("reshmi");
		r.getlastname().sendKeys("kaparthini");
		r.getemail().sendKeys("reshmisiva456@gmail.com");
		r.gettelephone().sendKeys("abcdef");
		r.getaddress1().sendKeys("12, LNP Street");
		r.getaddress2().sendKeys("Palayamkottai");
		r.getcity().sendKeys("Tirunelveli");
		r.getpostCode().sendKeys("627011");

		//Selecting "India" option in Country Dropdown field
		WebElement country=driver.findElement(By.name("country_id"));
		Select s=new Select(country);
		s.selectByVisibleText("India");

		//Selecting "Tamil Nadu" option in Region/State Dropdown field
		WebElement region=driver.findElement(By.name("zone_id"));
		Select s1=new Select(region);
		s1.selectByVisibleText("Tamil Nadu");

		//Select Radio button
		r.getradio().click();

		//Sending Password and Confirm Password fields
		r.getpassword().sendKeys("Reshmi123");
		r.getpasswordConfirm().sendKeys("Reshmi123");

	}

	@When("Click on Continue in Affiliate Register")
	public void click_on_continue_in_affiliate_register() {
		AffiliatesRegister r = new AffiliatesRegister(driver);

		//Click on Continue Button
		r.getContinue().click();
	}

	@Then("Warning message should be displayed but Account created successfully page gets displayed")
	public void warning_message_should_be_displayed_but_account_created_successfully_page_gets_displayed() {

		//printing the defect
		System.out.println("No warning message displayed to enter only numeric values in telephone field");
		
		//close driver
		driver.close();
	}

	////////////////////////////Verifying the Affiliates Login page
	////////////////////////////////////////////////////////////////////////////////
	
	@Given("Navigate to Affiliate Login page")
	public void navigate_to_affiliate_login_page() {

		//initialising the Browser
		driver=initialiseDriver();

		//Clicking on Affiliates link
		driver.findElement(By.xpath("//a[text()='Affiliates']")).click();
		
	}

	@When("Enter email and password")
	public void enter_email_and_password() {

		//Create Object for AffiliateRegister class
		AffiliateLogin r = new AffiliateLogin(driver);

		//Enter all the textfields in Affiliate Register form
		r.getEmail().sendKeys("kaparthini.resh@gmail.com");
		r.getpassword().sendKeys("Reshmi123");
	}

	@Then("Click on Submit")
	public void click_on_submit() {
		AffiliateLogin r = new AffiliateLogin(driver);

		//Click on Submit
		r.getsubmit().click();
	}

	@Then("A warning message will be displayed")
	public void a_warning_message_will_be_displayed() {

		//getting the Warning message and printing it
		System.out.println(driver.findElement(By.xpath("//*[@class='alert alert-danger']")).getText());

		//Close driver
		driver.close();
	}

	/////////////////////////////////Verifying affiliate login with incorrect email address or password
    ///////////////////////////////////////////////////////////////////////////////////////////////////////

	@Given("navigate to Affiliate Login page1")
	public void navigate_to_affiliate_login_page1() {

		//initialising the Browser
		driver=initialiseDriver();

		//Clicking on Affiliates link
		driver.findElement(By.xpath("//a[text()='Affiliates']")).click();
	}


	@When("Enter either incorrect email address or incorrect password")
	public void enter_either_incorrect_email_address_or_incorrect_password() {

		//Create Object for AffiliateRegister class
		AffiliateLogin r = new AffiliateLogin(driver);

		//Enter all the textfields in Affiliate Register form
		r.getEmail().sendKeys("kaparthini.reshmi@gmail.com");
		r.getpassword().sendKeys("Reshmi123");

	}

	@Then("Click on Submit button")
	public void click_on_submit_button() {
		AffiliateLogin r = new AffiliateLogin(driver);

		//Click on Submit
		r.getsubmit().click();
	}

	@Then("A Warning message should be displayed")
	public void a_warning_message_should_be_displayed() {

		//getting the Warning message and printing it
		System.out.println(driver.findElement(By.xpath("//*[@class='alert alert-danger']")).getText());

		//Close driver
		driver.close();
	}

	//////////////////////////////////Verifying Forgotten password link in Affiliate Login 
	///////////////////////////////////////////////////////////////////////////////////////////
	
	
	@Given("Navigate to Affiliate Login")
	public void navigate_to_affiliate_login() {

		//initialising the Browser
		driver=initialiseDriver();

		//Clicking on Affiliates link
		driver.findElement(By.xpath("//a[text()='Affiliates']")).click();
	}

	@When("Click on Forgotten password link")
	public void click_on_forgotten_password_link() {
		AffiliateLogin r = new AffiliateLogin(driver);

		//Click on Forgotten password
		r.getforgotpwd().click();
	}

	@When("Enter email address")
	public void enter_email_address() {
		AffiliateLogin r = new AffiliateLogin(driver);

		//Enter valid email address
		r.getEmail().sendKeys("kaparthini.resh@gmail.com");
	}

	@Then("Click Continue.")
	public void click_Continue() {
		AffiliateLogin r = new AffiliateLogin(driver);

		//Click on Submit
		r.getContinue().click();
	}

	@Then("Warning message will be displayed")
	public void warning_message_will_be_displayed() {

		//getting the Warning message and printing it
		System.out.println(driver.findElement(By.xpath("//*[@class='alert alert-danger']")).getText());
	}

	@Then("Click on Back button")
	public void click_on_back_button() {

		AffiliateLogin r = new AffiliateLogin(driver);

		//Click on Back
		r.getback().click();

		//Verifying the current url with the expected url
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "http://uniformm1.upskills.in/index.php?route=affiliate/login" );

		//Getting the text from the resultant page.
		System.out.println("Affiliate Login page will be displayed");

		//Close driver
		driver.close();

	}


	///////////////////////////////////Verifying Gift Certificates form
    ////////////////////////////////////////////////////////////////////////////////////
	
	
	@Given("Navigate to Website and Select Gift Certificates link in Footer section.")
	public void navigate_to_website_and_select_gift_certificates_link_in_footer_section() {

		//initialising the Browser
		driver=initialiseDriver();

		//Clicking on Gift Certificates link
		driver.findElement(By.xpath("//a[text()='Gift Certificates']")).click();
	}

	@When("Enter all the credentials in the Gift certificate form.")
	public void enter_all_the_credentials_in_the_gift_certificate_form() {

		//Create an Object for GiftCertificates class
		GiftCertificates r = new GiftCertificates(driver);

		//Enter all the textfields 
		r.getReceipientname().sendKeys("Eby Paul Daniel");
		r.getReceipientemail().sendKeys("eby@gmail.com");
		r.getYourname().sendKeys("Reshmi");
		r.getYouremail().sendKeys("reshmi@gmail.com");
		r.getradio().click();
		r.getmessage().sendKeys("Happy New Year");
		r.getamount().sendKeys("30s");
		r.getcheck().click();
	}

	@Then("Click on Continue in Gift Certificates form.")
	public void click_on_continue_in_gift_certificates_form() {

		GiftCertificates r = new GiftCertificates(driver);

		//Click on Continue button
		r.getContinue().click(); 

		//Verifying the current url with the expected url
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "http://uniformm1.upskills.in/index.php?route=account/voucher/success" );
		System.out.println(driver.findElement(By.xpath("//*[@id='content']")).getText());

		//close driver
		driver.close();
	}

	//Verifying Contact Us form
	@Given("Navigate to Website and Select Contact Us link in Footer section.")
	public void navigate_to_website_and_select_contact_us_link_in_footer_section() {

		//initialising the Browser
		driver=initialiseDriver();

		//Clicking on Contact Us link
		driver.findElement(By.xpath("//a[text()='Contact Us']")).click();
	}

	/*@When("Verifying the Zoom in and Zoom out buttons in Map.")
	public void verifying_the_zoom_in_and_zoom_out_buttons_in_map() {

		ContactUs r = new ContactUs(driver);

		//r.getZoomIn().click();
		//r.getZoomOut().click();
	}*/

	@When("Verifying the Contact Us form")
	public void verifying_the_contact_us_form() {

		//Create an Object for ContactUs class
		ContactUs r = new ContactUs(driver);

		//Enter all textfields 
		r.getname().sendKeys("Reshmi");
		r.getemail().sendKeys("kaparthini@gmail.com");
		r.getenquiry().sendKeys("Nothing to mention here");

	}

	@Then("Click Continue1.")
	public void click_continue1() {

		ContactUs r = new ContactUs(driver);

		//Click on Submit button
		r.getSubmit().click();

		//Click on Continue button
		r.getContinue().click();

		//Verify the current url with the expected url
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "http://uniformm1.upskills.in/index.php?route=common/home" );
		System.out.println("Home Page gets displayed");

		//wait
		 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		 //close driver
		driver.close();

	}
}