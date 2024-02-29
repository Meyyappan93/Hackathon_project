package stepDefenitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.BookShelves;
import pageObjects.urbanLadderPage;

public class step1_BookShelves {
	static WebDriver driver;
	urbanLadderPage ul;
	BookShelves bs;
	@Given("The user Searches for Bookshelves and handles popup")
	public void the_user_searches_for_bookshelves_and_handles_popup() throws IOException {
		driver=BaseClass.getDriver();
		ul=new urbanLadderPage(BaseClass.getDriver());
		ul.SearchBookShelves();
		bs=new BookShelves(BaseClass.getDriver());
		bs.closePopup();
	}

	@When("User selects the price margin using slider and category using dropdown")
	public void user_selects_the_price_margin_using_slider_and_category_using_dropdown(){
		bs.price();
	    bs.category();
	}

	@When("User clicks the excludeOutOfStock checkbox and select the price high to low in sortBy dropdown")
	public void user_clicks_the_exclude_out_of_stock_checkbox_and_select_the_price_high_to_low_in_sort_by_dropdown() {
		bs.ExcludeOutOfStock();
	    bs.SortBy();
	}

	@Then("User fetches the product details")
	public void user_fetches_the_product_details() throws IOException {
		bs.productDetails();
	}
}
