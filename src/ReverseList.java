import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseList {
    public static void main(String[] args) {
        List<String> list= Arrays.asList( "Array", "Set", "List", "Queue");
        //Write a code to change the string to capital and sort them in reverse order
        //1
      list.stream().map(String::toUpperCase)
              .sorted(Comparator.reverseOrder())
              .forEach(System.out::println);
        System.out.println(list);
        //2
        List<String> toSort = new ArrayList<>();
        for (String s : list) {
            String toUpperCase = s.toUpperCase();
            toSort.add(toUpperCase);
        }
        toSort.sort(Comparator.reverseOrder());
        for (String toUpperCase : toSort) {
            System.out.println(toUpperCase);
        }
        System.out.println(list);;
    }
}
