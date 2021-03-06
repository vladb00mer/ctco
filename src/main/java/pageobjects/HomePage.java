package pageobjects;

import common.Init;
import common.ParentPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends ParentPage {

    @FindBy(xpath = "//a[@href = 'https://ctco.lv/careers/']")
    private WebElement careersArea;

    public HomePage() {

        Init.getWebDriver().navigate().to("https://ctco.lv/en");
        PageFactory.initElements(Init.getWebDriver(), this);
        new WebDriverWait(Init.getWebDriver(), Init.getTimeOut()).until(ExpectedConditions.visibilityOf(careersArea));
    }

    public CareersPage navigateToCareers() {

        clickOnElement(careersArea);
        return new CareersPage();
    }
}
