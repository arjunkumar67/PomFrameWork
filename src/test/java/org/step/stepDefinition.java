package org.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepDefinition {
	WebDriver driver;

@Given("User is on adactin login page")
public void user_is_on_adactin_login_page() {
   WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
   driver.get("http://adactinhotelapp.com/");
   driver.manage().window().maximize();
}

@When("User enters the valid {string} and {string}")
public void user_enters_the_valid_and(String string, String string2) {
   WebElement txtUsername = driver.findElement(By.id("username"));
   txtUsername.sendKeys(string);
   WebElement txtPassword = driver.findElement(By.id("password"));
   txtPassword.sendKeys(string2);

}

@Then("User should click on login button")
public void user_should_click_on_login_button() {
	 WebElement btnLogin = driver.findElement(By.id("login"));
	   btnLogin.click();
}

@When("User fills the correct details on {string},{string},{string},{string},{string},{string}")
public void user_fills_the_correct_details_on(String string, String string2, String string3, String string4, String string5, String string6) throws InterruptedException {
    Thread.sleep(2000);
	WebElement location = driver.findElement(By.id("location"));
    Select s=new Select(location);
    s.selectByVisibleText(string);
    
    WebElement hotels = driver.findElement(By.id("hotels"));
    Select s1=new Select(hotels);
    s1.selectByVisibleText(string2);
    
    WebElement room_type = driver.findElement(By.id("room_type"));
    Select s3=new Select(room_type);
    s3.selectByVisibleText(string3);
    
    WebElement room_nos = driver.findElement(By.id("room_nos"));
    Select s4=new Select(room_nos);
    s4.selectByVisibleText(string4);
    
   
    WebElement adult_room = driver.findElement(By.id("adult_room"));
    Select s5=new Select(adult_room);
    s5.selectByVisibleText(string5);
    
    WebElement child_room = driver.findElement(By.id("child_room"));
    Select s6=new Select(child_room);
    s6.selectByVisibleText(string6);
    
}

@Then("User should click on search button")
public void user_should_click_on_search_button() throws InterruptedException {
	 WebElement Submit = driver.findElement(By.id("Submit"));
	 Submit.click();
	 Thread.sleep(2000);
}

@When("User should select any hotel")
public void user_should_select_any_hotel() {
	 WebElement radiobutton_0 = driver.findElement(By.id("radiobutton_0"));
	 radiobutton_0.click();
}

@Then("User should click on continue button")
public void user_should_click_on_continue_button() {
	 WebElement cont = driver.findElement(By.id("continue"));
	 cont.click();
}

@When("User should enter the correct details on {string},{string},{string},{string},{string},{string},{string},{string}")
public void user_should_enter_the_correct_details_on(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) throws InterruptedException {
	 Thread.sleep(2000);
	WebElement location = driver.findElement(By.id("first_name"));
	    location.sendKeys(string);
	    
	    WebElement hotels = driver.findElement(By.id("last_name"));
	    hotels.sendKeys(string2);
	    
	    WebElement room_nos = driver.findElement(By.id("address"));
	    room_nos.sendKeys(string3);
	    
	    WebElement room_type = driver.findElement(By.id("cc_num"));
	    room_type.sendKeys(string4);
	    
	    WebElement cc_type = driver.findElement(By.id("cc_type"));
	    Select s5=new Select(cc_type);
	    s5.selectByVisibleText(string5);
	    
	    WebElement cc_exp_month = driver.findElement(By.id("cc_exp_month"));
	    Select s6=new Select(cc_exp_month);
	    s6.selectByVisibleText(string6);
	    
	    WebElement cc_exp_year = driver.findElement(By.id("cc_exp_year"));
	    Select s7=new Select(cc_exp_year);
	    s7.selectByVisibleText(string7);
	    
	    WebElement cc_cvv = driver.findElement(By.id("cc_cvv"));
	    cc_cvv.sendKeys(string8);
	    
	    
}

@Then("User should click book now button")
public void user_should_click_book_now_button() {
	WebElement book_now = driver.findElement(By.id("book_now"));
	book_now.click();
}

	
	
}
