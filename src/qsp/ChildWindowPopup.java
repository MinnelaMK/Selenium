package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

public class ChildWindowPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	static public void main(String[] Mk) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://secure.indeed.com");
		String wh = driver.getWindowHandle();
		System.out.println(wh);
		driver.close();
	}
}
