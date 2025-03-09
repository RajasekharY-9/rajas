import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDuplicates {


    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 10, 3, 3, 4,
                5, 5));
        List<Integer> collect = list.stream().distinct().collect(Collectors.toList());
        collect.stream().forEach(System.out::println);
        Map<Integer,Integer> dups=new HashMap<>();
        for(Integer j:list){
            dups.put(j, dups.getOrDefault(j,0)+1);//insert key and insert corresponding value also
        }
        dups.entrySet().stream().filter(p->p.getValue()>1).forEach(x-> System.out.println(x.getKey()+" : "+x.getValue()));
    }
}
