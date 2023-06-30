package LinearTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FirstTest {

    // Linear Scripting
    // Locators:
    /*
     - Id
     - Name
     - Link Text
     - Partial Link Text
     - Class name
     - Tag name
     - CSS Path
     - Xpath (Absoluto y Relativo)
    */

    /* Assertions
        Hard assertion: Validates the expected and actual results on the spot
        Soft assertion: Validates all assertions, will fail after validating all assertions
     */

    /* Pausas y sincronizacion
        Implicit wait: Una sincronizacion del script con el DOM (Document Object Model)
        Explicit wait: Una sincronizacion del script con un elemento en particular
     */

    @Test
    public void firsTest() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://computer-database.gatling.io/computers");
        driver.manage().window().maximize();

        // Forced wait
//        Thread.sleep(20000);

        // Implicit Wait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        // Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("searchbox")));

        driver.findElement(By.id("searchbox")).sendKeys("ARRA");

        driver.findElement(By.id("searchsubmit")).click();

        String actualComputerName = driver.findElement(By.xpath("//*[@id=\"main\"]/table/tbody/tr/td[1]/a")).getText();
        Assert.assertEquals(actualComputerName,"ARA");

        // Actividad
        // Crear un test donde se genere un record de una computadora nueva
        // Select company = new Select(driver.findElement(By.());
        // company.selectBy();
    }
}
