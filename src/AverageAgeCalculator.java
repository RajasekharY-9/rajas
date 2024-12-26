import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for age
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

}

public class AverageAgeCalculator {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 35),
                new Person("Diana", 28)
        );
        OptionalDouble average = people.stream().mapToInt(Person::getAge).average();
        System.out.println(average.getAsDouble());
        //Print name of emp whose age more than 35
        int threshold=30;
        people.stream().filter(x->x.getAge()>threshold).forEach(x-> System.out.println(x.getName()));
    }
}
