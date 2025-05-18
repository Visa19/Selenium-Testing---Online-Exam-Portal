import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAutomationTest {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selanium_Google Drive\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://exam.uwu.ac.lk/ug/");
		
		driver.findElement(By.name("username")).sendKeys("iit20045@std.uwu.ac.lk" + Keys.ENTER);
		

	}

}
