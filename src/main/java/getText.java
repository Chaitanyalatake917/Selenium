import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText {
    public static void main(String[] args) throws Exception{
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        Thread.sleep(200);
        WebElement element= driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_avod_desktop_topnav']"));
        System.out.println(element.getText());
        System.out.println(element.getAttribute("data-csa-c-id"));
    }
}
