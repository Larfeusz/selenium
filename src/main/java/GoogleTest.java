import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class GoogleTest extends TestCase{

    // WebDriver symulator przeglądarki, API, symuluje przeglądarke


    @Test
    public void googleTest() {
        webDriver.navigate().to("http://www.google.pl"); // przejscie na strone
        WebElement input = webDriver.findElement(By.name("q")); // znalezionie inputa
        input.sendKeys("warszawa"); // wpisanie warszawa
        input.submit(); // zrobienie entere
        assertTrue(webDriver.getTitle().contains("warszawa"));
        // tytul strony na ktora przeszedl
    }

    @Test
    public void testAkademiakodu(){
        webDriver.navigate().to("https://www.akademiakodu.pl");
//         webDriver.manage().window().setSize(new Dimension(1024,768)); to załatwia temat widoku mobilnego strony jeśli
//         się taki pojawi. wtedy może zniknąć menu które sprawdzamy i wtedy test się nie uda, a wystarczy powiększyć okienko
//         Jeśli mamy kropkę "." to jest to klasa
//         id to #

        List<WebElement>elements = webDriver.findElements(By.cssSelector(".menu-links ul li a"));
        assertEquals("Facebook", elements.get(0).getText());
        assertEquals("Szkolenie Python",elements.get(1).getText());
        assertEquals("Youtube",elements.get(2).getText());
    }
    @Test
    public void testAakdemiaKoduDofinansowania(){
        webDriver.navigate().to("http://www.akademiakodu.pl");
        WebElement webElement = webDriver.findElement(By.linkText("Dofinansowania"));
        String url = webElement.getAttribute("href");
        webDriver.navigate().to(url);
        assertTrue(webDriver.getPageSource().contains("Urząd Pracy"));
    }
}