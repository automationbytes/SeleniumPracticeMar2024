package Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class iframes_Eg {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("a[title=\"Change Orientation\"]")).click();
        //switch to frames
        //by name/id
        //webelement
        //index

       // driver.switchTo().frame("iframeResult");
        //driver.switchTo().frame(driver.findElement(By.name("iframeResult")));
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name=\"iframeResult\"]")));
        driver.findElement(By.xpath("//button[text()='Try it']")).click(); //

        /*
        Alerts

        accept -
        dismiss
        sendkeys
        getText

         */


        System.out.println(driver.switchTo().alert().getText()+"  is my alert text");
        driver.switchTo().alert().sendKeys("Spiderman");
        //driver.switchTo().alert().accept();
        driver.switchTo().alert().dismiss();

       // driver.switchTo().parentFrame();

        driver.switchTo().defaultContent();
        driver.findElement(By.cssSelector("a[title=\"Change Orientation\"]")).click();

    }
}
