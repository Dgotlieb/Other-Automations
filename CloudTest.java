import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class CloudTest {
    private static RemoteWebDriver driver;

    @BeforeClass
    public static void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("username", "XXXXXXXXXXXXXXXXXXXXX");
        capabilities.setCapability("accessKey", "XXXXXXXXXXXXXXXXXXXX");
        capabilities.setCapability("browserName", "Chrome");
        capabilities.setCapability("platform", "Windows 10");
        capabilities.setCapability("version", "81.0");
        capabilities.setCapability("build", "Onboarding Sample App - Java-TestNG");
        capabilities.setCapability("name", "3-cross-browser");
        driver = new RemoteWebDriver(new URL("http://ondemand.saucelabs.com/wd/hub"), capabilities);
    }

    @Test
    public void simpleTest(){
        driver.get("https://translate.google.com");
        driver.findElement(By.id("source")).sendKeys("hello");
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

}