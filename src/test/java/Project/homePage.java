package Project;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.base;

public class homePage extends base{
	
		
		@Test
		public void basePageNavigation() throws IOException 
		{
			
			 driver = initializedriver();
			driver.get("http://qaclickacademy.com/");
			
			LandingPage l = new LandingPage(driver);
			l.getLogin().click();
			
			LoginPage lp = new LoginPage(driver);
			
			lp.getemail().sendKeys("kath@yahoo.com");
			lp.getpassword().sendKeys("chariland12");
			lp.getsubmit().click();
					
				
					 
			
			
			
			
		}
		

	}



