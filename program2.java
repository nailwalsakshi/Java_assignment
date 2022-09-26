import java.util.Scanner;
public class program2 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String str;
        String re=" ";
        do{
            str =sc.nextLine();
            re=re+" "+str;
        }while(!str.equals("XDONE"));
        System.out.println(re);
        sc.close();
    }
}


