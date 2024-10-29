package pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helper.Config;

public class HomePage {

	
	@FindBy(xpath="/html/body/div[1]/header/div[1]/div/section/div/div[2]/div/div/div/div/nav/ul/li/a")
	List<WebElement> menus;
	
	
	@FindBy(xpath="/html/body/div[1]/header/div[1]/div/section/div/div[2]/div/div/div/div/nav/ul/li[3]/div/div/div/div/section/div/div/div/div")
	List<WebElement> submenus;
	
	@FindBy(xpath="/html/body/div[1]/div[5]/div/div/div[1]/div/header/h1")
	WebElement VerifyPage;
	
	public HomePage() {
		PageFactory.initElements(Config.driver, this);
		
	}
	
	public void mouseHoverOnPage(String menuName, String submenuName) {
	try {
		for(WebElement menu:menus) {
			if(menu.getText().contains(menuName)) {
				Actions action = new Actions(Config.driver);
				action.moveToElement(menu).perform();
			}
			Thread.sleep(1000); 
		}
		for(WebElement submenu:submenus) {
			if(submenu.getText().contains(submenuName)) {
				submenu.click();
			}
			System.out.println("here");
			
		}
	} catch (Exception e) {
		// TODO: handle exception
	}
	System.out.println("here1");
	
	}
	public void verify(String pageName) {
		String name = VerifyPage.getText();
		Assert.assertEquals(pageName,name);
		Config.closeBrowser();
	}
	

}
