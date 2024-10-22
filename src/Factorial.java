import java.math.BigInteger;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Factorial {
    public static int factorial(int no) {
        if (no == 0) {
            return 1;
        } else {
            return no * factorial(no - 1);
        }
    }

    public static void main(String[] args) {
        //Write a program to find the factorial of a number.
        //1
        Scanner s = new Scanner(System.in);
        System.out.println("Enter here : ");
        int n = s.nextInt();
        int res = factorial(n);
        System.out.println(res);
        System.out.println(factorial2(n));
        System.out.println(factorial3(n));
    }

    //2
    public static int factorial2(int no) {

        return IntStream.rangeClosed(1, no).reduce(1, (a, b) -> a * b);
    }
//3
    public static BigInteger factorial3(int no) {

        return IntStream.rangeClosed(1, no).
                mapToObj(BigInteger::valueOf).
                reduce(BigInteger.ONE, BigInteger::multiply);
    }
}
