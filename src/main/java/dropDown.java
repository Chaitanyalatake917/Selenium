import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {
    public static void main(String[] args) throws Exception{
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu//");
        driver.manage().window().maximize();
        Thread.sleep(200);
        Select selectCountry=new Select(driver.findElement(By.xpath("//select")));
        selectCountry.selectByValue("CHE");
        Thread.sleep(1000);
        selectCountry.selectByIndex(14);
        Thread.sleep(1000);
        selectCountry.selectByVisibleText("India");

    }
}
