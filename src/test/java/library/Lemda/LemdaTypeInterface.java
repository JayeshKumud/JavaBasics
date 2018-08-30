package library.Lemda;

/**
 * LemdaTypeInterface Created by x000814 on 28-Aug-18
 */
public class LemdaTypeInterface {

    public static void main(String[] args){

        // Inner class options
        iLemdaStringLength myInnerClass = new iLemdaStringLength() {
            @Override
            public int GetLength(String s) {
                return s.length();
            }
        };
        System.out.println(myInnerClass.GetLength("Hello World"));


        // Option 1
        iLemdaStringLength myLemda1 = (s) -> s.length();
        System.out.println(myLemda1.GetLength("Hello World"));


        // Option 2
        iLemdaStringLength myLemda2 = s -> s.length();
        System.out.println(myLemda2.GetLength("Hello World"));


        // Passing Lemda (Implementation) direct
        PrintLemda(s -> s.length());
    }

    public static void PrintLemda(iLemdaStringLength iLemdaStringLength){
        System.out.println(iLemdaStringLength.GetLength("Hello World"));
    }
}

