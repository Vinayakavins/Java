import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Nopcommerceregister {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\browsedrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
        driver.findElement(By.id("gender-male")).click();
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Vinayaka");
        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Narahari");
        driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")).sendKeys("12");
        driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']")).sendKeys("June");
        driver.findElement(By.xpath("//select[@name='DateOfBirthYear']")).sendKeys("1995");
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("Vinayaka@gmail.com");
        driver.findElement(By.xpath("//input[@id='Company']")).sendKeys("QUESS Corp");
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Vinayaka1");
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Vinayaka1");
        driver.findElement(By.xpath("//button[@id='register-button']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Log in']")).click();
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("Vinayaka@gmail.com");
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Vinayaka1");
        driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Books']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Fahrenheit 451 by Ray Bradbury']")).click();
        driver.findElement(By.xpath("//button[@id='add-to-cart-button-37']")).click();
        driver.findElement(By.xpath("//span[@class='cart-label']")).click();

	}

}
