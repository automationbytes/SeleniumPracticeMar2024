package Day10;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class Fb {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.findElement(By.xpath("//button[@data-testid='royal_login_button']")).click();

        driver.findElement(By.linkText("Create new account")).click();

      //  Thread.sleep(10000);

        driver.findElement(By.xpath("//input[@value=\"-1\"]")).click();
//explicit wait
//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//fluent wait
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                        .pollingEvery(Duration.ofSeconds(2))
                                .ignoring(NoSuchElementException.class);

        //common for both explict n fluent wait
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//select[@aria-label=\"Select your pronoun\"]"))));

        Select dropdown = new Select(driver.findElement(By.xpath("//select[@aria-label=\"Select your pronoun\"]")));
        dropdown.selectByIndex(1);


















    }
}
