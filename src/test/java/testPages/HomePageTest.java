package testPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass{
	
	@Test(enabled = false, priority = 1)
	public void clickSearchBoxTest() throws InterruptedException{
		homePage.clickSearchBox();
	}
		@Test(enabled = false, priority = 2)
		public void useOfSendKeysTest() throws InterruptedException{
			driver.findElement(By.cssSelector("input.globalSearchInputField.right")).sendKeys("perfume", Keys.ENTER);
	}
		@Test(enabled = false, priority = 3)
		public void clickSaveBoxTest() throws InterruptedException{
			homePage.clickSaveBox();
		}
		
		@Test(enabled = true, priority = 4)
		public void clickSignInTest() throws InterruptedException{
			homePage.clickSignIn();
			//homePage.inputTextuserId();
			//homePage.inputTextPassWord();
		}
		@Test
		public void clickLogo() throws InterruptedException {
			homePage.clickLogo();
		}

}
