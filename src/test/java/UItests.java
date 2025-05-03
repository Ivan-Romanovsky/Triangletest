import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UItests {
WebDriver driver;

@BeforeEach
public void setUp()
{
    System.setProperty("webdriver.chrome.driver", "geckodriver.exe");
    FirefoxDriver options = new FirefoxDriver();
    driver = new FirefoxDriver();

    driver.get("https://playground.learnqa.ru/puzzle/triangle");
}
@Test
public void testTriangle(){

    }
@AfterEach
public void tearDown(){
    if (driver != null) {
        driver.quit();
    }
    }
}

