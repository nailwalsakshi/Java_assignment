/* 2) Given the following class
Employee class{ Double Age; Double Salary; String Name}
Write a program to sort Employee objects based on salary using Comparator. 
*/

package Collection.Q2;
class Employee {

    private String name;
    private double age;
    private double salary;

    public Employee(String name, double age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}

 
    

