package library.Lemda.Unit3_FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * ExerciseLemda Created by x000814 on 29-Aug-18
 */
public class ExerciseLemda {

    public static void main(String[] args){

        List<Person> personList = Arrays.asList(
                        new Person("Charles", "Dickens", 60),
                        new Person("Lewis", "Carroll", 42),
                        new Person("Thomas", "Carlyle", 51),
                        new Person("Charlotte", "Bronte", 45),
                        new Person("Matthew", "Arnold", 39)
                );

        // Step1 sort list by last name
        personList.sort((Person p1, Person p2) -> p1.GetLastname().compareTo(p2.GetLastname()));

        // Step2 create method that print all element in list
        System.out.println("--------------- Sorted with Last Name------------------------ ");
        PerformConditionally(personList, (p) -> true, (p) -> System.out.println(p.toString()));

        // Step3 create method that print all element that have last name start with C
        System.out.println("--------------- Element start with C------------------------ ");
        PerformConditionally(personList, person -> person.GetLastname().toLowerCase().startsWith("c")
                , person -> System.out.println(person.toString()));

    }

    private static void PerformConditionally(List<Person> personList, Predicate <Person> condition, Consumer<Person> consumer) {
        for (Person person : personList){
            if (condition.test(person)){
                consumer.accept(person);
            }
        }
    }
}
