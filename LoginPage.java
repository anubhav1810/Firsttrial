

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;



import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LoginPage {
	
	
	

	
	public  final static String USERNAME = "anubhav_NCa95O";
	public  final static String AUTOMATE_KEY = "GV7Wt2ysyfrVz2sppcjq";
	public  final static String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	

	public static void main (String args[]) throws InterruptedException, Exception
	{
	/*	//Thread.sleep(2000);
		System.setProperty("webdriver.chrome.driver","/Users/mac/Desktop/Automation/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://google.com");
		String Windowtiltle =driver.getTitle();
		System.out.print(Windowtiltle);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('input').value='Avinash Mishra'");
		driver.findElement(By.name("q")).click();
		Actions tab = new Actions(driver);
		tab.sendKeys(Keys.COMMAND).sendKeys("t").build().perform();
		driver.get("https://infosys.com");
		
		driver.quit();
		*/
		
		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability("os", "Windows");
		caps.setCapability("os_version", "10");
		caps.setCapability("browser", "Chrome");
		caps.setCapability("browser_version", "109");
		

		caps.setCapability("name", "new testbyAnubhav");
		

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
