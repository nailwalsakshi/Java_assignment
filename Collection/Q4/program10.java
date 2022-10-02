/* 4) Create class Employee with attributes name,age,designation and use instances of these class as keys in a Map and their salary as value */

package Collection.Q4;

import java.util.*;

class Employee {
    int age;
    String name;
    String designation;

    public Employee(int age, String name, String designation) {
        this.age = age;
        this.name = name;
        this.designation = designation;
    }

    public String toString() {
        return "Age is : " + age + " , " + "Name is : " + name + " , " + "Designation is : " + designation + " , ";
    }

}

public class program10 {

    public static void main(String args[]) {
        Employee e1 = new Employee(22, "Sakshi", "QE");
        Employee e2 = new Employee(24, "Shanaya", "DevOps");
        Employee e3 = new Employee(28, "Swati", "AEM");
        Employee e4 = new Employee(32, "Shivangi", "Data Engineer");

        Map<Employee, Integer> map = new LinkedHashMap<>();

        map.put(e1, 2500);
        map.put(e2, 1500);
        map.put(e3, 3882);
        map.put(e4, 1855);
        for (Employee key : map.keySet()) {
            System.out.println(key + "Salary is : " + map.get(key));
        }
    }
}
