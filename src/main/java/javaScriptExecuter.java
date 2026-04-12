import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScriptExecuter {
    public static void main(String[] args) throws Exception{
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        JavascriptExecutor jse=(JavascriptExecutor) driver;
        Thread.sleep(2000);
        WebElement imdb= driver.findElement(By.xpath("//a[contains(@href,'imdb.com')]"));
        jse.executeScript("arguments[0].scrollIntoView(true);",imdb);
        imdb.click();
        driver.get("https://www.facebook.com/");
        jse.executeScript("document.getElementsByName('email')[0].value='Chaitanyalatake917@gmail.com'");
    }
}
