package ui;

import common.Init;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageobjects.HomePage;

import static org.testng.AssertJUnit.assertTrue;

@Test
public class TechnicalTaskTest {

    private static HomePage homePage;

    @BeforeClass(alwaysRun = true)
    static void setUp() {

        homePage = new HomePage();
    }

    @Test()
    void testSearch() {

        assertTrue(true);
    }

    @AfterClass(alwaysRun = true)
    static void tearDown() {

        Init.closeDriver();
        //authorizationPage = null;
    }
}