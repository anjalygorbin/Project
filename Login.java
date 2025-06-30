package tutorials_ninja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		WebElement account=driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a"));
		account.click();
		WebElement login=driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a"));
		login.click();
		WebElement email=driver.findElement(By.id("input-email"));
		email.sendKeys("amaljohn123@gmail.com");
		WebElement password=driver.findElement(By.id("input-password"));
		password.sendKeys("amaljohn123");
		WebElement loginbtn=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
		loginbtn.click();
		WebElement myaccount=driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a"));
		myaccount.click();
		WebElement logout=driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a"));
		logout.click();
		driver.close();
	}

}
