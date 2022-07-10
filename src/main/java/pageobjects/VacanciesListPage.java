package pageobjects;

import common.Init;
import common.ParentPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VacanciesListPage extends ParentPage {

    @FindBy(xpath = "//h1[contains(text(), 'Vacancies')]")
    private WebElement vacanciesListHeader;

    public VacanciesListPage() {

        PageFactory.initElements(Init.getWebDriver(), this);
        new WebDriverWait(Init.getWebDriver(), Init.getTimeOut()).until(ExpectedConditions.visibilityOf(vacanciesListHeader));
    }

    public VacancyPage openVacancy(String vacancyName) {

        Init.getWebDriver().findElement(By.xpath("//div/ul/li/a[contains(text(), '"+vacancyName+"')]"));
        return new VacancyPage();
    }
}
