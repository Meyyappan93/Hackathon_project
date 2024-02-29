package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.Living;
import testBase.BaseClass;

public class TC002_Living extends BaseClass{
	
	@Test(priority=1,groups= {"sanity","master"})
	public void viewLiving() {
		Living l= new Living(driver);
		logger.info("------Mouse hovering to the header Living-------");
		l.HoverToLiving();
	}
	@Test(priority=2,groups= {"master"})
	public void prntSubmenu() throws IOException {
		Living l= new Living(driver);
		logger.info("------Printing the menu list of seating&chairs-------");
		l.seatingAndChairs();
	}

}
