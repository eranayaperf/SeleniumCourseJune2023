package POM.Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Base {

    private WebDriver driver;
    private WebDriverWait wait;

    /*
    Constructor
     */
    public Base(WebDriver driver) {
        this.driver = driver;
    }

    /*
    Chrome Driver
     */
    public WebDriver chromeDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        return driver;
    }

    /*
    Launch browser
     */
    public void launchBrowser(String url){
        driver.get(url);
        driver.manage().window().maximize();
    }

    /*
    Implicit wait
     */
    public void implicitWait() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void implicitWait(int seconds) {
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }

    /*
     Explicit Wait
     */
    public void verifyVisibilityOfElementLocated(By element) {
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public void verifyTitleContains(String title) {
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.titleContains(title));
    }

    /*
    Common Actions (Keywords)
     */

    // Type
    public void type(String text, By element) {
        try{
            driver.findElement(element).sendKeys(text);
        }
        catch (NoSuchElementException e) {
            e.getMessage();
        }
    }

    // Click
    public void click(By element) {
        try{
            driver.findElement(element).click();
        }
        catch (NoSuchElementException e) {
            e.getMessage();
        }
    }

    // GetText
    public String getText(By element) {
        return driver.findElement(element).getText();
    }


    /*
    Close driver
     */
    public void closeDriver(){
        driver.close();
    }

}
