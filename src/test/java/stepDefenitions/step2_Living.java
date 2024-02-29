package stepDefenitions;

import java.io.IOException;

import factory.BaseClass;
import io.cucumber.java.en.Then;
import pageObjects.Living;

public class step2_Living {
	Living l;
	
	@Then("The user mouse hover to header Living")
	public void the_user_mouse_hover_to_header_living(){
	    l=new Living(BaseClass.getDriver());
	    l.HoverToLiving();
	}

	@Then("User retrives the items under the sub-menu Seating&Chairs")
	public void user_retrives_the_items_under_the_sub_menu_seating_chairs() throws IOException {
	    l.seatingAndChairs();
	}
}
