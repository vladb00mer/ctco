package ui;

import common.Init;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pageobjects.HomePage;
import org.testng.annotations.Test;

@Test
public class TechnicalTaskTest {

    private static HomePage homePage;

    @BeforeClass(alwaysRun = true)
    static void setUp() {
        homePage = new HomePage();
    }

    @Test()
    void testSearch() {

    }

    @AfterClass(alwaysRun = true)
    static void tearDown() {
        Init.closeDriver();
        homePage = null;
    }
}