import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hooks extends Obj
{

    @Before
    public static void openbrowser()
    {
        if (Automationconstants.BROWSER.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if (Automationconstants.BROWSER.equalsIgnoreCase("Firefox"))
        {
            System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else {
            System.out.println("sorry");
        }
        driver.get(Automationconstants.URL);
    }
    @After
    public static void closebrowser()
    {
       // driver.quit();
    }

}
