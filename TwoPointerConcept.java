import java.util.*;

public class TwoPointerConcept {

     public static boolean plaindrom(String str){

         int left = 0;
         int right = str.length()-1;

         while(left < right){

             if(str.charAt(left)!= str.charAt(right)){
                 return false;
             }
             ++left;
             --right;
         }

        return true;
     }
     public static boolean twoSum(int[] arr, int num) {

         int left = 0;
         int right = arr.length - 1;

         while (left < right) {

             if (arr[left] + arr[right] == num) {
                 return true;
             }

             if (arr[left] + arr[right] > num) {
                --right;
             }

             if (arr[left] + arr[right] < num) {
                 ++left;
             }
         }

         return false;
     }
    public static void main(String[] args){
        //System.out.println(plaindrom("racecar"));
        // System.out.println(plaindrom("acecar"));
       int[] myArr = {1, 2, 4, 6, 8, 9, 14, 15};
       int number = 131;

        System.out.println(twoSum(myArr, number));
    }
}
/*
NOTE: WE cam use same two pointer technique for arrays as well.



 */