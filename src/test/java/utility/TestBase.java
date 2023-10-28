package utility;

import helpers.Browser;
import helpers.JsonReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class TestBase {

    public WebDriver driver;
    public WebDriverWait wait;
    public JsonReader reader = new JsonReader();
    @BeforeSuite
    public void setup(){
        driver = new Browser().getBrowser("chrome");
        wait = new WebDriverWait(driver, Duration.ofMinutes(1));
    }


    @BeforeTest
    public void login(){
        reader.getProperties();
        driver.navigate().to(reader.url);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email']")));
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(reader.username);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(reader.password);
        driver.findElement(By.xpath("//button[text()='Login']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@class='clsHomeHeading']")));
    }

    @AfterTest
    public void teardown(){
        driver.quit();
    }
}
