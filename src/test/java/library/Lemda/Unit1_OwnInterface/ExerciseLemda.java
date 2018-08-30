package library.Lemda.Unit1_OwnInterface;

import java.util.Arrays;
import java.util.List;

/**
 * ExerciseLemda Created by x000814 on 28-Aug-18
 */
public class ExerciseLemda {

    public static void main(String[] args) {

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
        PrintAll(personList);

        // Step3 create method that print all element that have last name start with C
        System.out.println("--------------- Element start with C------------------------ ");
        PrintConditionally(personList, (Person p) -> p.GetLastname().toLowerCase().startsWith("c"));
    }

    private static void PrintConditionally(List<Person> personList, iCondition condition) {
        for (Person person : personList){
            if(condition.FillCondition(person)){
                System.out.println(person.toString());
            }
        }
    }

    private static void PrintAll(List<Person> personList) {
        for(Person person : personList){
            System.out.println(person.toString());
        }
    }
}
