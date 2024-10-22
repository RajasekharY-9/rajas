import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountNoOfAs {
    public static void main(String[] args) {
        String s="Astroidaa";
        //1
        int counter1=0;
        for(int i=0;i<s.length();i++){
            char[] chars = s.toCharArray();
            if(chars[i]=='A'||chars[i]=='a'){
                counter1++;
            }
        }
        System.out.println(counter1);
        //2
        long count = s.chars().filter(c -> c == 'A' || c == 'a').count();
        String collect = s.chars().filter(c -> c == 'A' || c == 'a').mapToObj(c -> String.valueOf((char)c)).collect(Collectors.joining(" "));
        System.out.println(count);
        System.out.println(collect);

    }
}
