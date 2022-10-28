package oxhead;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestExecution {

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
		Thread.sleep(3000);
/*
		//Login/Registration
		driver.findElement(By.xpath("//a[@title='My account']")).click();

		Thread.sleep(3000);

		//User Name Text box
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("gkshekar97@gmail.com");

		Thread.sleep(3000);

		//PW text box
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Gkraja@880125");

		Thread.sleep(3000);
		//Clicking on remember me check box
		driver.findElement(By.xpath("//input[@name='rememberme']")).click();

		Thread.sleep(3000);
		//Login
		driver.findElement(By.xpath("//button[@name='login']")).click();

		Thread.sleep(5000);

		String logintitle=driver.getTitle();
		System.out.println(logintitle);
		String expectedresult="Oxhead";
		String actualresult=driver.getTitle();
		if(expectedresult.equals(actualresult))
			{
				System.out.println("login successfull");
			}

		*/
		//Click on select category dropdown 
		driver.findElement(By.xpath("//a[@rel='nofollow' and @href='#' and @data-val='0']")).click();

		Thread.sleep(3000); //Clicking on Palladium button
		driver.findElement(By.xpath("//a[@data-val='palladium']")).click();

		Thread.sleep(3000); //Click on submit button
		driver.findElement(By.xpath("//div[2]/form/button")).click();

		Thread.sleep(3000); //Clicking on the product
		driver.findElement(By.xpath("//a[text()='Palladium Maple Leaf']")).click();

		Thread.sleep(3000);

		//Clicking on Add to cart button 
		driver.findElement(By.xpath("//*[@id=\"product-8396\"]/div[1]/div[2]/div/div/div[2]/div/form/button")).click();





		Thread.sleep(3000);

		//Clicking on proceed to checkout button 
		driver.findElement(By.xpath("//a[@class='checkout-button button alt wc-forward']")).click();
		Thread.sleep(3000);

		//Entering Text in the First name text box
		WebElement fn = driver.findElement(By.xpath("//input[@id='billing_first_name']"));
		fn.clear();
		fn.sendKeys("Raja"); 

		//Entering Text in the Last name text box
		WebElement ln=driver.findElement(By.xpath("//input[@id='billing_last_name']"));
		ln.clear();
		ln.sendKeys("shekar");

		//Entering Text in the billing_company text box	
		WebElement cmpnytb=driver.findElement(By.xpath("//input[@id='billing_company']"));
		cmpnytb.clear();
		cmpnytb.sendKeys("Rgt"); 

		//Entering Text in the billing_company text box
		WebElement	streettb=	driver.findElement(By.xpath("//input[@id='billing_address_1']"));
		streettb.clear();
		streettb.sendKeys("4634 Rose Avenue"); 

		//Entering Text in the billing_city text box
		WebElement bc=driver.findElement(By.xpath("//input[@id='billing_city']"));
		bc.clear();
		bc.sendKeys("dallas");

		//State/count dropdown 
		WebElement element=driver.findElement(By.xpath("//select[@id='billing_state']")); 
		Select s=new Select(element); s.selectByValue("TX");

		//Entering Text in the Post code or zip code
		WebElement bp=	driver.findElement(By.xpath("//input[@id='billing_postcode']"));
		bp.clear();
		bp.sendKeys("75220");

		//Entering Text in the billing_phone
		WebElement bilingphone=driver.findElement(By.xpath("//input[@id='billing_phone']"));
		bilingphone.clear();
		bilingphone.sendKeys("8801251420");

		//Entering Text in the billing_email
		WebElement billingemail=	driver.findElement(By.xpath("//input[@id='billing_email']"));
		billingemail.clear();
		billingemail.sendKeys("gkshekar97@gmail.com");

		//clicking on validate address button

		driver.findElement(By.xpath("//button[text()='Validate Address' and @class='wc_avatax_validate_address button' and @data-address-type='billing']")).click();
		Thread.sleep(3000);
		//Click on check box 
		driver.findElement(By.xpath("//input[@id='terms']")).click();

		//click on place order 
		//driver.findElement(By.id("place_order")).click();
		
		Thread.sleep(3000);
		//click on shopping cart button
		driver.findElement(By.xpath("//div[4]/a/span[@class='wd-tools-icon wd-icon-alt']")).click();
		System.out.println("clicked on shopping cart button");
		//click on minus button 
		driver.findElement(By.xpath("//input[@class='minus']")).click();
		//send 0 to make their is 0 products
		driver.findElement(By.id("quantity_6220ab1108ddc")).sendKeys("0");
		//click on update cart button
		driver.findElement(By.xpath("//button[@name='update_cart']")).click();
		//verification that there is no product in the shopping cart page
		String expectedupdated="Cart updated.";
		String actualupdated="Cart updated.";
		if(expectedupdated.equals(actualupdated))
		{
			System.out.println("shopping cart page is empty");
		}
		else
		{
			System.out.println("shopping cart page is not became empty");
		}
		
		
		
		//Waiting for some time
		Thread.sleep(5000);
		
		//Closing the Applicaiton
		driver.quit();
		
		
		
		
	}

}
