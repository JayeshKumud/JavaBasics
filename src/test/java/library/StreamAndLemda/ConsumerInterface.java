package library.StreamAndLemda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class ConsumerInterface {

    public static void main(String[] args){

        List<Integer> integerList = Arrays.asList(1,2,3,4,5);

        // functional programing, calling method
        integerList.forEach(System.out::println);

        // using lemda operator
        integerList.forEach(i -> System.out.println(i));

        // using stream
        Object[] a = integerList.stream().map(i -> Arrays.asList(i)).toArray();
        Integer k = integerList.stream().map(i -> i+1).reduce(0, (i , j) -> i+j);
        Arrays.asList(integerList.stream().filter(i -> i%5 == 0));
    }






}
