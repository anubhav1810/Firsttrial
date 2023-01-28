import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;


public class Browserstack {

	
		// TODO Auto-generated method stub
		
		public class BrowserStackSampleTest {
		public  final String USERNAME = "anubhav_NCa95O";
		public  final String AUTOMATE_KEY = "GV7Wt2ysyfrVz2sppcjq";
		public  final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
		
		public  void main(String[] args) throws Exception {
		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability("os", "Windows");
		caps.setCapability("os_version", "10");
		caps.setCapability("browser", "Chrome");
		caps.setCapability("browser_version", "80");

		caps.setCapability("name", "nehapramodvaidya1's First Test");
		

		WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		// Navigating through the URL
		driver.get("http://www.google.com");
		//Locating the search box of google
		WebElement element = driver.findElement(By.name("q"));
		// Sending browserstack keyword for search
		element.sendKeys("BrowserStack");
		element.submit();

		System.out.println(driver.getTitle());
		driver.quit();
		}
		
         
	}

}
