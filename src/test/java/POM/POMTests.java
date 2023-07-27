package POM;

import POM.Base.GlobalVariables;
import POM.PageObjects.HomePage;
import POM.Base.Base;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class POMTests {

    // Variables
    WebDriver driver;
    Base base;
    HomePage homePage;
    String expectedComputer;

    @BeforeTest
    public void Setup(){
        base = new Base(driver);
        driver = base.chromeDriver();
        homePage = new HomePage(driver);
        expectedComputer = base.getJSONValue("testCase01", "computer");
    }

    @Test (groups = "Find Computers")
    public void TestCase01() {
        base.launchBrowser(GlobalVariables.URL);
        homePage.filterByComputerName(expectedComputer);
        Assert.assertTrue(homePage.verifyComputerTable(expectedComputer));
    }

    @Test (groups = "Find Computers")
    public void TestCase02() {
        base.launchBrowser(GlobalVariables.URL);
        homePage.filterByComputerName(expectedComputer);
        Assert.assertTrue(homePage.verifyComputerTable(expectedComputer));
    }

    @Test
    public void TestCase03() {
        base.launchBrowser(GlobalVariables.URL);
        homePage.filterByComputerName(expectedComputer);
        Assert.assertTrue(homePage.verifyComputerTable(expectedComputer));
    }

    @Test
    public void TestCase04() {
        base.launchBrowser(GlobalVariables.URL);
        homePage.filterByComputerName(expectedComputer);
        Assert.assertTrue(homePage.verifyComputerTable(expectedComputer));
    }

    @AfterTest
    public void cleanUp(){
        //base.closeDriver();
    }

}
