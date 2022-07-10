package common;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Init {

    private static WebDriver driver;
    private static final int TIMEOUT = 10;
    private static DesiredCapabilities capabilities;
    private static ChromeOptions chromeOptions;

    public static WebDriver getWebDriver() {

        //System.setProperty("webdriver.chrome.driver", "./webdrivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "./webdrivers/chromedriver");

        capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setPlatform(Platform.ANY);

        chromeOptions = new ChromeOptions();
        chromeOptions.merge(capabilities);

        if(driver == null) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }

        return driver;
    }

    public static int getTimeOut() {

        return TIMEOUT;
    }

    public String getCurrentDateAdTime(){

        return new SimpleDateFormat("ddMMyy-Hmm").format(Calendar.getInstance().getTime());
    }

    public static void closeDriver() {

        if(null != driver) {
            driver.quit();
            driver = null;
        }
    }
}
