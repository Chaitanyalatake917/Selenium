import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;

public class implicitWait {
    public static void main(String[] args) throws Exception{
        ChromeDriver driver= new ChromeDriver();
        driver.get("https://www.actitime.com/free-online-trial");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.findElement(By.id("FirstName")).sendKeys("Chaitanya");
        driver.findElement(By.id("LastName")).sendKeys("Latake");
        driver.findElement(By.id("Email")).sendKeys("chaitanyalatake123@gmail.com");
        driver.findElement(By.id("Company")).sendKeys("BFL");


        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
        WebElement accept=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Accept')]")));
        accept.click();

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//button[contains(text(),'Accept')]")));

        WebElement confirm = wait.until(ExpectedConditions.elementToBeClickable(By.id("confirm-button")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", confirm);
    }
}
