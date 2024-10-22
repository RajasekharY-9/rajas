import java.util.HashMap;
import java.util.Map;

public class CountDuplicateChars {
    public static void main(String[] args) {
        //Write a program to count duplicate characters in a string.
        String s="Praise The Lord";
        char [] chars=s.toLowerCase().replace(" ","").toCharArray();
        Map<Character,Integer> data=new HashMap<>();
        for(Character c:chars){
            if(data.containsKey(c)){
                data.put(c,data.get(c)+1);
            }else{
                data.put(c,1);
            }
        }
        for(Map.Entry<Character,Integer> g: data.entrySet()){
            if(g.getValue()>1){
                System.out.println(g.getKey()+" -> "+g.getValue());
            }
        }

    }
}
