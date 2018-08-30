package library.Lemda;

/**
 * Created by greycat on 18.03.14.
 */
public class LemdaGreetingExample {

    public void Greet(iGreeting iGreeting){
        iGreeting.Perform();
    }

    public static void main(String[] args){


        // Conventional way to implement interface and call the implemented method.
        LemdaGreetingExample lemdaGreetingExample = new LemdaGreetingExample();
        iGreeting implementIGreeting = new ImplementIGreeting();


        // Inner class way to implement interface method.
        iGreeting innerClass = new iGreeting() {
            @Override
            public void Perform() {
                System.out.println("Hello - Inner Class");
            }
        };

        // How does lemdaGreetingExample helps - Don't need to create "ImplementIGreeting" and implement Perform() method.
        iGreeting myLemdaFunction = () -> System.out.println("Hello - Lemda");

        lemdaGreetingExample.Greet(implementIGreeting);
        lemdaGreetingExample.Greet(innerClass);
        lemdaGreetingExample.Greet(myLemdaFunction);

        // Lemda implementation in more precise way
        lemdaGreetingExample.Greet(() -> System.out.println("Hello - Lemda"));
    }

}
