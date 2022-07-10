package pageobjects;

import common.Init;
import common.ParentPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends ParentPage {

    @FindBy(xpath = "//button[@type = 'submit']")
    private WebElement searchButton;

    @FindBy(xpath = "//input[@id = 'text']")
    private WebElement searchArea;

    public HomePage() {

        Init.getWebDriver().navigate().to("https://ctco.lv/en");
        PageFactory.initElements(Init.getWebDriver(), this);
        new WebDriverWait(Init.getWebDriver(), Init.getTimeOut()).until(ExpectedConditions.visibilityOf(searchArea));
    }

    public HomePage search(String request) {

        setTextValue(searchArea, request);
        clickOnElement(searchButton);

        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return this;
    }
}
