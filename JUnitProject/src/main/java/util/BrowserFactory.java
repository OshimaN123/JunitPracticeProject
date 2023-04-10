package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

		static WebDriver driver;
		public static WebDriver init () {
			System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.get("https://techfios.com/test/107/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			return driver;
			
			
		}
		public static void TearDown() {
			driver.close();
			driver.quit();
		}

}