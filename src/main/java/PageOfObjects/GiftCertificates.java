package PageOfObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GiftCertificates {
	
public WebDriver driver;
	
	//Locating the Elements and storing it in appropriate variables
	By Receipientname=By.xpath("//*[@id='input-to-name']");
	By Receipientemail=By.xpath("//*[@id='input-to-email']");
	By Yourname=By.xpath("//*[@id='input-from-name']");
	By Youremail=By.xpath("//*[@id='input-from-email']");
	By radio=By.xpath("//*[@name='voucher_theme_id'][@value='10']");
	By message=By.xpath("//*[@id='input-message']");
	By amount=By.xpath("//*[@id='input-amount']");
	By check=By.xpath("//*[@name='agree'][@value='1']");
	By Continue=By.xpath("//input[@value='Continue']");
	
	//Defining the Constructor
	public GiftCertificates(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	//Methods to return the Locators
	public WebElement getReceipientname() 
	{
		 return driver.findElement(Receipientname);
	}
	public  WebElement getReceipientemail()
	{
		return driver.findElement(Receipientemail);
		
	}
	public WebElement getYourname()
	{
		return driver.findElement(Yourname);
	}
	public  WebElement getYouremail()
	{
		return driver.findElement(Youremail);
		
	}
	public  WebElement getradio()
	{
		return driver.findElement(radio);
	}
	public  WebElement getmessage()
	{
		return driver.findElement(message);
	}
	public   WebElement getamount()
	{
		return driver.findElement(amount);
	}
	public  WebElement getcheck()
	{
		return driver.findElement(check);
	}
	public WebElement getContinue()
	{
		return driver.findElement(Continue);
	}
	

}
