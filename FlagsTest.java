import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FlagsTest {
    private static WebDriver driver;

    @BeforeClass
    public static void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver(new ChromeOptions().addArguments("--headless"));
        driver.get("https://translate.google.com");
    }

    @Test
    public void testPrintGoogleTranslateWindowHandle(){
        System.out.println("Window handle for Google Translate : " + driver.getWindowHandle());
    }

    @AfterClass
    public static void afterClass() {
        driver.quit();
    }
}
