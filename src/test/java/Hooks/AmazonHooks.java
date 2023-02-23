package Hooks;

import io.cucumber.java.*;


public class AmazonHooks {

    @Before("@Smoke")
    public void setUp_app(Scenario sc){
        System.out.println("Launch chrome browser");
        System.out.println(sc.getName());
    }
//    @Before(order = 2)
//    public void setUp_url(){
//        System.out.println("Launch url");
//    }

//    @After(order = 2)
//    public void tearDown_close(Scenario sc){
//        System.out.println("Close the browser");
//        System.out.println(sc.getName());
//    }

    @After("@Smoke")
    public void tearDown_logout(){
        System.out.println("logout from the application");
    }


//    @BeforeStep
//    public void takeScreenshot(){
//        System.out.println("take a screenshot");
//    }
//    @AfterStep
//    public void refreshPage(){
//        System.out.println("Refresh the page");
//    }
}
