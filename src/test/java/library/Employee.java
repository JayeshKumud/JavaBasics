package library;

/**
 * Created by greycat on 18.03.14.
 */
public class Employee implements Comparable<Employee> {

    String Name;
    int Age;
    String Department;

    Employee(String Name, int Age, String Department){
        this.Name = Name;
        this.Age = Age;
        this.Department = Department;
    }

    public int compareTo(Employee Emp) {
        return Name.compareTo(Emp.Name);
    }
}
