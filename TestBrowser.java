import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestBrowser {
	
   final static String user="thunder_KfPtN0";
   final static String accesskey="6zp1wRwCxjExp9NAi1qu";
   final static  String url= "https://" + user + ":" + accesskey + "@hub-cloud.browserstack.com/wd/hub";;
     
     
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		DesiredCapabilities ds = new DesiredCapabilities();
		//DesiredCapabilities ds = new DesiredCapabilities();
		ds.setCapability("os", "Windows");
		ds.setCapability("os_version", "10");
		ds.setCapability("browser", "Chrome");
		ds.setCapability("browser_version", "latest");
		ds.setCapability("resolution", "1280x800");
		ds.setCapability("project", "Multibrowser testing");
		ds.setCapability("build", "Build_01");
		ds.setCapability("browserstack.local", "false");
		ds.setCapability("browserstack.selenium_version", "3.14.0");
		
		WebDriver driver = new RemoteWebDriver(new URL(url), ds);
		driver.get("https://google.com");
		WebElement editbox =driver.findElement(By.name("q"));
		editbox.click();
		editbox.clear();
		editbox.sendKeys("Infosys");
	    System.out.println(editbox.getText());
	    
	    
		editbox.submit();
		
		
	/*	Actions a = new Actions(driver);
		a.sendKeys(Keys.ENTER).perform();
		a.sendKeys("/").perform();
		*/
		driver.quit();

	}

}
