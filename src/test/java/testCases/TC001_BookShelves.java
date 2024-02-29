package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.BookShelves;
import pageObjects.urbanLadderPage;
import testBase.BaseClass;

public class TC001_BookShelves extends BaseClass{

	@Test(priority=1,groups= {"sanity","regression","master"})
	public void HandlePopup() throws IOException {
		urbanLadderPage ul=new urbanLadderPage(driver);
		ul.SearchBookShelves();
		logger.info("------Searched BookShelves-------");
		BookShelves bs=new BookShelves(driver);
		bs.closePopup();
		logger.info("------Handled the popup-------");
	}
	@Test(priority=2,groups= {"regression","master"})
	public void SelectFilters() throws InterruptedException {
		BookShelves bs=new BookShelves(driver);
		logger.info("------Choosing product under ₹15,000-------");
		bs.price();
		logger.info("------Choosing the product category-------");
		bs.category();
	}
	@Test(priority=3,groups= {"regression","master"})
	public void pricePriority() {
		BookShelves bs=new BookShelves(driver);
		logger.info("------Clicking the Checkbox exclude out of stock-------");
		bs.ExcludeOutOfStock();
		logger.info("------Sorting the price from high to low-------");
		bs.SortBy();
	}
	@Test(priority=4,groups= {"regression","master"})
	public void prntProductDetails() throws IOException {
		BookShelves bs=new BookShelves(driver);
		logger.info("------Printing the product details-------");
		bs.productDetails();
	}
}
