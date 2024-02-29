package pageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import utilities.excelUtils;

public class BookShelves extends BasePage {

	public BookShelves(WebDriver driver) {
		super(driver);	
	}
	Actions act=new Actions(driver);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	@FindBy(xpath="//a[@data-gaaction='popup.auth.close']")
	WebElement popup;
	
	@FindBy(xpath="(//div[@class='gname'])[2]")
	WebElement price;
	
	@FindBy(xpath="//div[@class='noUi-handle noUi-handle-upper']")
	WebElement maxPrice;
	
	@FindBy(xpath="(//div[@class='gname'])[1]")
	WebElement category;
	
	@FindBy(xpath="//input[@value='Kids Bookshelves']")
	WebElement kidsBookShelves;
	
	@FindBy(id="filters_availability_In_Stock_Only")
	WebElement ExOutStock;
	
	@FindBy(xpath="(//div[@class='gname'])[3]")
	WebElement sortBy;
	
	@FindBy(xpath="(//li[@class='option'])[2]")
	WebElement highToLow;
	
	@FindBy(xpath="//div[@class='product-title product-title-sofa-mattresses']")
	List<WebElement> productTitle;
	
	@FindBy(xpath="//div[@class='price-number']/span")
	List<WebElement> productPrice;
	
	public void closePopup() {
		popup.click();
	}
	public void price() {
		act.moveToElement(price).perform();
		act.dragAndDropBy(maxPrice, -210,0).perform();
	}
	public void category() {
		act.moveToElement(category).perform();
		js.executeScript("arguments[0].click()",kidsBookShelves);
	}
	public void ExcludeOutOfStock() {
		js.executeScript("arguments[0].click();", ExOutStock);
	}
	public void SortBy() {
		act.moveToElement(sortBy).perform();
		js.executeScript("arguments[0].click()",highToLow);
	}
	public void productDetails() throws IOException {
		try {
		int row=1;
		wait(productTitle.get(0),30);
		for(int i=0;i<3;i++) {
			String pTitle=productTitle.get(i).getText();
			String pPrice=productPrice.get(i).getText();
			System.out.println(pTitle+"  :  "+pPrice+"\n");
			excelUtils.setCellData("XLwrite", row, 0, pTitle);
			row++;
			excelUtils.setCellData("XLwrite", row, 0, pPrice);
			row++;
		}
		js.executeScript("window.scrollBy(0,-300)");
		}
		catch(StaleElementReferenceException e) {
			
		}
	}

}
