/* WAP using java 8:

Collect all  even numbers from a list using stream
Given a list of objects of following class:
           class Employee{
           String fullName;
           Long salary;
           String city;
           } */

package Java8.Q4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.
                                asList(4, 7, 32, 42, 11, 22, 33, 99);
        List<Integer> evenNumbers = numbers.stream().
                                    filter(o -> o % 2 == 0).
                                    collect(Collectors.toList());
        System.out.println(evenNumbers);
    }

}