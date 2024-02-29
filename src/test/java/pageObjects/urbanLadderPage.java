package pageObjects;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.excelUtils;

public class urbanLadderPage extends BasePage{

	public urbanLadderPage(WebDriver driver) {
		super(driver);
	}
	JavascriptExecutor js= (JavascriptExecutor)driver;
	
	@FindBy(xpath="//input[@id='search']")
	WebElement search;
	
	@FindBy(xpath="//a[text()=' Gift Cards ']")
	WebElement giftCards;
	
	public void SearchBookShelves() throws IOException {
		String[] bookShelf=excelUtils.getCellData("XLread", 0, 1);
		search.sendKeys(bookShelf[0]);
		search.sendKeys(Keys.ENTER);
	}
	public void clkGiftCards() {
		js.executeScript("arguments[0].click();", giftCards);
	}

}
