import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class explicitWait {
    public static void main(String[] args) throws Exception{
        ChromeDriver driver=new ChromeDriver();

        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement input=driver.findElement(By.xpath("//input[@placeholder='Search']"));
        input.sendKeys("music");

        driver.findElement(By.xpath("//button[@title='Search']")).click();

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement click=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@id='dismissible'])[2]")));
        click.click();

        WebElement share=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@aria-label='Share'])[2]")));
        Actions actions=new Actions(driver);
        actions.moveToElement(share);
        share.click();

//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='scrollable']")));

        WebElement copy=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@aria-label='Copy']")));
        copy.click();
    }
}
