import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class WebDriverSetting {
    public ChromeDriver driver;
    @BeforeTest
    public void setUP() {
        System.setProperty("webdriver.chrome.driver", "D:\\driverChrom\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @AfterTest
    public void close() {
        driver.quit();
    }
}
