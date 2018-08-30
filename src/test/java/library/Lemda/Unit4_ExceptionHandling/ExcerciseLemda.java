package library.Lemda.Unit4_ExceptionHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

/**
 * ExcerciseLemda Created by x000814 on 29-Aug-18
 */
public class ExcerciseLemda {

    public static void main(String[] args) {

        int[] Numbers = {1, 2, 3, 4, 5};
        int iKey = 2;

        PerfromConditionally_1(Numbers, iKey, (number, key) -> System.out.println(number + key));

        PerformConditionally_2(Numbers, iKey, (number, key) -> {
            return number + key;
        });

    }

    private static void PerfromConditionally_3(Integer[] numbers, BiConsumer<Integer[], Integer> biConsumer) {

    }

    private static void PerfromConditionally_1(int[] numbers, int iKey, BiConsumer<Integer, Integer> biConsumer) {
        for (int number : numbers) {
            biConsumer.accept(number, iKey);
        }
    }

    private static void PerformConditionally_2(int[] numbers, int iKey, BiFunction<Integer, Integer, Integer> biFunction) {
        for (Integer number : numbers) {
            System.out.println(biFunction.apply(number, iKey));
        }
    }
}
