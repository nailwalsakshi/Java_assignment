//Demonstrate the use of private methods in interfaces


package Java9and17.Q1;

interface PrivateMethod{
    private static String reverseString(String str){
        return new StringBuilder(str).reverse().toString();
    }
    static String toUpperCase(String str){
        String upperStr = str.toUpperCase();
        return reverseString(upperStr);
    }

    static String toLowerCase(String str){
        String lowerStr = str.toLowerCase();
        return reverseString(lowerStr);
    }
}

public class Program1 {
    public static void main(String[] args) {
        System.out.println(PrivateMethod.toLowerCase("Sakshi Nailwal"));
        System.out.println(PrivateMethod.toUpperCase("HELLO THERE"));
    }
}
