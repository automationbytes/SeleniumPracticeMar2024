package Day10;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Screenshot_Eg {
    public static void main(String[] args) throws IOException {



        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //temp
        FileUtils.copyFile(screenshot,new File("C:/Pytest/fb.jpg"));

    }
}
