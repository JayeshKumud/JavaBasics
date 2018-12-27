package library.collection;

import org.testng.collections.Maps;

import java.util.*;

public class CollectionExample {

    public static void main(String[] args) {

        CollectionExample collectionExample = new CollectionExample();
        //collectionExample.ArrayList_Example();

        collectionExample.ListOfMaps();
    }


    public void ArrayList_Example() {

        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        ArrayList<Integer> arrayList3 = new ArrayList<>();

        arrayList1.add(1);
        arrayList1.add(2);

        arrayList2.add(3);
        arrayList2.add(4);

        arrayList3.add(5);
        arrayList3.add(6);

        arrayLists.add(arrayList1);
        arrayLists.add(arrayList2);
        arrayLists.add(arrayList3);
    }

    public void ListOfMaps() {

        // contains only UNIQUE value
        // can have one null key and multiple null value
        // HashMap is non synchronize -->
        // more then one thread can access it --> so its is fast
        // fail fast --> value may be updated (adding or removing)
        // consequently --> concurrent modification exception, may occur
        List<HashMap<String, String>> hashMapList = new ArrayList<>();

        HashMap<String, String> hashMap1 = new HashMap<>();
        hashMap1.put("firstname", "jayesh");
        hashMap1.put("lasttname", "kumud");

        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("firstname", "somesh");
        hashMap2.put("lasttname", "gupta");

        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("firstname", "raghav");
        hashMap3.put("lasttname", "mahajan");

        hashMapList.add(hashMap1);
        hashMapList.add(hashMap2);
        hashMapList.add(hashMap3);

        //System.out.println(hashMapList.forEach(h -> h.f);
//        System.out.println(hashMapList.stream().map(i -> i.entrySet().toArray()).allMatch(o -> Arrays.stream(o).toArray()));
    }

    public void TreeMap_Example(){
        Map<String, String> treeMap = new TreeMap<>();

    }

    public void Hashtable_Example(){
        Hashtable<String, String> hashtable = new Hashtable<>();

    }


    //-----------------------------------------------------------------------------------------------------------------------


    // List allow duplicate value
    public void ListInterface(){

        // Store value based on indexing
        // all the index sub sequent index value gets change when add or remove value element from ArrayList
        List<Integer> arrList = new ArrayList<>();
        Iterator<Integer> arrlistIterator = arrList.iterator();

        // Store value - previous element point to next element
        // removing or adding element does not impact index value of sub sequent element
        List<Integer> arrLnkList = new LinkedList<>();
        Iterator<Integer> arrLnklistIterator = arrLnkList.iterator();

    }

    // Set also store value based on index
    // does not allowed duplicate value, remove duplicate value
    public void SetInterface(){

        // store value based on hashing so does not have any sequence or order while reading value
        Set<Integer> setHashSet = new HashSet<>();

        // return value in sorted order
        Set<Integer> setTreeSet = new TreeSet<>();

    }

    // Map store value based on Key value pair
    public void MapInterface(){

        // non synchronize, allow one null key and multiple null value
        // thread unsafe as it can be access by multiple thread at same time
        // fast as its non synchronize
        Map<Integer, String> mapHashMap = new HashMap<>();

        // return the set of keys
        Set<Integer> setKeys = mapHashMap.keySet();

        // return entry set, all key value pair
        Set<Map.Entry<Integer, String>> entrySetHashMap = mapHashMap.entrySet();

        // Synchronize and does not allow multiple to access it at same time
        // thread safe as cant be access by multiple thread at same time
        // it is slow as its synchronize
        Map<Integer, String> mapHashTable = new Hashtable<>();

        // return the set of keys
        Set<Integer> Keys = mapHashTable.keySet();

        // return entry set, all key value pair
        Set<Map.Entry<Integer, String>> hashTableEntrySet = mapHashTable.entrySet();
    }

    //-----------------------------------------------------------------------------------------------------------------------

}
