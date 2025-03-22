public class SwapStrings {
    public static void main(String[] args) {
// Declare two strings
        String a = "Hello";
        String b = "World";
// Print String before swapping
        System.out.println("Strings before swap: a = " + a + " and b = "+b);
//        String[] s=new String[2];
//        s[0]=a;
//        s[1]=b;
//        a=s[1];
//        b=s[0];
//        System.out.println("Strings After swap: a = " + a + " and b = "+b);


        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());
        System.out.println("Strings After swap: a = " + a + " and b = "+b);
    }
}
