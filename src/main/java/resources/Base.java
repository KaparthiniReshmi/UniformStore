package resources;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public WebDriver driver;
	
	//initialising the Chrome browser
	public WebDriver initialiseDriver() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KAPARS\\Selenium\\chromedriver.exe");  
		driver=new ChromeDriver();
		
		//Maximising Chrome Window
		driver.manage().window().maximize();
		
		//Getting the Website url
		String arg1="http://uniformm1.upskills.in/";
		driver.get(arg1);
		
		//wait
	    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		return driver;
	}
	
	    

	
}


