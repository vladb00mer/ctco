package ui;

import common.Init;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageobjects.HomePage;

import static org.testng.AssertJUnit.assertEquals;

@Test
public class TechnicalTaskTest {

    private static HomePage homePage;

    @BeforeClass(alwaysRun = true)
    static void setUp() {

        homePage = new HomePage();
    }

    @Test()
    void testSearch() {

        int count = homePage.navigateToCareers().navigateToVacanciesList().openVacancyTestAutomationEngineer().getVacancySkillsCount();
        assertEquals(28, count);
    }

    @AfterClass(alwaysRun = true)
    static void tearDown() {

        Init.closeDriver();
        homePage = null;
    }
}
