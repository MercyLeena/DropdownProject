package org.drop.down.task;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Question1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mercy\\eclipse-workspace\\DropDown\\src\\Driver1\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/automation-practice-form/");

		driver.manage().window().maximize();

		Thread.sleep(1000);

		WebElement selectState = driver.findElement(By.className("css-19bqh2r"));

		JavascriptExecutor jk = (JavascriptExecutor) driver;

		jk.executeScript("arguments[0].scrollIntoView(false)", selectState);

		Select select = new Select(selectState);

		select.selectByIndex(2);
	}
}
