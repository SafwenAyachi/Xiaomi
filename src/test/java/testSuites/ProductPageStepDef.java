package testSuites;

import org.openqa.selenium.chrome.ChromeDriver;

import helper.Config;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ProductPage;

public class ProductPageStepDef {
	
	
	@Given("user on product page")
	public void user_on_product_page() {
	    Config.driver = new ChromeDriver();
	    Config.confChrome();
	    String url = "https://mistore.com.tn/product/mi-door-window-sensor-2/";
	    Config.driver.get(url);
	    Config.maxWindow();
	    Config.waitForLoad(10);
	}

	@When("clicks {string} button")
	public void clicks_button(String cartButton) {
		ProductPage page = new ProductPage();
		page.addProductToCart();
		Config.waitForLoad(10);
		
	}
	   

	@Then("product {string} was succesfuly added to cart")
	public void product_was_succesfuly_added_to_cart(String string) {
		ProductPage page = new ProductPage();
		page.cartCheck();
		Config.waitForLoad(10);
		//Config.closeBrowser();
	}
	  

}
