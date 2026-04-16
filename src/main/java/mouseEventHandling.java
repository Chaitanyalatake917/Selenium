import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseEventHandling {
    public static void main(String[] args) throws Exception{
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        Actions actions=new Actions(driver);
        WebElement ele= driver.findElement(By.linkText("Instagram"));
        Thread.sleep(500);
        actions.moveByOffset(50,50).contextClick().moveToElement(ele).click().build().perform();
        WebElement email=driver.findElement(By.name("email"));
        email.sendKeys("chaitanyalatake917@gmail.com");
        actions.doubleClick(email).build().perform();

        driver.get("https://emicalculator.net/");
        driver.manage().window().maximize();
        WebElement slider=driver.findElement(By.id("loanamountslider"));
        actions.dragAndDropBy(slider,50,0).build().perform();
    }
}
