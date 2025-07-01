package tutorials_ninja;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Add_to_cart {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		WebElement product=driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[3]/div/div[1]/a"));
		product.click();
		WebElement checkbox=driver.findElement(By.name("option[223][]"));
		checkbox.click();
		WebElement text=driver.findElement(By.id("input-option208"));
		text.clear();
		text.sendKeys("screen");
		Thread.sleep(2000);
		Select color=new Select(driver.findElement(By.xpath("//*[@id=\"input-option217\"]")));
		color.selectByIndex(3);
		WebElement textarea=driver.findElement(By.id("input-option209"));
		textarea.sendKeys("computer screen");
		WebElement choose=driver.findElement(By.id("button-upload222"));
		choose.click();
		Thread.sleep(2000);
		StringSelection str=new StringSelection("C:\\Users\\pc\\Downloads\\chapter5.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str,null);
		Robot robo=new Robot();
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(10000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		WebElement date=driver.findElement(By.id("input-option219"));
		date.clear();
		date.sendKeys("2025-06-30");
		WebElement time=driver.findElement(By.id("input-option221"));
		time.clear();
		time.sendKeys("12:44");
		WebElement datetime=driver.findElement(By.id("input-option220"));
		datetime.clear();
		datetime.sendKeys("2025-06-30 12:44");
		WebElement quantity=driver.findElement(By.id("input-quantity"));
		quantity.clear();
		quantity.sendKeys("3");
		WebElement addtocart=driver.findElement(By.id("button-cart"));
		addtocart.click();
		
	}

}
