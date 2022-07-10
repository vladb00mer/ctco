package pageobjects;

import common.Init;
import common.ParentPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AuthorizationPage extends ParentPage {

    @FindBy(xpath = "//input[@id = 'login']")
    private WebElement loginInput;

    @FindBy(xpath = "//input[@id = 'password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[@type = 'submit']")
    private WebElement submitButton;

    public AuthorizationPage() {

        Init.getWebDriver().navigate().to("https://ctco.lv/en");
        PageFactory.initElements(Init.getWebDriver(), this);
        new WebDriverWait(Init.getWebDriver(), Init.getTimeOut()).until(ExpectedConditions.visibilityOf(submitButton));
    }

    public HomePage authorize(String log, String pass) {

        setTextValue(loginInput, log);
        setTextValue(passwordInput, pass);
        clickOnElement(submitButton);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new HomePage();
    }
}
