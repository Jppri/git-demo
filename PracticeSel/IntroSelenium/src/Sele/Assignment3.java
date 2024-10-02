package Sele;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		System.out.println(driver.findElement(By.xpath("//p[text()='You will be limited to only fewer functionalities of the app. Proceed?']")).getText());
		
		WebElement staticDropdown = driver.findElement(By.cssSelector("select[class='form-control']"));
		Select choice = new Select(staticDropdown);
		choice.selectByVisibleText("Consultant");
		System.out.println(choice.getFirstSelectedOption().getText());
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[class='nav-link btn btn-primary']")));
		
		System.out.println(driver.findElements(By.xpath("//button[text()='Add ']")).size());
		List<WebElement> addButtons = driver.findElements(By.xpath("//button[text()='Add ']"));
		
		for(int i = 0; i<addButtons.size();i++) {
			addButtons.get(i).click();
		}
		
		driver.findElement(By.cssSelector("a[class='nav-link btn btn-primary']")).click();
		driver.findElement(By.cssSelector("button[class='btn btn-success']")).click();
		driver.close();
	}

}
