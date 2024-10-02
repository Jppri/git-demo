package Sele;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.findElement(By.name("name")).sendKeys("Jeffrey Equipaje");
		driver.findElement(By.name("email")).sendKeys("jeffequipaje02@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("Ariangrande0502");
		
		if(driver.findElement(By.cssSelector("label[for='exampleCheck1']")).getText().contains("Check me out if you Love IceCreams!")) {
			System.out.println(driver.findElement(By.cssSelector("label[for='exampleCheck1']")).getText());
			driver.findElement(By.id("exampleCheck1")).click();
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		
		WebElement staticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByVisibleText("Male");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("Female");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		System.out.println(driver.findElements(By.cssSelector("input[name='inlineRadioOptions']")).size() + " Detected Radio Buttons!");
		driver.findElement(By.id("inlineRadio2")).click();
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.xpath("(//div[@class='form-group']//input[@class='form-control'])[2]")).sendKeys("05");
		driver.findElement(By.xpath("(//div[@class='form-group']//input[@class='form-control'])[2]")).sendKeys("02");
		driver.findElement(By.xpath("(//div[@class='form-group']//input[@class='form-control'])[2]")).sendKeys("2002");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
		
		System.out.println("Test Cases Passed!");
		
		
	}

}
