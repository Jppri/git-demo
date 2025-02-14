package Sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		System.out.println("From: "+ driver.findElement(By.xpath("//a[@value='DEL']")).getText());
		Thread.sleep(1000);		
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		System.out.println("To: "+ driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).getText());
		driver.findElement(By.cssSelector(".ui-datepicker-today")).click();
		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			System.out.println("It's disabled");
			System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
				Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
		
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
		
		int i = 1;
		while(i<5) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		
		driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
		System.out.println("Submitted!");
		driver.close();
	}

}
