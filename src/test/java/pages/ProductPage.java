package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helper.Config;

public class ProductPage {
	@FindBy(xpath = "/html/body/div[1]/div[4]/div/div/div/div/div[3]/div[1]/div/div[3]/div/form/div/button")
	WebElement AddProduct;
	@FindBy(xpath = "/html/body/div[1]/header/div[1]/div/section/div/div[4]/div/section/div/div[2]/div/div/div/div/div/div/a/span/i")
	WebElement Cart;
	@FindBy(xpath="/html/body/div[1]/header/div[1]/div/section/div/div[4]/div/section/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div/ul/li/div[2]/a[1]/span/font/font")
	WebElement Verify;
	
	public ProductPage() {
		PageFactory.initElements(Config.driver, this);
	}
	public void addProductToCart() {
		AddProduct.click();
;		
	}
	public void cartCheck() {
		Cart.click();
	}
	
	public void verifyAddedProduct(String nameCheck) {
		String cart = Verify.getText();
		Assert.assertEquals(nameCheck, cart);
	}

}
