package testSuites;

import org.openqa.selenium.chrome.ChromeDriver;

import helper.Config;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FindProduct;

public class FindProductStepDef {
	
	@Given("user in on product page")
	public void user_in_on_product_page() {
	   Config.driver = new ChromeDriver();
	   Config.confChrome();
	   String url = "https://mistore.com.tn/product-category/maison-connectee/";
	   Config.driver.get(url);
	   Config.maxWindow();
	   Config.waitForLoad(5);
;	}

	@When("user clicks on product {string}")
	public void user_clicks_on_product(String productName) {
		FindProduct page = new FindProduct();
		page.productMouseHover(productName);
		
	    
	}

	@Then("user is redirected to the page of {string}")
	public void user_is_redirected_to_the_page_of(String pageName) {
		FindProduct page = new FindProduct();
		page.myProdVerif(pageName);
		
	    
	}

}
