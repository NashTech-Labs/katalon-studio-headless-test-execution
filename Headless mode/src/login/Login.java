package login;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "directory path");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("start_maximized");
		option.addArguments("disable-infobars");
		option.addArguments("disable-extensions");
		option.addArguments("--headless");
		option.addArguments("--window-size=1920,1080");
        option.addArguments("--window-size=1920,1080","--disable-gpu", "--disable-extensions", "--no-sandbox", "-incognito");
		   
		 WebDriver driver=new ChromeDriver(option);
		  
		 option.setHeadless(true);
		 driver.manage().window().maximize();
		 driver.get("https://mail.google.com/");
		 driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		 WebElement Emaill=driver.findElement(By.xpath("//input[@id='identifierId']"));
		 Emaill.sendKeys("Testing@gmail.com");
		 WebElement Next=driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
		 Next.click();
		 driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("******");
		 WebDriverWait wait = new WebDriverWait(driver,30);
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Next')]")));
	     driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
}
}