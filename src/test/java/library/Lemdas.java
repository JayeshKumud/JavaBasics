package library;

/**
 * Created by greycat on 18.03.14.
 */
public class Lemdas {

    public void Greet(Greeting greeting){
        greeting.Perform();
    }

    public static void main(String[] args){


        // Conventional way to implement interface and call the implemented method.
        Lemdas lemdas = new Lemdas();
        Greeting implementGreeting = new ImplementGreeting();


        // Inner class way to implement interface method.
        Greeting innerClass = new Greeting() {
            @Override
            public void Perform() {
                System.out.println("Hello - Inner Class");
            }
        };

        // How does lemdas helps - Don't need to create "ImplementGreeting" and implement Perform() method.
        Greeting myLemdaFunction = () -> System.out.println("Hello - Lemda");

        lemdas.Greet(implementGreeting);
        lemdas.Greet(innerClass);
        lemdas.Greet(myLemdaFunction);

        // Lemda implementation in more precise way
        lemdas.Greet(() -> System.out.println("Hello - Lemda"));
    }

}
