package qsp;

import org.openqa.selenium.*;

public class Chromedriver {
	static {
		System.setProperty("webdriver.chrom.driver",
				"F:\\Selenium Webdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	}

	public static void main(String[] args) {
		new Chromedriver();
	}

}
