package Hashsing;
import java.util.*;
public class RoughWork {

    public static void main(String[] args){

        int[] arr = {0,1,3,4,5,6,7,8,10,2};
       // String str = "abcdef";
      //  System.out.println(arr.length);
       // System.out.println(str.length());
       // System.out.println(arr[arr.length-1]);
       // System.out.println(str.charAt(str.length()-1));

        Set<Integer> mySet = new TreeSet<>();
        int sum = 0;
        for(int val : arr){
           mySet.add(val);
        }
        for(int val : mySet){
            sum+=val;
        }
        Set<Integer> yourSet = new TreeSet<>();

       // System.out.println(sum);
        int min = Collections.min(mySet);
        int max = Collections.max(mySet);
     //   System.out.println(min);
      //  System.out.println(max);
        int sumTwo = 0;
        for(int k = min; k <=max; k++){
            sumTwo+=k;
        }
      //  System.out.println(sumTwo);
        int diff = sumTwo - sum;
        int n = arr.length;
        int firstVal = arr[0];
        int lastVal = arr[arr.length-1];
        int sum3 = 0;
             sum3 =   n*(n+1)/2;
        System.out.println(sum3);
    }
}
