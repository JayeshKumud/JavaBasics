package library.SuperAndThisKeywords;

public class Child extends Parent{
    public Child(String value){
        super(value);
        System.out.println("Child Contractor : " + value);
    }
}
