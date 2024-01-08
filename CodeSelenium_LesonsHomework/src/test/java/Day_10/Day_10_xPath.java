package Day_10;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import java.util.*;

public class Day_10_xPath {
	WebDriver driver;
	
  @Test
  @Ignore
  public void checkWithText() {
	  WebElement lnkHutMui = driver.findElement(By.xpath("//a[text()=' Máy Hút Mùi ']"));
	  lnkHutMui.click();
	  try {
		  Thread.sleep(3000);
	  } 
	  catch(InterruptedException e) {
		  e.printStackTrace();
	  }
	  String currentUrl = driver.getCurrentUrl();
	  String expectation = "https://bepantoan.vn/danh-muc/may-hut-mui1";
	  if(currentUrl.equals(expectation)) {
		  System.out.println("Đã click thành công link Máy hút mùi ở menu ngang");
	  }
	  //assertEquals(currentUrl, expectation);
  }
  @Test
  @Ignore
  public void checkWithContainsOrStartWidth() {
//	  WebElement lnkHutMui = driver.findElement(By.xpath("(//a[contains(normalize-space(),'Máy Hút Mùi')])[2]"));
//	  WebElement lnkHutMui = driver.findElement(By.xpath("(//a[starts-with(normalize-space(),'Máy Hút Mùi')])[2]"));
	  WebElement lnkHutMui = driver.findElement(By.xpath("//a[text()=' Máy Hút Mùi ' or text()=' Máy Rửa Chén Bát ']"));
	  lnkHutMui.click();
	  
	  
	  try {
		  Thread.sleep(3000);
	  } 
	  catch(InterruptedException e) {
		  e.printStackTrace();
	  }
	  String currentUrl = driver.getCurrentUrl();
	  String expectation = "https://bepantoan.vn/danh-muc/may-hut-mui";
	  if(currentUrl.equals(expectation)) {
		  System.out.println("Đã click thành công link Máy hút mùi ở menu ngang");
	  }
	  
	  WebElement topTitle = driver.findElement(By.xpath("//h1[contains(@class,'title-gradient')]"));
	  System.out.println(topTitle.getText());
  }
  
  @Test
  public void checkWithAndOrCondition() {
//	  WebElement lnkHutMui = driver.findElement(By.xpath("//a[text()=' Máy Hút Mùi ' or text()=' Máy Rửa Chén Bát ']"));
//	  lnkHutMui.click();
	  
	  List<WebElement> lstElement = driver.findElements(By.xpath("//a[text()=' Máy Hút Mùi ' or text()=' Máy Rửa Chén Bát ']"));
	  for (WebElement webElement : lstElement) {
		  webElement.click();
		  try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	  try {
		  Thread.sleep(3000);
	  } 
	  catch(InterruptedException e) {
		  e.printStackTrace();
	  }
	  	  
	  WebElement topTitle = driver.findElement(By.xpath("//h1[contains(@class,'title-gradient')]"));
	  System.out.println(topTitle.getText());
	  
//	  WebElement lnkBepGas = driver.findElement(By.xpath("//a[@class='menu-link' and @href='/danh-muc/bep-gas']"));
	  WebElement lnkBepGas = driver.findElement(By.xpath("//a[@class='menu-link' and contains( @href,'/danh-muc/bep-gas')]"));
		lnkBepGas.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  driver.manage().window().maximize();
	  driver.get("https://bepantoan.vn/");
	  try {
		  Thread.sleep(3000);
	  } 
	  catch(InterruptedException e) {
		  e.printStackTrace();
	  }
  }
  
  @AfterMethod
  public void afterMethod() {
//	  driver.close();
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://bepantoan.vn/");
	  try {
		  Thread.sleep(3000);
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
