/* Q5) Create a class named Employee with fields firstname,lastname,age and designation. 
The class should:

have all types of constructors to initialize the object
class should also have setter methods to update a particular field
Override its toString method to display a meaningful message using all these fields. */


package Assignment1.Q5;
public class Employee {

        private String firstname;
        private String lastname;
        private String age;
        private String designation;

        public Employee(String firstname, String lastname, String age, String designation) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.age = age;
            this.designation = designation;
        }

        public String get_firstname() {
            return firstname;
        }

        public void set_firstName(String firstname) {
            this.firstname = firstname;
        }

        public String get_lastname() {
            return lastname;
        }

        public void set_lastname(String lastname) {
            this.lastname = lastname;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String get_designation() {
            return designation;
        }

        public void set_designation(String designation) {
            this.designation = designation;
        }

        public static void main(String[] args) {
            Employee emp = new Employee("Jay", "Yadav", "22", "Quality Engineer");
            String firstname = emp.get_firstname();
            String lastname = emp.get_lastname();
            String age = emp.getAge();
            String designation = emp.get_designation();

            System.out.println("Employee's FirstName: " + firstname);
            System.out.println("Employee's LastName: " + lastname);
            System.out.println("Employee's Age: " + age);
            System.out.println("Employee's Designation: " + designation);
        }

    }

