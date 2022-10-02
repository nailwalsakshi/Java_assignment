/* Q4) Create a two dimensional array of integers and display:

sum of all elements of each column
sum of all elements of each row
 */
package Assignment1.Q4;
import java.util.Scanner;
public class Program4 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i <= arr.length-1; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();  
            }
        }
        for (int i = 0; i <= arr.length-1; i++) {
            int sum = 0;
            for (int j = 0; j <= arr.length-1 ; j++) {
                sum = sum + arr[i][j];

            }
            System.out.println("Sum of Rows :" + sum);
        }
        for (int j = 0; j <= arr.length-1 ; j++) {
            int sum = 0;
            for (int i = 0; i <= arr.length-1; i++) {
                sum = sum + arr[i][j];
            }
            System.out.println("Sum of Columns : " + sum);
            sc.close();
        }
    }
}
