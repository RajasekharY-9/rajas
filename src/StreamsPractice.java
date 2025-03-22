import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsPractice {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 5, 66, 8);
        List<Integer> list2 = Arrays.asList(1, 5, 66, 8);
        List<Integer> list3 = Arrays.asList(1, 5, 66, 8);

        // Using map to cube each element of the list
        Stream<Integer> integerStream = list.stream().map(j -> j * j * j);
        System.out.println(integerStream.toList());

        // Collecting lists into a List of Lists
        List<List<Integer>> collect = Arrays.asList(list2, list3, list);

        // Using flatMap to flatten the List<List<Integer>> into a single Stream
        List<Integer> flattened = collect.stream()
                .flatMap(Collection::stream).map(n->n/2)  // Flattening the List<List<Integer>> to Stream<Integer>
                .collect(Collectors.toList())

                ; // Collecting to a List

        System.out.println(flattened); // This will print all elements from the lists as a flat list
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
        Integer integer = numbers.stream().max(Integer::compareTo).orElse(0);
        System.out.println("Max :: "+integer);
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        Map<Integer, List<String>> collect1 = names.stream().collect(Collectors.groupingBy(String::length));
collect1.entrySet().forEach(x-> System.out.println(x.getKey()+" "+x.getValue()));
        List<Integer> list5 = Arrays.asList(1, 2, 3, 4);
        Optional<Integer> reduce = list5.stream().reduce(Integer::sum);
        System.out.println(reduce.get());
        List<String> words = Arrays.asList("apple", "banana", "apple");
        Map<String, Long> collect2 = words.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        collect2.entrySet().stream().forEach(x-> System.out.println(x.getKey()+" : "+x.getValue()));
        List<String> letters = Arrays.asList("Java", "is", "awesome");
        String collect3 = letters.stream().collect(Collectors.joining(" "));
        System.out.println(collect3);
        //Sort employees by salary
        class Employee {
            String name;
            int salary;

            public int getSalary() {
                return salary;
            }

            Employee(String name, int salary) {
                this.name = name;
                this.salary = salary;
            }
            public String toString() {
                return name + ": " + salary;
            }
        }
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 5000),
                new Employee("Bob", 3000),
                new Employee("Charlie", 4000)
        );
        List<Employee> collect4 = employees.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).collect(Collectors.toList());

        //Find the first non-repeated character in a string.
        String input = "swiss";
        Optional<Character> first = input.chars().mapToObj(x -> (char) x).filter(x -> input.indexOf(x) == input.lastIndexOf(x))
                .findFirst();
        System.out.println(first.get());
        List<List<Integer>> nestedList = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );
        System.out.println(nestedList);

        nestedList.stream().flatMap(Collection::stream).forEach(System.out::println);
       // . Use Collectors.partitioningBy() to separate even and odd numbers.
        List<Integer> numberslist = Arrays.asList(1, 2, 3, 4, 5, 6);
        Map<Boolean, List<Integer>> collect5 = numberslist.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(collect5);
        List<Integer> secondhigh = Arrays.asList(10, 20, 30, 40, 50);
        Optional<Integer> first1 = secondhigh.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(first1.get());
       // Count the frequency of characters in a string using Streams.
        String inputs = "java";
       HashMap<Character,Integer> maps=new HashMap<>();
       for(Character c:inputs.toCharArray()){
           maps.put(c, maps.getOrDefault(c,0)+1);
       }
        System.out.println(maps);


        Map<Character, Long> collect6 = inputs.chars().mapToObj(x -> (char) x).collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(collect6);

        List<Integer> collect7 = Stream.iterate(1, n -> n + 2).limit(1000).collect(Collectors.toList());
        System.out.println(collect7);

       // 19. Check if all elements in a list are greater than a given number.
                List<Integer> great = Arrays.asList(10, 20, 30, 40);
        boolean b = great.stream().allMatch(x -> x > -10);
        System.out.println(b);

       // 20. Find the average of a list of numbers.
        List<Integer> avg = Arrays.asList(10, 20, 30, 40);
        Double collect8 = avg.stream().collect(Collectors.averagingInt(Integer::intValue));

        System.out.println(collect8.intValue());

        class Employees {
            String name;
            String department;

            public String getDepartment() {
                return department;
            }

            Employees(String name, String department) {
                this.name = name;
                this.department = department;
            }
        }
        List<Employees> employeess = Arrays.asList(
                new Employees("Alice", "HR"),
                new Employees("Bob", "IT"),
                new Employees("Charlie", "HR"),
                new Employees("David", "IT")
        );
        Map<String, List<Employees>> collect9 = employeess.stream().collect(Collectors.groupingBy(Employees::getDepartment));
      collect9.forEach((dept,name)->{
          System.out.println(dept+" :: "+name.stream().map(e->e.name).collect(Collectors.toList()));
      });

       // 23. Count occurrences of each word in a sentence.
        String sentence = "Java is fun and Java is powerful";
HashMap<String,Integer> cou=new HashMap<>();
for(String s:sentence.split(" ")){
    cou.put(s, cou.getOrDefault(s,0)+1);
}
        System.out.println(cou);
        Map<String, Long> collect10 = Arrays.stream(sentence.split(" ")).collect(Collectors.groupingBy(w -> w, Collectors.counting()));
        System.out.println(collect10);
      //  24. Find the longest word in a list.
                List<String> longest = Arrays.asList("apple", "banana", "cherry", "date");
        String s = longest.stream().sorted(Comparator.comparing(String::length).reversed()).findFirst().get();
        String S2=longest.stream().max(Comparator.comparingInt(String::length)).get();
        System.out.println(s);
        System.out.println(S2);
//25. Merge two lists into a single list using flatMap().
        List<Integer> list7 = Arrays.asList(1, 2, 3);
        List<Integer> list6 = Arrays.asList(4, 5, 6);

        List<Integer> collect11 = Stream.of(list6, list7).flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(collect11);
       // 26. Find the first element in a Stream greater than 10.
        List<Integer> firstelement = Arrays.asList(5, 8, 12, 3, 20);
        Optional<Integer> first2 = firstelement.stream().filter(x -> x > 10).findFirst();
        System.out.println(first2.get());
       // 27. Find the minimum value in a list using Streams.
                List<Integer> minimumvalue = Arrays.asList(10, 20, 5, 15);
        Integer integer1 = minimumvalue.stream().min(Comparator.comparingInt(Integer::intValue)).get();
        System.out.println(integer1);
        //28. Use Stream.generate() to create a list of random numbers.
        List<Double> collect12 = Stream.generate(Math::random).map(x->x*10).limit(20).collect(Collectors.toList());
        System.out.println(collect12);

       // 29. Find duplicate elements in a list using Streams.
        List<Integer> duplicatenumbers = Arrays.asList(1, 2, 3, 4, 5, 2, 3);
        Map<Integer, Long> collect13 = duplicatenumbers.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
collect13.entrySet().stream().filter(x->x.getValue()>1).forEach(x-> System.out.println(x.getKey()));
     //   30. Partition a list into prime and non-prime numbers.
                List<Integer> primenumbers = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10);

        Map<Boolean, List<Integer>> collect14 = primenumbers.stream().collect(Collectors.partitioningBy(StreamsPractice::isPrime));
        System.out.println(collect14);
       // Find all palindromic strings in a list.

        List<String> palindromicwords = Arrays.asList("madam", "racecar", "java", "level",
                "hello");
        for(String ss:palindromicwords){
String rev=new StringBuilder(ss).reverse().toString();
if(ss.equals(rev)){
    System.out.println("palindrome "+ss);
}
        }
        palindromicwords.stream().filter(n->new StringBuilder(n).reverse().toString().equals(n)).forEach(System.out::println);

    }
    static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {  // Check up to square root of num
            if (num % i == 0) {
                return false;  // If divisible by i, it's not prime
            }
        }
        return true;  // If no divisors were found, it's prime
    }}

