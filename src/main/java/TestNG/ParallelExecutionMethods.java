package TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelExecutionMethods {

    @Test
    public void openGoogle(){
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        System.out.println("Id of current thread"+Thread.currentThread().getId());
        driver.close();
    }

    @Test
    public void openBing(){
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.bing.com/");
        System.out.println("Id of current thread"+Thread.currentThread().getId());
        driver.quit();
    }
}
