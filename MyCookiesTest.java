import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MyCookiesTest {
    private static WebDriver driver;

    @BeforeClass
    public static void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dgotl\\Downloads\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://translate.google.com");
    }

    @Test
    public void test01_printCookies(){
        System.out.println(driver.manage().getCookies());
    }

   @Test
    public void test02_printCookieNamed() {
       System.out.println(driver.manage().getCookieNamed("NID"));
   }

    @AfterClass
    public static void afterClass() {
        driver.quit();
    }
}
