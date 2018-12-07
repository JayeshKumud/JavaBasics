package library.TestNG;

import org.testng.annotations.*;

/**
 * dataProvider Created by x000814 on 20-Sep-18
 */
public class dataProvider {


    @BeforeClass
    public static void beforeClass(){
        System.out.println("beforeClass method");
    }

    @DataProvider(name = "TestData")
    public Object[][] GetData(){
        Object[][] objects = new Object[2][2];

        objects[0][0] = "UserName1";
        objects[0][1] = "Password1";

        objects[1][0] = "UserName2";
        objects[1][1] = "Password2";

        return objects;
    }

    @Test(dataProvider="TestData")
    public void Test_01(String username, String password){
        System.out.println("UserName is : " + username);
        System.out.println("Password is : " + password);
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("afterClass method");
    }
}
