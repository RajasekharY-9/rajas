public class ConvertNum {
    public static void main(String[] args) {

        // Convert String to integer without using inbuilt(integer.parse)
        String s="-1234";
        System.out.println(s.getClass().getName());
        Integer n=Integer.parseInt(s);
        System.out.println(n.getClass().getName());

       int result=0;
       int sign=1;
       int i=0;

       if(s.charAt(i)=='-'){
           sign=-1;
           i++;
       }


       while (i<s.length()){
           //0=0*10+1-0
           //1=1*10+2-0
           //12=12*10+3-0
           //123=123*10+4-0
           //1234
           //0+-+-
           int j=s.charAt(i);
           int k=j-'0';//45-48 ascii
           result=result*10+(k);
           i++;
       }
       int output=sign*result;
        System.out.println(output);

    }
}
