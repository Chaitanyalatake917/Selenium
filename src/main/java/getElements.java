import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class getElements {
    public static void main(String[] args) throws Exception {
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.navigate().to("https://www.facebook.com/");
        WebElement email=driver.findElement(By.name("email"));
        email.sendKeys("chaitanyalatake917@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("Gg#241071");

        List<WebElement> list=driver.findElements(By.tagName("div"));
        System.out.println("We found no of div elements "+list.size());

        WebElement hyper=driver.findElement(By.linkText("Meta Quest"));       // searches for exact matching occurrence
        hyper.click();

        driver.findElement(By.partialLinkText("Meta")).click();                // it searches for first matching occurrence
        //        driver.quit();
    }
}
