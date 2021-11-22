package PageOfObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AffiliatesRegister {
	public WebDriver driver;

	//Locating the elements and storing them in variables
	By firstname=By.xpath("//*[@id='input-firstname']");
	By lastname = By.xpath("//*[@id='input-lastname']");
	By email=By.xpath("//*[@id='input-email']");
	By telephone=By.xpath("//*[@id='input-telephone']");
	By address1=By.xpath("//*[@id='input-address-1']");
	By address2=By.xpath("//*[@id='input-address-2']");
	By city= By.xpath("//*[@id='input-city']");
	By postCode=By.xpath("//*[@id='input-postcode']");
	By radio=By.xpath("//*[@value='paypal']");
	By password=By.xpath("//*[@id='input-password']");
	By passwordConfirm=By.xpath("//*[@id='input-confirm']");
	By Continue=By.xpath("//input[@value='Continue']");

	//Defining the constructor	
	public AffiliatesRegister(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	//Method to return firstname
	public WebElement getfirstname() {
		return driver.findElement(firstname);

	}
	//Method to return lastname
	public  WebElement getlastname()
	{
		return driver.findElement(lastname);

	}
	//method to return email
	public WebElement getemail()
	{
		return driver.findElement(email);
	}
	//method to return telephone
	public  WebElement gettelephone()
	{
		return driver.findElement(telephone);

	}
	//method to return address
	public  WebElement getaddress1()
	{
		return driver.findElement(address1);

	}
	//method to return address
	public  WebElement getaddress2()
	{
		return driver.findElement(address2);

	}
	//method to return city
	public  WebElement getcity()
	{
		return driver.findElement(city);

	}
	//method to return postcode
	public  WebElement getpostCode()
	{
		return driver.findElement(postCode);

	}
	//method to return radio button locator
	public  WebElement getradio()
	{
		return driver.findElement(radio);
	}
	//method to return password
	public  WebElement getpassword()
	{
		return driver.findElement(password);
	}
	//method to return password confirm
	public   WebElement getpasswordConfirm()
	{
		return driver.findElement(passwordConfirm);
	}
	//method to return Continue button locator
	public WebElement getContinue()
	{
		return driver.findElement(Continue);
	}


}













