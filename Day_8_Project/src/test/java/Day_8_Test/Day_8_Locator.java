package Day_8_Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Day_8_Locator {
	WebDriver driver;
  @Test
  @Ignore
  public void Testcase_1() {
	  WebElement imgClose = driver.findElement(By.className("sgpb-popup-close-button-6"));
	  imgClose.click();
	  try {
		  Thread.sleep(2000);
	  } 
	  catch(InterruptedException e) {
		  e.printStackTrace();
	  }
	  
	  WebElement txtEmail = driver.findElement(By.name("email"));
	  txtEmail.clear();
	  txtEmail.sendKeys("testabc@gmail.com");
	  
	  WebElement txtPassword = driver.findElement(By.id("pass"));
	  txtPassword.clear();
	  txtPassword.sendKeys("123abc");
	  
	  WebElement btnSubmit = driver.findElement(By.xpath("//input[@type='submit']"));
	  btnSubmit.click();
	  try {
		  Thread.sleep(2000);
	  } 
	  catch(InterruptedException e) {
		  e.printStackTrace();
	  }
	  
  }
  
  @Test
  public void Testcase_2() {
	  	  
	  WebElement txtUser = driver.findElement(By.name("username"));
	  txtUser.clear();
	  txtUser.sendKeys("Admin");
	  
	  WebElement txtPassword = driver.findElement(By.name("password"));
	  txtPassword.clear();
	  txtPassword.sendKeys("admin123");
	  
	  WebElement btnSubmit = driver.findElement(By.xpath("//button[@type='submit']"));
	  btnSubmit.click();
	  try {
		  Thread.sleep(2000);
	  } 
	  catch(InterruptedException e) {
		  e.printStackTrace();
	  }
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
	  //driver.get("https://selectorshub.com/xpath-practice-page/");
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  try {
		  Thread.sleep(2000);
	  } 
	  catch(InterruptedException e) {
		  e.printStackTrace();
	  }
	  driver.manage().window().maximize();
	  
  }
  

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
