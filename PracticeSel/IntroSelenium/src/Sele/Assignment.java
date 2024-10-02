package Sele;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
		System.out.println("Option 1 selected?: " + driver.findElement(By.id("checkBoxOption1")).isSelected());
		Assert.assertTrue(true);
		
		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
		System.out.println("Option 1 not selected?: " + driver.findElement(By.id("checkBoxOption1")).isSelected());
		Assert.assertFalse(false);

		
		//Identifying size
		System.out.println("Number of checkboxes: " + driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		driver.close();
		System.out.println("Test cases passed!");
		
	}

}
