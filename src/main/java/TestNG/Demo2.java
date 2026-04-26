package TestNG;

import org.testng.annotations.Test;

public class Demo2 {

    @Test(groups={"smoke"})
    public void login(){
        System.out.println("Login page");
    }

    @Test(groups = {"regression"})
    public void dashboard(){
        System.out.println("Dashboard after successful login");
    }

    @Test(groups = {"regression"})
    public void profile(){
        System.out.println("Profile Details");
    }

    @Test(groups={"smoke"})
    public void logout(){
        System.out.println("Logged out");
    }
}
