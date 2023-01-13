package common;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
public class CommonAction {

	public static void clickElement(WebElement element)throws NoSuchElementException {
		try {
		element.click();
		}catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
		}
	}
	
	public static void inputText(WebElement element, String value) {
		try {
			element.sendKeys(value);
		} catch (NoSuchElementException | NullPointerException e) {
			e.printStackTrace();
		}
	}
}
