package pageobjects.implementations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.IDashboard;

public class Dashboard implements IDashboard {

    WebDriver driver;
    WebDriverWait wait;
     public Dashboard(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }

    @Override
    public void clickOnMenu(String menuItem) {
        switch(menuItem){
            case "shipments":
                driver.findElement(By.xpath("//a[text()='SHIPMENTS']")).click();
                break;

            case "containers":
                driver.findElement(By.xpath("//a[text()='CONTAINERS']")).click();
                break;

            case "reports":
                driver.findElement(By.xpath("//a[text()='REPORTS']")).click();
                break;

            case "views":
                driver.findElement(By.xpath("//a[text()='VIEWS']")).click();
                break;

            case "claims":
                driver.findElement(By.xpath("//a[text()='CLAIMS']")).click();
                break;

            case "issues":
                driver.findElement(By.xpath("//a[text()='ISSUES']")).click();
                break;

            case "tools":
                driver.findElement(By.xpath("//a[text()='TOOLS']")).click();
                break;
        }
    }

    @Override
    public void clickOnDropDownMenu(String menuItem) {
        driver.findElement(By.xpath("//div[@class='header-shipping-label dropdown-label']"))
                .click();
        switch(menuItem){
            case "shipping":
                driver.findElement(By.xpath("//a[text()='Shipping ']")).click();
                break;

            case "products":
                driver.findElement(By.xpath("//a[text()='Products ']")).click();
                break;

            case "customers":
                driver.findElement(By.xpath("//a[text()='Customers ']")).click();
                break;

            case "platform":
                driver.findElement(By.xpath("//a[text()='Platform ']")).click();
                break;

            case "administration":
                driver.findElement(By.xpath("//a[text()='Administration ']")).click();
                break;
        }
    }

    @Override
    public void search(String searchItem) {

    }

    @Override
    public void logout() {

    }

    @Override
    public void clickOnKebabMenu() {

    }
}
