import java.util.*;
import java.util.stream.Collectors;

public class CountFrequencyOfNos {
 /*   Write a program that counts the frequency of each element in a list using Java Streams.
    Example Input: [1, 2, 2, 3, 3, 3, 4]
    Expected Output: {1=1,2=2,3=3,4=1}*/

   /* Given a list of strings, filter out the strings that contain the letter "a" and collect the remaining elements into a new list.
    Example Input: ["apple", "banana", "cherry", "date"]
    Expected Output: ["cherry","date"]*/

   /* Given a list of integers, use a parallel stream to compute the sum of all the elements.
    Example Input: [1, 2, 3, 4, 5]
    Expected Output 15*/

    /*Given a list of lists, flatten it into a single list using Java Streams.
    Example Input: [[1, 2], [3, 4], [5]]
    Expected Output:[1,2,3,4,5]*/

 public static void main(String[] args) {
     int [] arr={1, 2, 2, 3, 3, 3, 4};
     Map<Integer, Long> nos = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
     System.out.println(nos);

     String [] s={"apple", "banana", "cherry", "date"};
     List<String> a = Arrays.stream(s).filter(x -> !x.contains("a")).collect(Collectors.toList());
     System.out.println(a);
List<Integer> list=Arrays.asList(1, 2, 3, 4, 5);
     int sum = list.parallelStream().mapToInt(Integer::intValue).sum();
     System.out.println(sum);
     List<List<Integer>> arrays=Arrays.asList(
             Arrays.asList(1,2),
             Arrays.asList(4,5),
             Arrays.asList(11,55)
     );
     List<Integer> flats = arrays.stream().flatMap(List::stream).collect(Collectors.toList());
     System.out.println(flats);
 }
}
