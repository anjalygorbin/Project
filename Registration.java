package tutorials_ninja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		WebElement account=driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a"));
		account.click();
		WebElement register=driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a"));
		register.click();
		WebElement fname=driver.findElement(By.id("input-firstname"));
		fname.sendKeys("Amal");
		WebElement lname=driver.findElement(By.id("input-lastname"));
		lname.sendKeys("John");
		WebElement email=driver.findElement(By.id("input-email"));
		email.sendKeys("amaljohn123@gmail.com");
		WebElement phone=driver.findElement(By.id("input-telephone"));
		phone.sendKeys("98652365");
		WebElement password=driver.findElement(By.id("input-password"));
		password.sendKeys("amaljohn123");
		WebElement cnfrmpass=driver.findElement(By.id("input-confirm"));
		cnfrmpass.sendKeys("amaljohn123");
		WebElement policycheck=driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]"));
		policycheck.click();
		WebElement continuebtn=driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]"));
		continuebtn.click();
		driver.close();
	}

}
