package qsp;

import org.openqa.selenium.By.ByXPath;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignActi {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text() ='Login ']")).click();
		driver.findElement(
				By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[7]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/div[4]"))
				.click();

		driver.findElement(By.xpath("//*[@id=\"popup_menu_support\"]/div[2]/div[3]/ul/li[6]/a\r\n" + "")).click();

		WebElement link = driver.findElement(By.linkText("Read Service Agreement"));
		Actions a = new Actions(driver);
		a.contextClick(link).perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_W);
	}
}