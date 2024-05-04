package Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Scrolling_JS {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.openmultipleurl.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,1000);");
        Thread.sleep(10000);
        js.executeScript("window.scrollBy(0,-500);");

        Thread.sleep(10000);

        js.executeScript("window.scrollTo(0,document.body.scrollHeight);");

        Thread.sleep(10000);
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//b[text()='Open Multiple URL']")));


        js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//b[text()='Open Multiple URL']")));

    }
}
