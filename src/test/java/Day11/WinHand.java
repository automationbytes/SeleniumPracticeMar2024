package Day11;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WinHand {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.openmultipleurl.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


        driver.findElement(By.id("list_urls")).sendKeys("https://www.google.com/");
        driver.findElement(By.id("list_urls")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("list_urls")).sendKeys("https://www.bing.com/");
        driver.findElement(By.id("list_urls")).sendKeys(Keys.ENTER);

        WebElement a = driver.findElement(By.xpath("//input[@value='Go Now']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()",a);

    }
}
