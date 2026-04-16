import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class keyBoardEventHandling {
    public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.instagram.com/");
        driver.manage().window().maximize();

        WebElement mail=driver.findElement(By.name("email"));
        mail.sendKeys("Chaitanyalatake917@gmail.com");

        WebElement pass=driver.findElement(By.name("pass"));

        Actions actions=new Actions(driver);
        actions.moveToElement(mail).keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c")
                .keyUp(Keys.CONTROL).moveToElement(pass).click()
                .keyDown(Keys.CONTROL).sendKeys("v")
                .keyUp(Keys.CONTROL).build().perform();
    }
}
