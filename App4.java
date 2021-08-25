package test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahesh Samudrala\\Desktop\\StackRoute\\Test automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.intellipaat.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.className("main-search-input")).sendKeys("DevOps");
		driver.findElement(By.id("home-search-btn")).click();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		//Checking the data with the extracted data
		String Fdata = driver.findElement(By.className("list-style-detailwrapper")).getText();
		System.out.println(Fdata);
		String Cdata = "DevOps Certification Training";
		
//		if(Fdata.equals(Cdata))
//		{
//			
//			driver.findElement(By.className("course-image-wrapper")).click();
//    		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
//			
//		}
//		else
//		{
//			System.out.println("Course not Found..");
//		}
		
		driver.findElement(By.className("course-image-wrapper")).click();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		
		String date = driver.findElement(By.className("master-time-table-date-wrap")).getText();
		System.out.println(date);
		System.out.println("/------------------/");
		String Week = driver.findElement(By.className("master-time-table-weekdays-wrap")).getText();
		System.out.println(Week);
		System.out.println("/------------------/");
		String time = driver.findElement(By.className("master-time-table-time-wrap")).getText();
		System.out.println(time);
		System.out.println("/------------------/");
		System.out.println("Test Sucessful");
		driver.close();
		
		
	}

}
