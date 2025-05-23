package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	static public void main(String[] Minnela) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin-admin@the-internet-herokuapp.com");
	}
}
