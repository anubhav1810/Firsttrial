package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup {

	WebDriver driver;
	public DriverSetup()
	{
	driver= new ChromeDriver();
	}
	
	public WebDriver browserSetup(String Browser, String URL)
	
	{
		String BrowserChoosenbyuser ="Chrome"; 
		        if(BrowserChoosenbyuser.equals(Browser))
         		       {
		             driver.get(URL);
         		       }
		      return driver;
		
	}

	}
	
	

