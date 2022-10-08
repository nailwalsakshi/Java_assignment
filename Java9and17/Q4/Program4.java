//Use iterator stream method to generate a stream

package Java9and17.Q4;

import java.util.stream.IntStream;

public class Program4 {
    public static void main(String[] args) {

//        Stream Iterator

        IntStream
                .iterate(0,i->i<=20,i->i+2)
                .forEach(System.out::print);
    }
}