//Q1) Write a class with FirstName, LastName & age field. Print Firstname, LastName & age using static block, static method & static variable respectively.

package Assignment1.Q1;

public class Program1 {
    static String FirstName = "Sakshi";
    static String LastName = "Nailwal";
    static int age = 22;

    
    static{
        System.out.println("Printing using static block");
        System.out.println("First Name : "+ FirstName);
        System.out.println("Last Name : " + LastName);
        System.out.println("Age : " + age);

        System.out.println("----------xxxxx-------------");
    }

    static void printusingStaticMethod(){

        System.out.println("Printing using static method");
        System.out.println("First Name : " + FirstName);
        System.out.println("Last Name : " + LastName);
        System.out.println("Age : " + age);
    }

    public static void main(String[] args) {

        System.out.println("Inside Main");
        System.out.println();
        Program1.printusingStaticMethod();
    }
}