package pageObject;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginPage {
	public WebDriver driver;
	

	
	By email = By.id("user_email");
    By password =By.cssSelector("nput[type='password']");
     By submit =By.cssSelector("input[type='submit']");
	
	
	





	public LoginPage(WebDriver driver2) 
	{
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}




	public WebElement getemail()
	{
		 
		return driver.findElement(email);
	}
	public WebElement getpassword()
	{
		 
		return driver.findElement(password);
	}
	public WebElement getsubmit()
	{
		 
		return driver.findElement(submit);
	}

}
