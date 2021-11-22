package PageOfObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AffiliateLogin {

	public WebDriver driver;

	//Locating the elements and storing them in variables
	By Email=By.xpath("//*[@id='input-email']");
	By password = By.xpath("//*[@id='input-password']");
	By forgotpwd= By.xpath("//a[text()='Forgotten Password']");
	By submit = By.xpath("//*[@class='btn btn-primary'] [@value='Login']");
	By Continue = By.xpath("//*[@class='btn btn-primary'] [@value='Continue']");
	By back = By.xpath("//a[@class='btn btn-default']");

	//Defining the constructor	
	public AffiliateLogin(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	//Method to return email
	public WebElement getEmail() {
		return driver.findElement(Email);

	}
	//Method to return password
	public  WebElement getpassword()
	{
		return driver.findElement(password);

	}
	//Method to return forgotten password
	public  WebElement getforgotpwd()
	{
		return driver.findElement(forgotpwd);
	}
	//Method to return Submit button
	public WebElement getsubmit()
	{
		return driver.findElement(submit);
	}
	//Method to return Continue button in Forgotten password page
	public  WebElement getContinue()
	{
		return driver.findElement(Continue);
	}
	//Method to return Back option in Forgotten password page
	public  WebElement getback()
	{
		return driver.findElement(back);
	}

}
