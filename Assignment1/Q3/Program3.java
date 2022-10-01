/* Q3) Write a java program to show following menu to the user:
*******Menu*******
1. Calculate Area of Circle
2. Calculate Circumference of a Circle
3. Exit.
Choose an option (1-3): 
Take radius as user input.
Hint: Use Switch statement to act on the menu. Also area and circumference methods should be static */


package Assignment1.Q3;
import java.util.Scanner;
public class Program3 {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        double pi=3.14;
        double radius;
        System.out.println("****** Menu *******") ;
        System.out.println("1. Calculate Area of Circle");
        System.out.println("2. Calculate Circumference of a Circle");
        System.out.println("3. Exit.");
        int i=sc.nextInt();
        switch(i){

            case 1: {
                System.out.print("Enter the Radius :");
                radius= sc.nextDouble();
                System.out.println("Area of Circle" +(pi*radius*radius));
            }
            case 2:{
                System.out.print("Enter the Radius :");
                radius= sc.nextDouble();
                System.out.println("Circumference of Circle" +(2*pi*radius));

            }
            case 3:{
                System.out.println("Exit");
            }

        }
        sc.close();
   }
}
