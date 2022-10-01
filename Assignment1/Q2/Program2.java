// Q2) Write a program to read user input until user writes XDONE and then show the entered text by the user on commandline

package Assignment1.Q2;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = " ";
        String inp = " ";
        do {
            inp = sc.nextLine();
            if(inp.equals("XDONE")){
                break;
            }
            result = result + " " + inp;
        } while (true);
        System.out.println(result);
        sc.close();
    }
}
