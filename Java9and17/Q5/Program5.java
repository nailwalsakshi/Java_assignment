//Use ifPresentOrElse, or, orElseThrow Operations with Optional

package Java9and17.Q5;

import java.util.Optional;
import java.util.stream.IntStream;

public class Program5 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,10)
                .filter(e->e>20)
                .findFirst()
                .ifPresentOrElse(System.out::println,()-> System.out.println("Invalid input"));

        IntStream.rangeClosed(1,10)
                .filter(e->e>20)
                .boxed()
                .findFirst()
                .or(()-> Optional.of(-1))
                .ifPresentOrElse(System.out::println,()-> System.out.println("Invalid input"));

        IntStream.rangeClosed(1,10)
                .filter(e->e>20)
                .findFirst()
                .orElseThrow();
    }
}