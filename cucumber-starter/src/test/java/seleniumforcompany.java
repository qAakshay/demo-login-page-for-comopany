import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class seleniumforcompany {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\webdriver\\chromedriver_win32 (1)\\chromedriver.exe");
	     WebDriver driver= new ChromeDriver();
	     driver.manage().window().maximize();
		 driver.get("https://sakshingp.github.io/assignment/login.html");
		    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Akshay kokare");
		     driver.findElement(By.xpath("//input[@id='password']")).sendKeys("akshay1688");
		     driver.findElement(By.xpath("//button[@id='log-in']")).click();
		     driver.findElement(By.xpath("//th[@id='amount']")).click();
		     String ActualTitle = driver.getTitle();
		     String ExpectedTitle = "Demo App";
		      System.out.println("The title of the appliction:"+ActualTitle);
		      Assert.assertEquals(ActualTitle,ExpectedTitle );
		    
		     
		}

		}


