import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class eventHandling {
    public static void main(String[] args) throws Exception{
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        Actions actions=new Actions(driver);
        WebElement ele= driver.findElement(By.linkText("Instagram"));
        Thread.sleep(500);
        actions.moveByOffset(50,50).contextClick().moveToElement(ele).click().build().perform();
    }
}
