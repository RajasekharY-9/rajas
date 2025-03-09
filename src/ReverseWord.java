import java.util.Collections;

public class ReverseWord {
    //Reverse words at same place of given string:
    public static void main(String[] args) {
        //I/p: Test Automation and o/p: tseT noitamotuA
        String s = "Test Automation ";
String arr[]=s.split(" ");//Test Automation
StringBuilder output=new StringBuilder();
for(String k:arr){
    String rever=new StringBuilder(k).reverse().toString();
    output.append(rever).append("");
}
        System.out.println(output.toString().trim());
    }
}
