package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class closeprogram {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actiTIme.com/login.do");
		Thread.sleep(2000);
		WebElement link = driver.findElement(By.xpath("//a[text()='actiTIME']"));
		Thread.sleep(2000);
		link.click();

		// driver.close();

		Thread.sleep(3000);
		driver.quit();
	}

}
