import java.util.Arrays;

public class Find2ndMax {
    public static void main(String[] args) {
        //Find second max no from given array
        int arr[]={1,2,8,4,6};
        //1
        Arrays.sort(arr);
        System.out.println("Second max is "+arr[arr.length-2]);
        //2
        int max=Integer.MIN_VALUE;
        int secmax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secmax=max;
                max=arr[i];

            }else if(arr[i]>secmax && arr[i]<max){
                secmax=arr[i];
            }
        }

           System.out.println("Second Max is "+secmax);

    }
}
