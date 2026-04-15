import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class windowControl {
    public static void main(String[] args) throws Exception{
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/browser-windows.php");
        driver.manage().window().maximize();
        Thread.sleep(500);
        String adds=driver.getWindowHandle(); //used to find address of current window

        driver.findElement(By.xpath("//button[contains(text(),'New Tab')]")).click();
        Thread.sleep(300);

        driver.findElement(By.xpath("//button[contains(text(),'New Window')]")).click();
        Thread.sleep(300);

        driver.findElement(By.xpath("//button[contains(text(),'New Window Message')]")).click();
        Thread.sleep(300);

        Set<String> add=driver.getWindowHandles();
        Iterator it=add.iterator();
        while(it.hasNext()){
            String currentAdd=it.next().toString();
            driver.switchTo().window(currentAdd);
            System.out.println("Current Window Address"+currentAdd);
            System.out.println(driver.findElement(By.xpath("(//h1)[2]")).getText());
        }
        driver.switchTo().window(adds);
        System.out.println(driver.findElement(By.xpath("(//h1)[2]")).getText());
        driver.quit();
    }
}
