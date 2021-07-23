package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage {
    private WebDriver driver;

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
    }
    @FindBy(xpath = "//*[@class='info-account']")
    private WebElement welcomeMessage;
    @FindBy(xpath = "//*[@class='logout']")
    private WebElement signOutButton;

    public void checkWelcomeMessage(String expectedWelcomeMessage){
        Assert.assertTrue(expectedWelcomeMessage.equals(welcomeMessage.getText()));
    }
    public void signOut(){
        signOutButton.click();
    }
}
