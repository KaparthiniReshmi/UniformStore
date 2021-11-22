package PageOfObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Register{
	public WebDriver driver;

    //Locating the First Name textfield using xpath and storing it in a variable
	By firstname=By.xpath("//*[@id='input-firstname']");
	
	//Locating Last Name textfield
	By lastname = By.xpath("//*[@id='input-lastname']");
	
	//Loacting E-Mail textfield
	By email=By.xpath("//*[@id='input-email']");
	
	//Locating Telephone textfield
	By telephone=By.xpath("//*[@id='input-telephone']");
	
	//Locating Address1 textfield
	By address1=By.xpath("//*[@id='input-address-1']");
	
	//Loacting Address2 textfield
	By address2=By.xpath("//*[@id='input-address-2']");
	
	//Locating City textfield
	By city= By.xpath("//*[@id='input-city']");
	
	//Locating PsotCode textfield
	By postCode=By.xpath("//*[@id='input-postcode']");

	//Locating Password textfield
	By password=By.xpath("//*[@id='input-password']");
	
	//Locating Confirm Password textfield
	By passwordConfirm=By.xpath("//*[@id='input-confirm']");
	
    //Locating Radio Button
	By radio=By.xpath("//*[@name='newsletter'][@value='1']");
	
	//Locating Checkbox
	By check=By.xpath("//*[@name='agree'][@value='1']");
	
	//Locating Continue button in Registration page
	By Continue=By.xpath("//input[@value='Continue']");
	
	//Locating Continue Button in the Successfully Account Created page
	By continueBtn= By.xpath("//a[@class='btn btn-primary']");

	//defining the Constructor
	public Register(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}


    //method to return firstname
	public WebElement getfirstname() 
	{
		return driver.findElement(firstname);
    }
	//method to return lastname
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
	//method to return password
    public  WebElement getpassword()
	{
		return driver.findElement(password);
	}
  //method to return password Confirm
	public   WebElement getpasswordConfirm()
	{
		return driver.findElement(passwordConfirm);
	}
	//method to return radio button
	public  WebElement getradio()
	{
		return driver.findElement(radio);

	}
	//method to return checkbox
	public  WebElement getcheck()
	{
		return driver.findElement(check);
	}
	//method to return Continue button
	public WebElement getContinue()
	{
		return driver.findElement(Continue);
	}
	//method to return Continue button 
	public WebElement getcontinueBtn()
	{
		return driver.findElement(continueBtn);
	}
	
}



