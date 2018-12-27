package library.TestNG;

import library.managers.FileReaderManager;
import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * dataProvider Created by x000814 on 20-Sep-18
 */
public class dataProvider {


    @BeforeSuite
    public static void BeforeSuite () { System.out.println("Before Suite");}
    @AfterSuite
    public static void AfterSuite(){System.out.println("After Suite");}
    @BeforeTest
    public static void BeforeTest () { System.out.println("Before Test");}
    @AfterTest
    public static void AfterTest(){System.out.println("After Test");}
    @BeforeMethod
    public static void BeforeMethod () { System.out.println("Before Method");}
    @AfterMethod
    public static void AfterMethod(){System.out.println("After Method");}
    @BeforeClass
    public static void beforeClass(){
        System.out.println("before Class");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("after Class");
    }


    @DataProvider(name = "EmployeeData_ListOfListOfString")
    public Object[][] GetEmployeeData_ListOfListOfString(){
        List<List<String>> tempData = FileReaderManager.getInstance().getCsvDataReader().getEmployeeData_ListOfListOfString();
        Object[][] data = tempData.stream().map(u  ->  u.stream().toArray()).toArray(Object[][]::new);
        return data;
    }

    @Test(dataProvider="EmployeeData_ListOfListOfString")
    public void Test_01(String firstName,String lastName, String age, String emailAddress, String  address, String phoneNumber){
        System.out.println("firstName is : " + firstName);
        System.out.println("lastName is : " + lastName);
        System.out.println("age is : " + age);
        System.out.println("emailAddress is : " + emailAddress);
        System.out.println("address is : " + address);
        System.out.println("phoneNumber is : " + phoneNumber);
    }




    @DataProvider(name = "EmployeeData_ArrayListOfArrayOfObject")
    public Object[][] GetEmployeeData_ArrayListOfArrayOfObject(){
        ArrayList<Object[]> tempData = FileReaderManager.getInstance().getCsvDataReader().getEmployeeData_ArrayListOfArrayOfObject();
        Object[][] data = tempData.stream().map(o -> Arrays.stream(o).toArray()).toArray(Object[][]::new);
        return data;
    }

    @Test(dataProvider="EmployeeData_ArrayListOfArrayOfObject")
    public void Test_02(String firstName,String lastName, String age, String emailAddress, String  address, String phoneNumber){
        System.out.println("firstName is : " + firstName);
        System.out.println("lastName is : " + lastName);
        System.out.println("age is : " + age);
        System.out.println("emailAddress is : " + emailAddress);
        System.out.println("address is : " + address);
        System.out.println("phoneNumber is : " + phoneNumber);
    }


    @Test(dataProvider="EmployeeData_ArrayListOfArrayOfObject")
    public void Test_05(Object[][] table) {
        System.out.println("firstName is : " + table[0][0]);
        System.out.println("lastName is : " + table[0][0]);
        System.out.println("age is : " + table[0][0]);
        System.out.println("emailAddress is : " + table[0][0]);
        System.out.println("address is : " + table[0][0]);
        System.out.println("phoneNumber is : " + table[0][0]);
    }

    @DataProvider(name = "EmployeeData_FromJsonToArrayListOfArrayOfObject")
    public Object[][] GetEmployeeData_FromJsonToArrayListOfArrayOfObject(){
        ArrayList<Object[]> temp = FileReaderManager.getInstance().getJsonReader().getEmployeeData_FromGson();
        Object[][] objects = temp.stream().map(s -> Arrays.stream(s).toArray()).toArray(Object[][]::new);
        return objects;
    }

    @Test(dataProvider = "EmployeeData_FromJsonToArrayListOfArrayOfObject")
    public void Test_03(Object firstName,Object lastName, Object age, Object emailAddress, Object  address, Object phoneNumber) {
        System.out.println("firstName is : " + firstName);
        System.out.println("lastName is : " + lastName);
        System.out.println("age is : " + age);
        System.out.println("emailAddress is : " + emailAddress);
        System.out.println("address is : " + address);
        System.out.println("phoneNumber is : " + phoneNumber);
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
    public void Test_04(String firstName,String lastName){
        System.out.println("firstName is : " + firstName);
        System.out.println("lastName is : " + lastName);
    }

}
