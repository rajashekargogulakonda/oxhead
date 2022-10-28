package oxhead;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo {
		
	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RajashekarGogulakond\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

		//Application URL
		driver.get("https://oxheaduatstg.wpengine.com/");

		//Maximizing the application
		driver.manage().window().maximize();

		//Waiting for sometime to load the webelements on the webpage
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Thread.sleep(3000);
		String hometitle=driver.getTitle();
		System.out.println(hometitle);

		//Closing the sign up pop-up
		WebElement signuppop=driver.findElement(By.xpath("//button[@class='mfp-close']"));
		signuppop.click();
		//Thread.sleep(3000);
		
		//click on european silver dynamically changing shop now button 
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("slider-3-slide-7-layer-5"))));
		driver.findElement(By.id("slider-3-slide-7-layer-5")).click();
		Thread.sleep(2000);
		driver.navigate().back();
	
		//click on gold maple leaf dynamically changing shop now button 				
		WebDriverWait wait1=new WebDriverWait(driver,30);
		wait1.until(ExpectedConditions.visibilityOfElementLocated((By.id("slider-3-slide-6-layer-5"))));
		driver.findElement(By.id("slider-3-slide-6-layer-5")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		//click on platinum bar dynamically changing shop now button 
		
		WebDriverWait wait2=new WebDriverWait(driver,30);
		wait2.until(ExpectedConditions.visibilityOfElementLocated((By.id("slider-3-slide-109-layer-5"))));
		driver.findElement(By.id("slider-3-slide-109-layer-5")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(4000);
		driver.quit();
	}
	
	
}
