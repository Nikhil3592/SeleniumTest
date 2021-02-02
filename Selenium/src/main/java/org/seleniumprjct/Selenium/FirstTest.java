/*
Author: Nikhil
*/
package org.seleniumprjct.Selenium;

import java.awt.GraphicsDevice.WindowTranslucency;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class FirstTest 
{
    public static void main( String[] args )
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = null;
        try
        {
        	driver=new ChromeDriver();
			/*
			 * driver.navigate().to("https://www.google.com/");
			 * driver.switchTo().activeElement().sendKeys("nikhil");; Thread.sleep(10000);
			 * Actions act=new Actions(driver); act.sendKeys(Keys.ENTER).build().perform();
			 * Thread.sleep(5000); driver.navigate().back();
			 * 
			 * Thread.sleep(10000); driver.manage().timeouts().implicitlyWait(10,
			 * TimeUnit.SECONDS);
			 */
        	driver.manage().window().maximize();
        	driver.get("https://www.facebook.com/");
        	WebElement ele= driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
        	Actions act=new Actions(driver);
        	
        	//act.moveToElement(ele).contextClick().build().perform();;
        	Thread.sleep(5000);
            driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
        	Thread.sleep(5000);
        	String parentWindow=driver.getWindowHandle();
        	
        	driver.switchTo().newWindow(WindowType.WINDOW).get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.0.0-alpha-4");
        	Thread.sleep(5000);
        	driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.google.com/");
        	Thread.sleep(5000);
        	Set<String> handles=driver.getWindowHandles();
        	
        	
        	//WebDriverWait explctwait=new WebDriverWait(driver, 30);
        	
        	Select s=new Select(ele);
        	//s.

        	
        	for(String win:handles)
        	{
        		driver.switchTo().window(win);
        		System.out.println(driver.getTitle());
        	}
        	//Action act1=(Action) new Actions(driver);
        	
        	Actions act1=new Actions(driver);
        	act.moveToElement(ele).build();
        	
        	
        	driver.quit();
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        	driver.quit();
        }
    }
}
