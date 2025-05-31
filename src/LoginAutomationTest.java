import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAutomationTest {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selanium_Google Drive\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://exam.uwu.ac.lk/ug/");
		
		driver.findElement(By.name("username")).sendKeys("iit20045@std.uwu.ac.lk" + Keys.ENTER);
		
		
		driver.findElement(By.name("password")).sendKeys("Jknight@1823" + Keys.ENTER);
		
		Thread.sleep(5000);
		
		driver.findElement(By.className("has-arrow")).click();
		driver.findElement(By.xpath("//*[@id=\"menu\"]/li[4]/ul/li[3]/a")).click();
		Thread.sleep(5000);
	
		if (driver.findElements(By.className("has-arrow")).size() > 0) {
        	
            System.out.println("Login successful..!!");
            System.out.println("Test = Pass");
            
        } else {
        	
            System.out.println("Login failed. See Console For Any Error.");
            System.out.println("Test = Fail");
        }
		driver.quit();
        
	}

}
