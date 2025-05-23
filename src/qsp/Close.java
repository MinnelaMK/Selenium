package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://minnelamuralikrishnapersonal.blogspot.com");
		Thread.sleep(2000);

		WebElement link = driver.findElement(
				By.xpath("//*[@id=\"post-body-996797514523453226\"]/table[2]/tbody/tr[9]/td[3]/p/span[1]/a"));
		Thread.sleep(2000);

		link.click();
		// driver.close();
		// Thread.sleep(2000);

		// WebElement link =
		// driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/span/a/h3"));
		// link.click();

		Thread.sleep(4000);
		driver.quit();
	}

}
