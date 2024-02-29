package pageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import utilities.excelUtils;

public class Living extends BasePage{

	public Living(WebDriver driver) {
		super(driver);
	}
	Actions act=new Actions(driver);
	@FindBy(xpath="//*[@id='topnav_wrapper']/ul/li[3]")
	WebElement Living;
	
	@FindBy(xpath="(//ul/li[3]/div/div/ul/li[1]//a)[1]")
	WebElement seatingAndChairs;
	
	@FindBy(xpath="//ul/li[3]/div/div/ul/li[1]//a")
	List<WebElement>  submenu;

	public void HoverToLiving(){
		act.clickAndHold(Living).perform();
	}
	public void seatingAndChairs() throws IOException {
		int row=1;
		wait(seatingAndChairs,50);
		for(WebElement seat : submenu) {
			System.out.println(seat.getText());
			excelUtils.setCellData("XLwrite",row ,1 ,seat.getText() );
			row++;
		}

	}
	
}
