package org.booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HotelBook {
	WebDriver driver;
	@Given("user is on adactin homepage")
	public void user_is_on_adactin_homepage() {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://adactinhotelapp.com/");
	    
	}

	@When("user Enter {string} and {string}")
	public void user_Enter_and(String string, String string2) throws InterruptedException {
		WebElement textUser = driver.findElement(By.id("username"));
		textUser.sendKeys(string);
		WebElement textPassword = driver.findElement(By.id("password"));
		textPassword.sendKeys(string2);
		Thread.sleep(2000);
		

	  
	}

	@When("user should click login button")
	public void user_should_click_login_button() {
		WebElement loginBtn = driver.findElement(By.id("login"));
		loginBtn.click();

	    
	}

	@When("search hotel {string},{string},{string},{string},{string},{string},{string} And user should click button")
	public void search_hotel_And_user_should_click_button(String string, String string2, String string3, String string4, String string5, String string6, String string7) throws InterruptedException {
		WebElement location = driver.findElement(By.id("location"));
		Select select = new Select(location);
		select.selectByValue(string);
	
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select select1 = new Select(hotel);
		select1.selectByValue(string2);
		WebElement room = driver.findElement(By.id("room_type"));
		Select select2 = new Select(room);
		select2.selectByValue(string3);
		//WebElement roomNo = driver.findElement(By.id("room_nos"));
		//Select select3 = new Select(roomNo);
		//select3.selectByValue();
	WebElement dateIn = driver.findElement(By.xpath("//input[@name='datepick_in']"));
	dateIn.clear();
	dateIn.sendKeys(string4);
	WebElement dateOut = driver.findElement(By.xpath("//input[@name='datepick_out']"));
	dateOut.clear();
	dateOut.sendKeys(string5);
//	WebElement adultRoom = driver.findElement(By.id("adult_room"));
	//Select select3 = new Select(adultRoom);
	//select3.selectByValue(string6);
	//Thread.sleep(5000);
	//WebElement childRoom = driver.findElement(By.xpath("//select[@name='child_room']"));
	//Select select4 = new Select(childRoom);
	//select4.selectByValue(string7);
	WebElement searchBtn = driver.findElement(By.id("Submit"));
	searchBtn.click();
	
	  
	}

	@When("user select Hotel")
	public void user_select_Hotel() {
		WebElement tikBox = driver.findElement(By.id("radiobutton_0"));
		tikBox.click();
		WebElement continueBtn = driver.findElement(By.id("continue"));
		continueBtn.click();
		
		
	  
	}

	@When("user enter {string},{string},{string},{string},{string},{string},{string},{string} And user should click book now btn")
	public void user_enter_And_user_should_click_book_now_btn(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) throws InterruptedException {
		WebElement firstName = driver.findElement(By.id("first_name"));
		firstName.sendKeys(string);
		
		WebElement lastName = driver.findElement(By.id("last_name"));
		lastName.sendKeys(string2);
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys(string3);
		Thread.sleep(2000);
		WebElement cc = driver.findElement(By.id("cc_num"));
		cc.sendKeys(string4);
		WebElement type = driver.findElement(By.id("cc_type"));
		Select select5 = new Select(type);
		select5.selectByValue(string5);
		WebElement month = driver.findElement(By.id("cc_exp_month"));
		Select select6 = new Select(month);
		select6.selectByIndex(2);
		WebElement year = driver.findElement(By.id("cc_exp_year"));
		Select select7 = new Select(year);
		select7.selectByIndex(2);
		Thread.sleep(2000);
		WebElement ccNo = driver.findElement(By.id("cc_cvv"));
		ccNo.sendKeys(string8);
		WebElement book = driver.findElement(By.id("book_now"));
		book.click();
	}

		

	@Then("user verify homepage")
	public void user_verify_homepage() throws InterruptedException {
		Thread.sleep(10000);

		WebElement orderNo = driver.findElement(By.xpath("//input[contains(@id,'order_no')]"));
		String orderid = orderNo.getAttribute("value");
		System.out.println(orderid);
		
		Thread.sleep(2000);
		driver.close();
	}




}
