package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	WebDriver driver;
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.in/");
		
		
		driver.manage().window().maximize();
		
		WebDriver wait = new WebDriver(driver,3000);
		
		WebElement alldropDown = wait.until(ExpectedConditons.elementoClickable(By.xpath("//a[@id='All dropdown']")));
		
		alldropDown.click();
		
		WebElement searchbox = wait.until(ExpectedCondition.elementToBeclickable(By.id("")));
		
	}

}
