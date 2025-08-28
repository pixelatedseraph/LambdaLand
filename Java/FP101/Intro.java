package AdvancedJava.FP;
import java.util.*;
import java.util.stream.*;
public class Intro {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
        int magicSum = numbers.stream()
                .filter(Intro::isPrime) /* filter out non primes */
                .map(n -> n * n)  /* square numbers */
                .filter(n -> n % 3 == 0)   /* filter out numbers which arent divisble by 3 */
                .reduce(0, Integer::sum);   /* sum them */


        Optional<String> message = Optional.of(magicSum)
                .filter(sum -> sum > 50)
                .map(sum -> "Sum a Huge Number: " + sum)
                                .or(() -> Optional.of("Hehe seems like number isnt huge !" + magicSum));
        message.ifPresent(System.out::println);
    }
    static boolean isPrime(Integer n) {
        if (n < 2){
            return false;
        }
        return IntStream.rangeClosed(2,(int)Math.sqrt(n))
                    .allMatch(i-> n % i != 0);
    }
}

