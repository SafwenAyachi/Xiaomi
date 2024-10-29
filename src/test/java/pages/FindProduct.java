package pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helper.Config;

public class FindProduct {
	@FindBy(xpath="/html/body/div[1]/div[5]/div/div/div[1]/div/div[3]/div/div/div")
	List<WebElement> products;
	@FindBy(xpath="/html/body/div[1]/div[5]/div/div/div[1]/div/div[3]/div/div[4]/div")
	WebElement product;
	@FindBy(xpath="/html/body/div[1]/div[4]/div/div/div/div/div[3]/div[1]/div/div[1]/div/div[1]/h1")
	WebElement verifyProduct;
	
	public FindProduct() {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void productMouseHover(String productName) {
		
		try {
			for(WebElement myProduct:products) {
				if(myProduct.getText().contains(productName)) {
					myProduct.click();
				}
			}
			Thread.sleep(3000);
		
		} catch (Exception e) {
		}
		System.out.println("qwert");
		}
	
	public void myProdVerif(String pageName) {
		String myProduct = verifyProduct.getText();
		Assert.assertEquals(pageName, myProduct);
		Config.closeBrowser();
				
	}
	

}
