package Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	WebDriver driver;

	@BeforeTest
	public void InIt() {
		System.setProperty("webdriver.edge.driver",
				System.getProperty("user.dir") + "/src/test/resources/Drivers/msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.fitpeo.com/");
	}

	@AfterTest
	public void quittt() {
		// driver.close();
	}

}
