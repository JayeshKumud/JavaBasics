package library;

import java.util.*;

/**
 * Created by greycat on 18.03.14.
 */
public class Collection {
    public static int[] array(){
        int[] arr = {1,2,3,4,5};
        for (int num: arr) {
            System.out.println(num);
        }
        return arr;
    }

    public static void ArrayListConcept(){

        ArrayList<String> arrLiStr = new ArrayList<String>();
        arrLiStr.add("Test2");
        arrLiStr.add("Test2");
        arrLiStr.add("Test3");
        System.out.println("------------------ArrayList String------------------------------");
        System.out.println(arrLiStr.size());
        System.out.println(arrLiStr.get(1));
        for(String val : arrLiStr) {
            System.out.println(val);
        }

        Employee emp1 = new Employee("Test1", 11, "QA1");
        Employee emp2 = new Employee("Test2", 12, "QA2");
        Employee emp3 = new Employee("Test3", 13, "QA3");
        ArrayList<Employee> arrLiEmp = new ArrayList<Employee>();

        arrLiEmp.add(emp1);
        arrLiEmp.add(emp2);
        arrLiEmp.add(emp3);

        System.out.println("------------------ArrayList Employee------------------------------");
        System.out.println(arrLiEmp.size());
        for(Employee emp : arrLiEmp){
            System.out.println("Employee Name : " + emp.Name);
            System.out.println("Employee Age : " + emp.Age);
            System.out.println("Employee Department : " + emp.Department);
        }

    }

    public static void LinkListConcept() {
        LinkedList<String> linkedListStr = new LinkedList<String>();
        linkedListStr.add("Test1");
        linkedListStr.add("Test2");
        linkedListStr.add("Test3");
        System.out.println("Containt of LinkedList : " + linkedListStr);
        linkedListStr.addFirst("First using addFirst");
        linkedListStr.addLast("Last");
        System.out.println("First value : " + linkedListStr.get(0));
        linkedListStr.set(0, "Add at possition 0 using Set");
        System.out.println("Get 0 possition value : " + linkedListStr.get(0));

        for (String linkListValue : linkedListStr) {
            System.out.println("Value of linklist using foreach : " + linkListValue);
        }

        while (linkedListStr.iterator().hasNext()) {
            System.out.println("Value of linklist using Iterator : " + linkedListStr.iterator().next());

        }
    }

    public static void HashMap(){
        // Is class implement CollectionExample.
        // It Containts only unique element.
        // Store keys and values.
        // HashMap allow one null key and multiple null value.
        // Hashtable does not allow null keys or values.
        // It mantain no order.
        // HashMap Is non - syncronize and can be accessed by multiple thread
        // while HashTable - syncronize - access by one thread at a time

        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(1, "Test1");
        hashMap.put(2, "Test2");
        hashMap.put(3, "Test3");

        System.out.println(hashMap.get(0));
        for(Map.Entry Value : hashMap.entrySet()){System.out.println(Value.getKey() + " : " + Value.getValue());}


        HashMap<Integer, Employee> employeeHashMap = new HashMap <Integer, Employee>();
        Employee emp1 = new Employee("Test1", 11, "Admin1");
        Employee emp2 = new Employee("Test2", 12, "Admin2");
        Employee emp3 = new Employee("Test3", 13, "Admin3");

        employeeHashMap.put(1, emp1);
        employeeHashMap.put(2, emp2);
        employeeHashMap.put(3, emp3);

        for (Map.Entry<Integer, Employee> employee : employeeHashMap.entrySet()){
            System.out.println(employee.getKey() + " : " + employee.getValue().Name +
                    " : " + employee.getValue().Age + " : " + employee.getValue().Department);
        }

    }

    public static void HashTableConcept(){

        Hashtable hashtable1 = new Hashtable();
        hashtable1.put(1, "Test1");
        hashtable1.put(2, "Test2");
        hashtable1.put(3, "Test3");

        Hashtable hashtable2 = new Hashtable();
        hashtable2 = (Hashtable) hashtable1.clone();

        System.out.println("Values of Hashtable1 : " + hashtable1);
        System.out.println("Values of Hashtable2 : " + hashtable2);
        System.out.println("Hashtable1 contain value : " + hashtable1.containsValue("Test1"));

        // Print all the value using enumeration - element
        Enumeration HTValue = hashtable1.elements();
        while (HTValue.hasMoreElements()){System.out.println(HTValue.nextElement());}

        // Print all the value using entry set
        System.out.println(hashtable1.entrySet());
    }

    public static void HashMap_Sets(){

        // Java collection framework - Set
        // Interface Set - No duplicate allowed
        // Implement HashSet, TreeSet, LinkHashSet


        // TreeSet - Iterator list is Ordered by comparator (CompairTo)
        Set<String> treeSet = new TreeSet<String>();
        treeSet.add("Test1");
        treeSet.add("Test2");
        treeSet.add("Test3");

        for (String treeSetVal : treeSet){System.out.println(treeSetVal);}

        // HashSet has No pridicable order
        Set<String> hashSet = new HashSet<String>();
        hashSet.add("Test1");
        hashSet.add("Test2");
        hashSet.add("Test3");

        for (String hashSetVal : hashSet){System.out.println(hashSetVal);}

        // LinkedHashSet : List in the order they added
        Set<String> linkedHashSet = new LinkedHashSet<String>();
        linkedHashSet.add("Test2");
        linkedHashSet.add("Test1");
        linkedHashSet.add("Test3");

        for (String linkedHashSetVal : linkedHashSet){System.out.println(linkedHashSetVal);}

        Employee emp1 = new Employee("Test1", 11, "QA1");
        Employee emp2 = new Employee("Test2", 12, "QA2");
        Employee emp3 = new Employee("Test3", 13, "QA3");

        Set<Employee> linkedHashSetEmp = new LinkedHashSet<Employee>();
        linkedHashSetEmp.add(emp1);
        linkedHashSetEmp.add(emp2);
        linkedHashSetEmp.add(emp3);

        for (Employee linkedHashSetVal : linkedHashSetEmp){
            System.out.println(linkedHashSetVal.Name);
            System.out.println(linkedHashSetVal.Age);
            System.out.println(linkedHashSetVal.Department);
        }

        while (linkedHashSetEmp.iterator().hasNext()){
            System.out.println(linkedHashSetEmp.iterator().next().Name);
            System.out.println(linkedHashSetEmp.iterator().next().Age);
            System.out.println(linkedHashSetEmp.iterator().next().Department);
        }
    }
}
