package Sele;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;
public class Greenkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		int j =0;
		
		String[] itemsNeeded = {"Cucumber","Brocolli","Beetroot","Orange","Raspberry"};
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		Thread.sleep(3000);
		
		for(int i = 0; i<products.size(); i++) {
			//Brocolli - 1 kg
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			//Check whether name you extract is present in array or not
			//Convert array into array list for easy search
			List itemsNeededList = Arrays.asList(itemsNeeded);

			if(itemsNeededList.contains(formattedName)){
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				System.out.println("Added to cart: " + formattedName);
				if(j == itemsNeeded.length) {
					break;
				}
			}
		}
		driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
	}

}
