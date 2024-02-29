package stepDefenitions;

import java.io.IOException;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.GiftCards;
import pageObjects.urbanLadderPage;

public class step3_GiftCards {
	urbanLadderPage ul;
	GiftCards g;
	@Given("The user navigates to GiftCards Page and chooses BirthdayOrAnniversay")
	public void the_user_navigates_to_gift_cards_page_and_chooses_birthday_anniversay() {
		ul= new urbanLadderPage(BaseClass.getDriver());
		ul.clkGiftCards();
		g= new GiftCards(BaseClass.getDriver());
		g.chooseBirthday();
	}

	@Then("User selects the gift amount")
	public void user_selects_the_gift_amount() {
		g.selectAmount();
	}

	@Then("User fill the details in the LuckyPerson form")
	public void user_fill_the_details_in_the_lucky_person_form() throws InterruptedException, IOException {
		g.formLuckyPerson();
		Thread.sleep(3000);
		g.clkConfirm();
	}

	@Then("User gets the error message")
	public void user_gets_the_error_message() throws IOException {
		g.getErrorMsg();
	}

	@Then("User enters the valid details and submits the form")
	public void user_enters_the_valid_details_and_submits_the_form() throws InterruptedException, IOException {
		g.clearForm();
		g.validEmail();
		Thread.sleep(3000);
		g.clkConfirm();

	}
}
