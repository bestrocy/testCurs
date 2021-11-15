import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;



public class OpenHerokuapp extends WebDriverSetting {

    @Test
    public void openSearchClick() {
        driver.get("https://the-internet.herokuapp.com/");
        WebElement digest = driver.findElement(By.linkText("Digest Authentication"));
        digest.click();
    }

    @Test
        public void openSearchCheckboxes() {
            driver.get("https://the-internet.herokuapp.com/");
            WebElement checkboxes = driver.findElement(By.linkText("Checkboxes"));
            checkboxes.click();
    }
}
