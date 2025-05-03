import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.jupiter.api.Assertions.assertNotNull;

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
    WebElement surrenderButton = driver.findElement(By.xpath("//button[text()='Я сдаюсь']"));
    assertNotNull(surrenderButton, "Кнопка 'Я сдаюсь' не найдена на странице");

    surrenderButton.click();

    WebElement answerLink = driver.findElement(By.xpath("//a[text()='Ссылка на ответы']"));
    assertNotNull(answerLink, "Ссылка 'Ссылка на ответы' не найдена на странице");

    WebElement hideButton = driver.findElement(By.xpath("//button[text()='Спрятать ответы']"));
    assertNotNull(hideButton, "Кнопка 'Спрятать ответы' не найдена на странице");
    }
@AfterEach
public void tearDown(){
    if (driver != null) {
        driver.quit();
    }
    }
}

