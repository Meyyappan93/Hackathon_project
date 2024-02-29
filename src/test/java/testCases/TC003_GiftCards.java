package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.GiftCards;
import pageObjects.urbanLadderPage;
import testBase.BaseClass;

public class TC003_GiftCards extends BaseClass{

	@Test(priority=1,groups= {"sanity","master"})
	public void chooseGiftCard() {
		urbanLadderPage ul= new urbanLadderPage(driver);
		ul.clkGiftCards();
		logger.info("------Clicked the Giftcards-------");
		GiftCards g= new GiftCards(driver);
		logger.info("------Choosing Birthday/Anniversay-------");
		g.chooseBirthday();
	}
	@Test(priority=2,groups= {"master"})
	public void enterAmount() {
		GiftCards g= new GiftCards(driver);
		logger.info("------Select the gift amount-------");
		g.selectAmount();
	}
	@Test(priority=3,groups= {"master"})
	public void formDetails() throws InterruptedException, IOException {
		GiftCards g= new GiftCards(driver);
		logger.info("------Filling the form Lucky person-------");
		g.formLuckyPerson();
		Thread.sleep(3000);
		logger.info("------Clicking the confirm button-------");
		g.clkConfirm();
	} 
	@Test(priority=4,groups= {"master"})
	public void printErrorMs() throws IOException {
		GiftCards g= new GiftCards(driver);
		logger.info("------Getting the error message-------");
		g.getErrorMsg();
	}
	@Test(priority=5,groups= {"master"})
	public void enterValidDetails() throws InterruptedException, IOException {
		GiftCards g= new GiftCards(driver);
		logger.info("------Clearing the Form-------");
		g.clearForm();
		logger.info("------Enter the valid Email-------");
		g.validEmail();
		Thread.sleep(3000);
		logger.info("------Clicking the confirm button-------");
		g.clkConfirm();
	}
	
}
