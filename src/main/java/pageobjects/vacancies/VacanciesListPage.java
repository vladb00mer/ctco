package pageobjects.vacancies;

import common.Init;
import common.ParentPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Locale;

public class VacanciesListPage extends ParentPage {

    @FindBy(xpath = "//h1[contains(text(), 'Vacancies')]")
    private WebElement vacanciesListHeader;

    public VacanciesListPage() {

        PageFactory.initElements(Init.getWebDriver(), this);
        new WebDriverWait(Init.getWebDriver(), Init.getTimeOut()).until(ExpectedConditions.visibilityOf(vacanciesListHeader));
    }

    public TestAutomationEngineerVacancyPage openVacancy() {

        Init.getWebDriver().findElement(By.xpath("//a[href='https://ctco.lv/careers/vacancies/test-automation-engineer-3/']"));
        return new TestAutomationEngineerVacancyPage();
    }
}
