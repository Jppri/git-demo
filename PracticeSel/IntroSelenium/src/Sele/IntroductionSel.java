package Sele;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class IntroductionSel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:\Drivers\chromedriver_win32\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:/Users/63915/Pictures/Drivers/chromedriver_win32/chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		
		//For Chrome
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.close();
		//driver.quit(); 
		
		//For Firefox
		/*System.setProperty("webdriver.gecko.driver","C:/Users/63915/Pictures/Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl()); */
		
		//For MsEdge
		/* System.setProperty("webdriver.edge.driver", "C:/Users/63915/Pictures/Drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl()); */
		
	}

}
 