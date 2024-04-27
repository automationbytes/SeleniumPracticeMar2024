package Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Eg {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
//        driver.findElement(By.id("email")).sendKeys("Tom");
//        driver.findElement(By.name("pass")).sendKeys("Admin123");
//        //driver.findElement(By.name("login")).click();
//         // driver.findElement(By.linkText("Forgotten password?")).click();
//        driver.findElement(By.partialLinkText("tten passwo")).click();

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Tom");
    }
}
