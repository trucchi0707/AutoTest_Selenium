package Day_9;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Day_9_xPath {
	
	WebDriver driver;
	
  @Test
  @Ignore
  public void clickLastItem() {
	  driver.get("https://selectorshub.com/xpath-practice-page/");
	  WebElement imgClose = driver.findElement(By.cssSelector(".sgpb-popup-close-button-6"));
	  imgClose.click();
	  try {
		  Thread.sleep(2000);
	  }
	  catch(InterruptedException e) {
		  e.printStackTrace();
	  }
	  
	  WebElement scrollpage = driver.findElement(By.xpath("(//tr[@class='plan rit'])[last()]//a"));
	  ((JavascriptExecutor)driver).executeScript ("arguments[0].scrollIntoView();", scrollpage);
	  try {
		  Thread.sleep(2000);
	  } 
	  catch(InterruptedException e) {
		  e.printStackTrace();
	  }
	  
	  WebElement lnkLastItem = driver.findElement(By.xpath("(//tr[@class='plan rit'])[last()]//a"));
	  lnkLastItem.click();
	  
	  try {
		  Thread.sleep(5000);
	  }
	  catch(InterruptedException e) {
		  e.printStackTrace();
	  }
  }
  @Test
  @Ignore
  public void fillData() {
	  driver.get("https://automationfc.github.io/basic-form/index.html");
	  WebElement scrollpage = driver.findElement(By.id("login-form"));
	  ((JavascriptExecutor)driver).executeScript ("arguments[0].scrollIntoView();", scrollpage);
	  try {
		  Thread.sleep(2000);
	  } 
	  catch(InterruptedException e) {
		  e.printStackTrace();
	  }

	  WebElement txtName = driver.findElement(By.xpath("//input[@id='name']"));
	  txtName.clear();
	  txtName.sendKeys("TestSubmit");
	  
	  WebElement txtAddress = driver.findElement(By.xpath("//textarea[@id='address']"));
	  txtAddress.clear();
	  txtAddress.sendKeys("address ABC Submit");
	  
	  WebElement txtEmail = driver.findElement(By.xpath("//input[@id='email']"));
	  txtEmail.clear();
	  txtEmail.sendKeys("testsubmit@gmail.com");
	  
	  WebElement txtPassword = driver.findElement(By.xpath("//input[@id='password']"));
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
  @Ignore
  public void printTextElement() {
	  driver.get("https://chercher.tech/practice/dynamic-table");
	  WebElement btnBlueberry = driver.findElement(By.xpath("//button[@id='blue']"));
	  System.out.println(btnBlueberry.getText());
	  btnBlueberry.click();
	  try {
		  Thread.sleep(3000);
	  } 
	  catch(InterruptedException e) {
		  e.printStackTrace();
	  }
	  WebElement labelOut = driver.findElement(By.xpath("//h1[@id='output']"));
	  System.out.println("Output: " + labelOut.getText());
	  labelOut.click();
	  
	  WebElement btnOrange = driver.findElement(By.xpath("//button[normalize-space()='Orange']"));
	  System.out.println(btnOrange.getText());
	  btnOrange.click();
	  
	  WebElement btnJuice = driver.findElement(By.xpath("//button[normalize-space()='Juice']"));
	  System.out.println(btnJuice.getText());
	  btnJuice.click();
	  
	  WebElement btnBanana = driver.findElement(By.xpath("//button[normalize-space()='banana']"));
	  System.out.println(btnBanana.getText());
	  btnBanana.click();
	  
	  WebElement btnBananaJuice = driver.findElement(By.xpath("//button[normalize-space()='Banana \"Juice']"));
	  System.out.println(btnBananaJuice.getText());
	  btnBananaJuice.click();
	  
	  WebElement btnZackSnyder = driver.findElement(By.xpath("//input[@type='button']"));
	  System.out.println(btnZackSnyder.getText());
	  btnZackSnyder.click();
  
  
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	 
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
