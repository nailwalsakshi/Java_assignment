//Use rangeClosed to create a  Stream

package Java9and17.Q3;

import java.util.stream.IntStream;

public class Program3 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,10).forEach(System.out::println);
    }
}