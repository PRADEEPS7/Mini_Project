package com.Selenium_Class;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Mini_Project {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");

		driver.manage().window().maximize();

		WebElement sign_in = driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));

		sign_in.click();

		WebElement enter_mail = driver.findElement(By.id("email_create"));

		enter_mail.sendKeys("spr635242@gmail.com");

		WebElement create_account = driver.findElement(By.id("SubmitCreate"));

		create_account.click();

		Thread.sleep(3000);

		WebElement gender_select = driver.findElement(By.id("id_gender1"));

		gender_select.click();

		WebElement first_name = driver.findElement(By.xpath("//input[@name='customer_firstname']"));

		first_name.sendKeys("PRADEEP");

		WebElement last_name = driver.findElement(By.id("customer_lastname"));

		last_name.sendKeys("S");

		WebElement password = driver.findElement(By.xpath("//input[@name='passwd']"));

		password.sendKeys("Tester@95");

		WebElement day_select = driver.findElement(By.xpath("//select[@name='days']"));

		Select s = new Select(day_select);

		s.selectByValue("5");

		WebElement month_select = driver.findElement(By.xpath("//select[@name='months']"));

		Select s1 = new Select(month_select);

		s1.selectByIndex(6);

		WebElement year_select = driver.findElement(By.xpath("//select[@name='years']"));

		Select s2 = new Select(year_select);

		s2.selectByVisibleText("1995  ");

		WebElement address_1 = driver.findElement(By.id("address1"));

		address_1.sendKeys("345 N Washington St");

		WebElement address_2 = driver.findElement(By.id("address2"));

		address_2.sendKeys("Hagertown");
		
		WebElement city = driver.findElement(By.id("city"));

		city.sendKeys("Hagertown");
		
		WebElement state_select = driver.findElement(By.xpath("//select[@name='id_state']"));

		Select s3 = new Select(state_select);

		s3.selectByIndex(15);
		
		WebElement pincode = driver.findElement(By.id("postcode"));

		pincode.sendKeys("47346");
		
		WebElement ph_number = driver.findElement(By.id("phone_mobile"));

		ph_number.sendKeys("812-710-8634");
		
		WebElement ref_add = driver.findElement(By.xpath("//input[@name='alias']"));

		ref_add.sendKeys("Indiana");
		
		Thread.sleep(3000);
		
		WebElement register = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		
		register.click();
		
		TakesScreenshot scrShot = (TakesScreenshot)driver;

		File source = scrShot.getScreenshotAs(OutputType.FILE);

		File destination = new File("C:\\Users\\PRADEEP S\\eclipse-workspace\\Selenium_Course\\Screenshot\\Account_Register.png");

		FileUtils.copyFile(source, destination);

		
		

	}
}