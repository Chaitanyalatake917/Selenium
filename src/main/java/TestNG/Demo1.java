package TestNG;
import org.testng.annotations.Test;

public class Demo1 {

    @Test(enabled = true)//used to enable/disable test case
    public void a(){
        System.out.println("Method a");
    }

    @Test(timeOut = 2500,priority = 2)//used to set timeout
    public void b()throws Exception{
        Thread.sleep(2000);
        System.out.println("Method b");
    }

    @Test(invocationCount = 2,priority = 1)//used if required to run more than one time
    public void c(){
        System.out.println("Method c");
    }
}
