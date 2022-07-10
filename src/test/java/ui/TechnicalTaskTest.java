package ui;

import common.Init;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pageobjects.AuthorizationPage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

@Test
public class TechnicalTaskTest {

    private static AuthorizationPage authorizationPage;

    @BeforeClass(alwaysRun = true)
    static void setUp() {

        //authorizationPage = new AuthorizationPage();
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