package storeTests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.AuthenticationPage;
import pageObjects.HomePage;
import pageObjects.MyAccountPage;

import java.util.concurrent.TimeUnit;

public class BaseTests {
    public WebDriver driver;
    public HomePage homePage;
    public AuthenticationPage authenticationPage;
    public MyAccountPage myAccountPage;
    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        homePage = PageFactory.initElements(driver,HomePage.class);
        authenticationPage = PageFactory.initElements(driver,AuthenticationPage.class);
        myAccountPage = PageFactory.initElements(driver,MyAccountPage.class);
    }
    @After
    public void after(){
        //'driver.quit();
    }
}
