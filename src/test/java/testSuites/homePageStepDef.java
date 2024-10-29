package testSuites;

import org.openqa.selenium.chrome.ChromeDriver;

import helper.Config;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class homePageStepDef {
	@Given("user is in home page")
	public void user_is_in_home_page() {
		Config.driver = new ChromeDriver();
		Config.confChrome();
		String url = "https://mistore.com.tn/";
		Config.driver.get(url);
		Config.maxWindow();
	   
		Config.waitForLoad(5);
	}
	@When("user hver mouse over {string} menu and clicks on {string} submenu")
	public void user_hver_mouse_over_menu_and_clicks_on_submenu(String menu, String submenu) {
		HomePage page = new HomePage();
		page.mouseHoverOnPage(menu, submenu);
		
	    Config.waitForLoad(5);
	}

	@Then("user redirects to {string} page")
	public void user_redirects_to_page(String pageName) {
		HomePage page = new HomePage();
		page.verify(pageName);
		
	
	}
}

