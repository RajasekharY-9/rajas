import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 6, 7};
        //28-23
        //n=length
        //expected n(n+1)/2
        //actual sum of arr
        //missing = expected-actual
        int n=numbers.length+1;
        int expected=n*(n+1)/2;

        int actual=0;
       actual= Arrays.stream(numbers).sum();

       int miss=expected-actual;
        System.out.println(miss);
    }
}
