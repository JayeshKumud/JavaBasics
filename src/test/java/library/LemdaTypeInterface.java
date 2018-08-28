package library;

/**
 * LemdaTypeInterface Created by x000814 on 28-Aug-18
 */
public class LemdaTypeInterface {

    public static void main(String[] args){

        // Option 1
        LemdaStringLength myLemda1 = (s) -> s.length();
        System.out.println(myLemda1.GetLength("Hello World"));

        // Option 2
        LemdaStringLength myLemda2 = s -> s.length();
        System.out.println(myLemda2.GetLength("Hello World"));

        // Passing Lemda (Implementation) direct
        PrintLemda(s -> s.length());
    }

    public static void PrintLemda(LemdaStringLength lemdaStringLength){
        System.out.println(lemdaStringLength.GetLength("Hello World"));
    }
}

interface LemdaStringLength{
    int GetLength(String s);
}
