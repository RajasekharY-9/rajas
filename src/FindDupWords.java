import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindDupWords {
    public static void main(String[] args) {
String s="Big black bug bit a big black dog on his big black nose";

Map<String,Integer> maplist=new HashMap<>();
String [] arr=s.split(" ");
        for(String l:arr){
            maplist.put(l.toLowerCase(), maplist.getOrDefault(l.toLowerCase(),0)+1);
        }
        maplist.entrySet().
                stream().
                filter(x-> x.getValue()>1).
                forEach(x-> System.out.println(x.getKey()+" : "+x.getValue()));








//        Map<String,Integer> list=new HashMap<>();
//        String [] arr=s.split(" ");
//        for(String k:arr){
//            list.put(k, list.getOrDefault(k,0)+1);
//        }
////        for(Map.Entry<String, Integer> l:list.entrySet()){
////            if(l.getValue()>2){
////                System.out.println(l.getKey()+" : "+l.getValue());
////            }
////        }
//        list.entrySet()

    }
}
