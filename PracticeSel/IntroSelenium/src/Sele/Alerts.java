package Sele;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name = "Jeff Equipaje";
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		driver.findElement(By.id("name")).sendKeys(name);
		// driver.findElement(By.id("alertbtn")).click();
		// System.out.println(driver.switchTo().alert().getText());
		// driver.switchTo().alert().accept();
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(1000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();

	}

}
