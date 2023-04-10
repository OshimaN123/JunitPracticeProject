package test;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Page.NssListPage;
import util.BrowserFactory;

public class NssListTest {
	WebDriver driver;
	String name = "Oshima";
	String catagory = "Texas";

	@Before
	public void initBrowserFactory() {
		driver = BrowserFactory.init();

	}

	// @Test
	public void useCase1() throws InterruptedException {
		 
		NssListPage nsslistPage = PageFactory.initElements(driver, NssListPage.class);
		nsslistPage.validateNssListPage();
		nsslistPage.toogleAllBoxChecked();
		nsslistPage.validateAllCheckBox();
		
	}
	// @Test
		public void useCase2() throws InterruptedException {
			NssListPage nsslistPage = PageFactory.initElements(driver, NssListPage.class);

			nsslistPage.clickToselectName();
			Thread.sleep(3000);
			nsslistPage.clickonRemoveButton();
		}

	@Test
		public void useCase3() throws InterruptedException {
			NssListPage nsslistPage = PageFactory.initElements(driver, NssListPage.class);

			nsslistPage.toogleAllBoxChecked();
			Thread.sleep(2000);
			nsslistPage.validateAllCheckBox();

			nsslistPage.clickonRemoveButton();
		}



}
