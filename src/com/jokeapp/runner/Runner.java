package com.jokeapp.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runner {

	public static void main(String args[]) {

		System.setProperty("webdriver.chrome.driver", "D:\\WI{PRO\\Selenium\\Setup\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		int i = 1;
		driver.get("http://localhost:8082/joke");
		while (i <= 5) {
			System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td")).getText());
			driver.navigate().refresh();
			i++;
		}

	}

}
