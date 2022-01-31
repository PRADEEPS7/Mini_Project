package com.Selenium_Class;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Mini_Project1 {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://adactinhotelapp.com/");

		driver.manage().window().maximize();

		WebElement user_Name = driver.findElement(By.id("username"));

		user_Name.sendKeys("PRADEEPS95");

		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));

		password.sendKeys("Tester@95");

		WebElement login = driver.findElement(By.xpath("//input[@name='login']"));

		login.click();

		WebElement location_Sel = driver.findElement(By.xpath("//select[@name='location']"));

		Select s1 = new Select(location_Sel);

		s1.selectByValue("Paris");

		WebElement hotel_Sel = driver.findElement(By.id("hotels"));

		Select s2 = new Select(hotel_Sel);

		s2.selectByIndex(2);

		WebElement room_Type = driver.findElement(By.xpath("//select[@name='room_type']"));

		Select s3 = new Select(room_Type);

		s3.selectByVisibleText("Super Deluxe");

		WebElement room_Nos = driver.findElement(By.id("room_nos"));

		Select s4 = new Select(room_Nos);

		s4.selectByValue("2");

		WebElement date_In = driver.findElement(By.id("datepick_in"));

		date_In.clear();

		date_In.sendKeys("27/01/2022");

		WebElement date_Out = driver.findElement(By.id("datepick_out"));

		date_Out.clear();

		date_Out.sendKeys("31/01/2022");

		WebElement adult_Room = driver.findElement(By.xpath("//select[@name='adult_room']"));

		Select s5 = new Select(adult_Room);

		s5.selectByVisibleText("2 - Two");

		WebElement child_Room = driver.findElement(By.id("child_room"));

		Select s6 = new Select(child_Room);

		s6.selectByIndex(3);

		WebElement search_Hotel = driver.findElement(By.xpath("//input[@type='submit']"));

		search_Hotel.click();

		WebElement radio_Sel = driver.findElement(By.id("radiobutton_0"));

		radio_Sel.click();

		WebElement continue_sel = driver.findElement(By.xpath("//input[@name='continue']"));

		continue_sel.click();

		WebElement first_Name = driver.findElement(By.xpath("//input[@name='first_name']"));

		first_Name.sendKeys("Pradeep");

		WebElement last_Name = driver.findElement(By.id("last_name"));

		last_Name.sendKeys("S");

		WebElement bill_Address = driver.findElement(By.id("address"));

		bill_Address.sendKeys("129, Franklin Avenue, Qatar");

		WebElement cc_Number = driver.findElement(By.id("cc_num"));

		cc_Number.sendKeys("4157661897072601");

		WebElement cc_Type = driver.findElement(By.xpath("//select[@name='cc_type']"));

		Select s7 = new Select(cc_Type);

		s7.selectByIndex(1);

		WebElement cc_Exp_Month = driver.findElement(By.id("cc_exp_month"));

		Select s8 = new Select(cc_Exp_Month);

		s8.selectByValue("6");

		WebElement cc_Exp_Year = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));

		Select s9 = new Select(cc_Exp_Year);

		s9.selectByIndex(12);

		WebElement cc_CVV = driver.findElement(By.id("cc_cvv"));

		cc_CVV.sendKeys("613");

		WebElement book_Now = driver.findElement(By.xpath("//input[@name='book_now']"));

		book_Now.click();
		
		Thread.sleep(5000);

		TakesScreenshot scrShot = (TakesScreenshot) driver;

		File source = scrShot.getScreenshotAs(OutputType.FILE);

		File destination = new File(System.getProperty("user.dir") + "\\Screenshot\\Room_Booked.png");

		FileUtils.copyFile(source, destination);


	}

}
