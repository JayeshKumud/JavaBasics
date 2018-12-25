package library;

import java.util.ArrayList;
import java.util.Hashtable;

public class ArrayListVsHashTable {

    public static void main(String[] args){

        ArrayList arrayList = new ArrayList();
        arrayList.add("test1");
        arrayList.add(10);
        arrayList.add('A');
        arrayList.add(true);

        System.out.println(arrayList.size());

        for(Object o : arrayList){
            System.out.println(o);
        }

        ArrayList<Integer> arrayList1 = new ArrayList();
        arrayList1.add(10);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Test1");

        Hashtable hashtable = new Hashtable();
        hashtable.put(1, "Test1");
        hashtable.put(2, "Test2");
        System.out.println(hashtable.get(1));
        System.out.println(hashtable.get(2));

        hashtable.put('A', 100);
        hashtable.put('B', 200);
        System.out.println(hashtable.get('A'));
        System.out.println(hashtable.get('B'));

        hashtable.put("Test1", 'A');
        hashtable.put("Test2", 'B');
        System.out.println(hashtable.get("Test1"));
        System.out.println(hashtable.get("Test2"));

        Hashtable<Integer, String> hashtable1 = new Hashtable<>();
        hashtable1.put(1, "Test1");
        hashtable1.put(2, "Test2");
        System.out.println(hashtable1.get(1));
        System.out.println(hashtable1.get(1));

        Hashtable<String, Character> hashtable2 = new Hashtable<>();
        hashtable2.put("Test1", 'A');
        hashtable2.put("Test2", 'B');
        System.out.println(hashtable2.get("Test1"));
        System.out.println(hashtable2.get("Test2"));

        String test = "and";
        test.toCharArray();
        for(Character c : test.toCharArray()){System.out.println(c);}

    }

}
