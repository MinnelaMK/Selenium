package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Closequit {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException

	{
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);

		WebElement link = driver.findElement(By.xpath("//*[@id=\"content\"]/p[3]/a"));
		Thread.sleep(2000);

		link.click();
		Thread.sleep(2000);

		driver.quit();
	}

}
