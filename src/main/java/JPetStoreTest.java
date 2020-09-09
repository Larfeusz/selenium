import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class JPetStoreTest extends TestCase{


    @Test
    public  void testMainPage() throws InterruptedException {
        webDriver.navigate().to("https://jpetstore.cfapps.io/catalog");
        WebElement element = webDriver.findElement(By.xpath("//div[@id='Content']//a[5]//img[1]"));
        element.click();
        Thread.sleep(5000);
        List<WebElement> list = webDriver.findElements(By.xpath("//body//tr"));
        Assert.assertTrue(list.size() > 1);


    }
}
