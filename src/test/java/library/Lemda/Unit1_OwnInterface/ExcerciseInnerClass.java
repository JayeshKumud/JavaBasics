package library.Lemda.Unit1_OwnInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * ExcerciseInnerClass Created by x000814 on 28-Aug-18
 */
public class ExcerciseInnerClass {

    public static void main(String[] args) {

        List<Person> personList = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        // Step1 - Option1 - sort list by last name
        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.GetLastname().compareTo(o2.GetLastname());
            }
        });

        // Step1 - Option2 - Sort list by last name
        personList.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.GetLastname().compareTo(o2.GetLastname());
            }
        });

        // Step2 create method that print all element in list
        System.out.println("--------------- Sorted with Last Name------------------------ ");
        PrintAll(personList);

        // Step3 create method that print all element that have last name start with C
        System.out.println("--------------- Element start with C------------------------ ");
        PrintListItem(personList, new iCondition() {

            @Override
            public boolean FillCondition(Person person) {
                return (person.GetLastname().toLowerCase().startsWith("c"));
            }
        });
    }

    private static void PrintListItem(List<Person> personList, iCondition iCondition) {
        for (Person person : personList){
            if (iCondition.FillCondition(person)){
                System.out.println(person.toString());
            }
        }
    }

    private static void PrintAll(List<Person> personList) {
        for (Person person : personList){
            System.out.println(person.toString());
        }
    }
}
