package pageobjects;

import common.Init;
import common.ParentPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.vacancies.VacanciesListPage;

public class CareersPage extends ParentPage {

    @FindBy(xpath = "//a[@href = 'https://ctco.lv/careers/vacancies/']")
    private WebElement vacanciesList;

    public CareersPage() {

        PageFactory.initElements(Init.getWebDriver(), this);
        new WebDriverWait(Init.getWebDriver(), Init.getTimeOut()).until(ExpectedConditions.visibilityOf(vacanciesList));
    }

    public VacanciesListPage navigateToVacanciesList() {

        clickOnElement(vacanciesList);
        return new VacanciesListPage();
    }
}
