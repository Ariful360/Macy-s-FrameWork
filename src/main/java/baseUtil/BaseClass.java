package baseUtil;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.Configuration;

import static utils.IConstant.IMPLICITLY_WAIT;
import static utils.IConstant.PAGELOAD_WAIT;
import static utils.IConstant.*;

public class BaseClass {
public WebDriver driver;
public HomePage homePage;
Configuration config;

@BeforeMethod
public void setUp() {
	//System.getProperty("WebDriver.chrome.driver", "/Users/arifulislam/eclipse-workspace/com.macys/Driver/chromedriver");
	System.setProperty("WebDriver.chrome.driver", System.getProperty("user.dir") + 
			"/driver/chromedriver");
	
	driver = new ChromeDriver();
	config = new Configuration();
	driver.manage().window().maximize();
	//driver.manage().window().fullscreen();
	driver.manage().deleteAllCookies();
	//driver.get("https://www.macys.com/");
	driver.get(config.getProperty(URL));
	long pageLoad= Long.parseLong(config.getProperty((PAGELOAD_WAIT)));
	long implicitly= Long.parseLong(config.getProperty((IMPLICITLY_WAIT)));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageLoad));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitly));
	homePage = new HomePage(driver);
	
}


@AfterMethod
public void tearUp() {
	driver.quit();
}

}
