package Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Select_Dropdown {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://admin-demo.nopcommerce.com/Admin/Order/List");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        Select countrydropdown = new Select(driver.findElement(By.id("BillingCountryId")));
        /*
        selectbyvalue
        selectbyindex
        selectbyvisibletext
         */

        //countrydropdown.selectByValue("7");
        //countrydropdown.selectByIndex(14);
        countrydropdown.selectByVisibleText("India");

//        for (WebElement c : countrydropdown.getOptions()){
//            System.out.println(c.getText()+ "   "+c.getAttribute("value"));
//        }

        List<WebElement> abc = countrydropdown.getOptions();
        for (int i =0; i<abc.size();i++){
            System.out.println(abc.get(i).getText()+"  "+abc.get(i).getAttribute("value")+"  "+i);
        }

    }
}
