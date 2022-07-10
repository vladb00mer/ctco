package pageobjects.vacancies;

import common.Init;
import common.ParentPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VacanciesListPage extends ParentPage {

    @FindBy(xpath = "//h1[contains(text(), 'Vacancies')]")
    private WebElement vacanciesListHeader;

    @FindBy(xpath = "//a[@href='https://ctco.lv/careers/vacancies/test-automation-engineer-3/']")
    private WebElement testAutomationEngineer;

    public VacanciesListPage() {

        PageFactory.initElements(Init.getWebDriver(), this);
        new WebDriverWait(Init.getWebDriver(), Init.getTimeOut()).until(ExpectedConditions.visibilityOf(vacanciesListHeader));
    }

    public TestAutomationEngineerVacancyPage openVacancyTestAutomationEngineer() {

        clickOnElement(testAutomationEngineer);
        return new TestAutomationEngineerVacancyPage();
    }
}
