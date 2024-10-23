import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaxAndMin {

    public static void main(String[] args) {
        //Write a code to find Min and mAx number from list
        List<Integer> list = Arrays.asList(1, 25, 45, 33, 7, 10);
        //1
        System.out.println("Min without streams : " + Collections.min(list) + "\n" + "Max Without streams : " + Collections.max(list));
        //2
        System.out.println("Min With streams : " + list.stream().min(Integer::compareTo).get() + " \n" + "Max With streams :" + list.stream().max(Integer::compareTo).get());

        List<String> names = Arrays.asList("cat", "elephant", "dog", "horse");
        //1
        Map<Integer, List<String>> maps = names.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(maps);
        for (Map.Entry<Integer, List<String>> s : maps.entrySet()) {
            System.out.println(s.getKey() + " -> " + s.getValue());
        }
//2
        Map<Integer, List<String>> mapss = new HashMap<>();
       for(String s:names){
           int len=s.length();
           if(!mapss.containsKey(len)){
               mapss.put(len,new ArrayList<>());
           }
           mapss.get(len).add(s);
       }
        System.out.println(mapss);

       //Write a program to find the first non-repeating character in a given string.
        String s="swiss";
        char [] chars=s.toCharArray();
       for(int i=0;i<chars.length;i++){
           for(int j=i+1;j<chars.length;j++){
               if(chars[i]!=chars[j]){
                   System.out.println(chars[i]);
                   break;
               }
               break;
           }
           break;
       }
    }
}
