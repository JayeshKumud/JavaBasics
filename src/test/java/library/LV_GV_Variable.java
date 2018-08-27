package library;

/**
 * Created by greycat on 18.03.14.
 */
public class LV_GV_Variable {

    // Global variable -- Class variable
    String name = "Test1";
    int age = 10;
    static int year = 2015;

    public static void Main(String [] args){

        // Local variable
        String department = "QA";
        System.out.println("Local variable : " + department);

        // Non static Global variable can be access from Class reference
        System.out.println("Global variable 'name' : " + new LV_GV_Variable().name);
        System.out.println("Global variable 'age' : " + new LV_GV_Variable().age);

        // Static global variable can be access by Class
        System.out.println("Global variable static variable 'year' : " + LV_GV_Variable.year);
    }

    public int sum(){
        int i = 1;
        int j = 1;
        int k = 3;
        return i + j + k;
    }
}
