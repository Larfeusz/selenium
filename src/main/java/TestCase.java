import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestCase {

    protected WebDriver webDriver;

    @BeforeMethod
    public void setWebDriver(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Larry\\Desktop\\chromedriver.exe");
        webDriver = new ChromeDriver();
    }
    @AfterMethod
    public void closeWebDriver(){
        webDriver.close();
        webDriver.quit();
    }
}
