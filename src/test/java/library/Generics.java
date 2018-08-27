package library;

/**
 * Created by greycat on 18.03.14.
 */
public class Generics {

    public static <T> void GenWithoutReturnType(T[] arrValue) {
        for (T sValue : arrValue) System.out.println("Given array values are  : " + sValue);
    }

    public static <T extends Comparable<T>> T GenWithImplementation(T a, T b, T c){
        T x = a;
        if (b.compareTo(x) > 0 ) x = b;
        if (c.compareTo(x) > 0 ) x = c;
        return x;
    }
}
