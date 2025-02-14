package Sele;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import java.util.*;
public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> windows = driver.getWindowHandles(); //[parent if,childid]
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);

		System.out.println(driver.findElement(By.cssSelector("p[class='im-para red']")).getText());
		driver.findElement(By.cssSelector("p[class='im-para red']")).getText();
		String emailId = driver.findElement(By.cssSelector("p[class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(parentId);
		driver.findElement(By.id("username")).sendKeys(emailId);
	}

}
