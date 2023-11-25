import java.util.*;
public class FixedWindowSize {
    public static int returnMaxSum(int[] arr, int range){
        //int left =0;
        int maxSum=0;
        int currSum=0;
for(int right = 0; right < range; right++){

        currSum+=arr[right];
}
maxSum = currSum;
       for(int left = range; left < arr.length; left++){
           currSum=currSum + arr[left] -arr[left-range];//IMPORTANT
           maxSum = Math.max(maxSum, currSum);
        }
    return maxSum;
     }
    public static void main(String[] args){

        int[] myArr = {3,-1,4,12,-8,5,6,100};
        int arrSize = 4;
        System.out.print(returnMaxSum(myArr,arrSize));
    }
}
/*
Example 4: Given an integer array nums and an integer k,
 find the sum of the subarray with the largest sum whose length
 is k.
 */