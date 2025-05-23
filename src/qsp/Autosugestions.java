package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.dynamic.scaffold.InstrumentedType.Frozen;

public class Autosugestions {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Facebook");
		Thread.sleep(3000);
		List<WebElement> allsugg = driver.findElements((By.xpath("//span[contains(text(),'Java')]")));
		int count = allsugg.size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			String text = allsugg.get(i).getText();
			System.out.println(text);
		}
		for (WebElement sugg : allsugg) {
			System.out.println(sugg.getText());
		}
		allsugg.get(0).click();
		driver.close();
	}
}