package Sele;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		System.out.println(driver.findElements(By.tagName("frameset")).size());
		//driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")));
		//driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-middle']")));
		System.out.println(driver.findElement(By.id("content")).getText());
		
		

	}

}
