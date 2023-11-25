import java.util.*;
public class NumberofSubarrays {
public static int numOfSubArray(int[] arr, int givenProduct){
    if(givenProduct < 0){
        return 0;
    }
    int num = 0;
    int left = 0;
    int currentProduct = 1;

   for(int right = 0; right < arr.length; right++){

       currentProduct *= arr[right];


        while(currentProduct >= givenProduct){

            currentProduct /= arr[left];

            left++;

        }
        num += right -left +1;
       // num = Math.max(num, right-left+1);
   }

    return num;
}
 public static void main(String[] args){

     int[] myArr = {10, 5, 2, 6};
     int number = 100;

     System.out.print(numOfSubArray(myArr, number));




    }

}
/*
Example 3: 713. Subarray Product Less Than K.
Given an array of positive integers nums and an
integer k, return the number of subarrays where the
product of all the elements in the subarray is strictly less than k.
For example, given the input nums = [10, 5, 2, 6], k = 100,
the answer is 8. The subarrays with products less than k are:
[10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]

 */