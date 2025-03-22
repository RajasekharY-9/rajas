package flower;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Fruit {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
names.stream().forEach(x-> System.out.println(x));
    }
}
