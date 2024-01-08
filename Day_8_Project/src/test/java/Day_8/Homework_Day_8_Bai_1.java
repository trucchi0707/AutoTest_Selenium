package Day_8;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Homework_Day_8_Bai_1 {
	
	WebDriver driver;
	
  @Test
  public void Testcase_1() {
	  WebElement imgClose = driver.findElement(By.className("sgpb-popup-close-button-6"));
	  imgClose.click();
	  try {
		  Thread.sleep(2000);
	  } 
	  catch(InterruptedException e) {
		  e.printStackTrace();
	  }
	  
	  // Có lỗi ở field Email => Bỏ qua field này sẽ run được script
	  
//	  WebElement txtEmail = driver.findElement(By.name("email"));
////	  WebElement txtEmail = driver.findElement(By.xpath("//input[@title='Email']"));
////	  WebElement txtEmail = driver.findElement(By.xpath("//input[@autocomplete='anyrandomstring']"));
//	  
//	  txtEmail.clear();
//	  txtEmail.sendKeys("testabc@gmail.com");
	  
	  WebElement txtPassword = driver.findElement(By.id("pass"));
	  txtPassword.clear();
	  txtPassword.sendKeys("123abc");
	  
	  WebElement txtCompany = driver.findElement(By.name("company"));
	  txtCompany.clear();
	  txtCompany.sendKeys("Company ABC");
	  
	  WebElement txtMobileNumber = driver.findElement(By.name("mobile number"));
	  txtMobileNumber.clear();
	  txtMobileNumber.sendKeys("0123456789");
	  
	  try {
		  Thread.sleep(2000);
	  } 
	  catch(InterruptedException e) {
		  e.printStackTrace();
	  }
	  
	  WebElement btnSubmit = driver.findElement(By.xpath("//input[@type='submit']"));
	  btnSubmit.click();
	  
	 
  }
  @BeforeClass
  public void beforeClass() {
	  driver = new FirefoxDriver();
	  //driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://selectorshub.com/xpath-practice-page/");
	  
	  try {
		  Thread.sleep(5000);
	  } 
	  catch(InterruptedException e) {
		  e.printStackTrace();
	  }
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
