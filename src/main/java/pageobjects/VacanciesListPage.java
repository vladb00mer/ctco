package pageobjects;

import common.ParentPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VacanciesListPage extends ParentPage {

    @FindBy(xpath = "//h1[contains(text(), 'Vacancies')]")
    private WebElement vacanciesListHeader;


}
