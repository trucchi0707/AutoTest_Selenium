package Day_8;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.JavascriptExecutor;
public class Homework_Day_8_Bai_2 {
	
	WebDriver driver;
	
  @Test
  public void Testcase_1 () {
	  WebElement scrollpage = driver.findElement(By.id("login-form"));
	  ((JavascriptExecutor)driver).executeScript ("arguments[0].scrollIntoView();", scrollpage);
	  try {
		  Thread.sleep(2000);
	  } 
	  catch(InterruptedException e) {
		  e.printStackTrace();
	  }

	  WebElement txtName = driver.findElement(By.id("name"));
	  txtName.clear();
	  txtName.sendKeys("Test Submit");
	  
	  WebElement txtAddress = driver.findElement(By.id("address"));
	  txtAddress.clear();
	  txtAddress.sendKeys("address ABC Submit");
	  
	  WebElement txtEmail = driver.findElement(By.id("email"));
	  txtEmail.clear();
	  txtEmail.sendKeys("testsubmit@gmail.com");
	  
	  WebElement txtPassword = driver.findElement(By.id("password"));
	  txtPassword.clear();
	  txtPassword.sendKeys("Test123");
	  
	  try {
		  Thread.sleep(3000);
	  } 
	  catch(InterruptedException e) {
		  e.printStackTrace();
	  }
	  
	  WebElement btnSubmit = driver.findElement(By.xpath("//button[@value='Submit']"));
	  btnSubmit.click();	  
	  
	  try {
		  Thread.sleep(2000);
	  } 
	  catch(InterruptedException e) {
		  e.printStackTrace();
	  }
  }
  
  @Test
  public void Testcase_2 () {
	  WebElement scrollpage = driver.findElement(By.id("login-form"));
	  ((JavascriptExecutor)driver).executeScript ("arguments[0].scrollIntoView();", scrollpage);
	  try {
		  Thread.sleep(2000);
	  } 
	  catch(InterruptedException e) {
		  e.printStackTrace();
	  }

	  WebElement txtName = driver.findElement(By.id("name"));
	  txtName.clear();
	  txtName.sendKeys("TestReset");
	  
	  WebElement txtAddress = driver.findElement(By.id("address"));
	  txtAddress.clear();
	  txtAddress.sendKeys("address ABC Reset");
	  
	  WebElement txtEmail = driver.findElement(By.id("email"));
	  txtEmail.clear();
	  txtEmail.sendKeys("testreset@gmail.com");
	  
	  WebElement txtPassword = driver.findElement(By.id("password"));
	  txtPassword.clear();
	  txtPassword.sendKeys("Test123");
	  
	  try {
		  Thread.sleep(3000);
	  } 
	  catch(InterruptedException e) {
		  e.printStackTrace();
	  }
	  
	  WebElement btnReset = driver.findElement(By.xpath("//button[@value='Reset']"));
	  btnReset.click();
	  try {
		  Thread.sleep(2000);
	  } 
	  catch(InterruptedException e) {
		  e.printStackTrace();
	  }
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://automationfc.github.io/basic-form/index.html");
	  try {
		  Thread.sleep(2000);
	  }
	  catch(InterruptedException e) {
		  e.printStackTrace();
	  }
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
