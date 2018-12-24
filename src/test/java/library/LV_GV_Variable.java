package library;

/**
 * Created by greycat on 18.03.14.
 */
public class LV_GV_Variable {

    // Global variable - Class variable - accessible across whole class and assembly (as per access modifier)
    String name = "Test1";
    int age = 10;
    static int year = 2015;

    public static void main(String [] args){

        // Local variable
        String department = "QA";
        System.out.println("Local variable : " + department);

        // Non static Global variable can be access from Class reference/object
        System.out.println("Global variable 'name' : " + new LV_GV_Variable().name);
        System.out.println("Global variable 'age' : " + new LV_GV_Variable().age);

        // this keyword can not be used for static main method
        //System.out.println("Global variable 'name' : " + this.name);

        // Static global variable can be access by Class
        System.out.println("Global variable static variable 'year' : " + LV_GV_Variable.year);

        // access static method via class reference
        new LV_GV_Variable().sub();

        // access global non static variable then it cant be access by class reference.
        // new LV_GV_Variable().age;
    }

    public int sum(){
        // local variable accessible in method only
        int i = 1;
        int j = 1;
        int k = 3;
        return i + j + k;
    }

    public static int sub(){
        // local variable accessible in method only
        int i = 1;
        int j = 1;
        int k = 3;
        return i - j - k;
    }
}
