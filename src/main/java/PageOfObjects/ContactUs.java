package PageOfObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUs {
	public WebDriver driver;
	
	//Locating the elements and storing them in appropriate variables
	By name = By.xpath("//*[@id='input-name']");
	By email = By.xpath("//*[@id='input-email']");
	By enquiry = By.xpath("//*[@id='input-enquiry']");
	By Submit = By.xpath("//*[@class='btn btn-primary']");
	By Continue = By.xpath("//*[@class='btn btn-primary']");
	
	//Defining the Constructor
	public ContactUs(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	//Methods return the Locators
	public WebElement getname()
	{
		return driver.findElement(name);
	}
	public  WebElement getemail()
	{
		return driver.findElement(email);
		
	}
	public  WebElement getenquiry()
	{
		return driver.findElement(enquiry);
	}
	public  WebElement getSubmit()
	{
		return driver.findElement(Submit);
	}
	public  WebElement getContinue()
	{
		return driver.findElement(Continue);
	}
	
	

}
