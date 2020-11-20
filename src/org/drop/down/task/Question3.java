package org.drop.down.task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Question3 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mercy\\eclipse-workspace\\DropDown\\src\\Driver1\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		
		WebElement createAccount = driver.findElement(By.id("u_0_2"));
		createAccount.click();

		Thread.sleep(1000);
		
		WebElement printYear = driver.findElement(By.id("year"));
		
		Select select = new Select(printYear);
		
		List<WebElement> allYears = select.getOptions();
		
		for( WebElement yearPrint2 : allYears) {
			
			String name = yearPrint2.getAttribute("value");
			System.out.println(name);
		}

	}

}
