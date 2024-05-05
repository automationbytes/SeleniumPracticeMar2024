package Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.LinkedHashMap;
import java.util.List;

public class WebTable2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://admin-demo.nopcommerce.com/Admin/Product/List");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        Select pageSize = new Select(driver.findElement(By.name("products-grid_length")));
        pageSize.selectByVisibleText("100");

        Thread.sleep(5000);
        List<WebElement> row = driver.findElements(By.xpath("//table[@id=\"products-grid\"]//tr"));
        int rowsize = row.size();
        System.out.println(rowsize);

        List<WebElement> col = driver.findElements(By.xpath("//table[@id=\"products-grid\"]//th/div"));
        int colsize = col.size();
        System.out.println(colsize);


        LinkedHashMap map = new LinkedHashMap();
        for (int j = 1; j <= colsize; j++) {
            String headerName = driver.findElement(By.xpath("//table[@id=\"products-grid\"]//th["+j+"]/div")).getAttribute("textContent");
            System.out.println(headerName);
            map.put(headerName,j);

        }
        System.out.println(map);


        for (int i = 1; i < rowsize ; i++) {
            String ProductName = driver.findElement(By.xpath("//table[@id=\"products-grid\"]//tr["+i+"]/td["+map.get("Product name")+"]")).getText();
            System.out.println(ProductName);
            if(ProductName.equals("Nikon D5500 DSLR")){
                driver.findElement(By.xpath("//table[@id=\"products-grid\"]//tr["+i+"]/td["+map.get("Edit")+"]/a")).click();
                break;
            }
        }



    }
}
