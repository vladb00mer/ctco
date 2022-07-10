package pageobjects.vacancies;

import common.Init;
import common.ParentPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class TestAutomationEngineerVacancyPage extends ParentPage {

    @FindBy(xpath = "//h1[contains(text(), 'TEST AUTOMATION ENGINEER vacancy')]")
    private WebElement vacancyHeader;

    public TestAutomationEngineerVacancyPage() {

        PageFactory.initElements(Init.getWebDriver(), this);
        new WebDriverWait(Init.getWebDriver(), Init.getTimeOut()).until(ExpectedConditions.visibilityOf(vacancyHeader));
    }

    public int getVacancySkillsCount() {

        List<WebElement> skills = Init.getWebDriver()
                .findElements(By.xpath("//div[@data-href=\"https://ctco.lv/careers/vacancies/test-automation-engineer-3/\"]/div/div/ul/li"));

        return skills.size();
    }
}
