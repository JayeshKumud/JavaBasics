package library.Lemda.Unit2_FunctionalInterface;

/**
 * Person Created by x000814 on 28-Aug-18
 */
public class Person {
    private String firstName;
    private String lastName;
    private int age;

    Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String GetFirstname(){
        return firstName;
    }

    public void SetFirstname(String firstName){
        this.firstName = firstName;
    }

    public String GetLastname(){
        return lastName;
    }

    public void SetLastname(String lastName){
        this.lastName = lastName;
    }

    public int getAge(){
        return age;
    }

    public void SetAge(int age){
        this.age = age;
    }

    @Override
    public String toString(){
        return "Person 'FirstName : '" + firstName + " 'LastName' : " +  lastName + " 'Age' : " + age;
    }
}
