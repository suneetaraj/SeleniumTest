package github_sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
		
		System.out.println("How are you");
		
		WebDriver driver;

		// Launch chrome Browser
		// System.setProperty(key, value);

		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();

		// Enter URL
		// driver.get(arg0);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Comment

	}

}
