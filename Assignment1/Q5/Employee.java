/* Q5) Create a class named Employee with fields firstname,lastname,age and designation. 
The class should:
have constructors to initialize the object
class should also have setter methods to update a particular field */

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

        

        public String getfirstname() {
            return firstname;
        }
        public void setfirstName(String firstname) {
            this.firstname = firstname;
        }
        public String getlastname() {
            return lastname;
        }
        public void setlastname(String lastname) {
            this.lastname = lastname;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getdesignation() {
            return designation;
        }

        public void setdesignation(String designation) {
            this.designation = designation;
        }
    

    public static void main(String[] args) {
        Employee Emp = new Employee("Sakshi", "Nailwal", "22", "Quality Engineer");
        String firstname = Emp.getfirstname();
        String lastname = Emp.getlastname();
        String age = Emp.getAge();
        String designation = Emp.getdesignation();

        System.out.println("Employee's FirstName: " + firstname);
        System.out.println("Employee's LastName: " + lastname);
        System.out.println("Employee's Age: " + age);
        System.out.println("Employee's Designation: " + designation);
    }

}


    

