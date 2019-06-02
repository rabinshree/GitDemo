package pageObject;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LandingPage {
	public WebDriver driver;
	

	By Signin =By.cssSelector("a[href*='sign_in']");
	
	
	public LandingPage(WebDriver driver) {
		
		// TODO Auto-generated constructor stub
		
		this. driver= driver;
	}


	public WebElement getLogin()
	{
		 
		return driver.findElement(Signin);
	}

}
