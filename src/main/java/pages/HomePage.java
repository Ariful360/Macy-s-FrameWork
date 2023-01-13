package pages;
import static common.CommonAction.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(css = "input.globalSearchInputField.right")
	WebElement searchBox;
	
	@FindBy(className = "wishlist-icon__image")
	WebElement saveBox;
	
	@FindBy(xpath = "//span[text()= 'Sign In']")
	WebElement signIn;
	
	@FindBy(name = "user.email_address")
	WebElement userId;
	
	@FindBy(xpath = "//input[@id= 'pw-input']")
	WebElement passWord;
	
	@FindBy(className = "header-logo__image")
	WebElement logo;
	
	@FindBy(id = "bag-icon-reskin")
	WebElement bag;
	
	public void clickSearchBox() throws InterruptedException {
		searchBox.click();
		Thread.sleep(3000);
	}
	
	public void clickSaveBox() throws InterruptedException {
		searchBox.click();
		Thread.sleep(3000);
	}
	
	public void clickSignIn() throws InterruptedException {
		signIn.click();
		Thread.sleep(3000);
	}
	
	public void inputTextuserId() throws InterruptedException {
		inputText(userId, "arifulislam360@yahoo.com");
		Thread.sleep(3000);
	}
	
	public void inputTextPassWord() throws InterruptedException {
		inputText(passWord, "3478916795Aa");
		Thread.sleep(3000);
	}
	

	public void clickLogo() throws InterruptedException {
		logo.click();
		Thread.sleep(3000);
	}
	
	public void clickBag() throws InterruptedException {
		bag.click();
		Thread.sleep(3000);
	}

}
