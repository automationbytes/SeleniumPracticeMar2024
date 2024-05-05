package Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Scrolling_Actions {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://emicalculator.net/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

//        Actions actions = new Actions(driver);
//        actions.scrollToElement(driver.findElement(By.cssSelector("i[class=\"fa fa-print\"]")));
//        actions.build().perform();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.cssSelector("i[class=\"fa fa-print\"]")));


    }
}
