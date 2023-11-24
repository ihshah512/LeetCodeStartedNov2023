import java.util.*;
public class FindPivotIndex {
    public static int pivotIndex(int[] nums) {

     int sum = 0, leftsum = 0;
     for(int x : nums) sum+=x;
     /*This is how we can get total of whole array, we took this sum
     because we need to find right sum simentanely but subtracting leftsum
     at each iteration and if in case of leftsum = right sum we will return
     that index. Otherwise we will increment leftSum with our arry element
     and kept searching for match until array gets fully exausted.
     Upon exusation we will return -1.
      */
     for(int i = 0; i < nums.length; i++ ){

         if(leftsum == sum - leftsum - nums[i]) return i;
         leftsum+=nums[i];


     }
     return -1;



    }
    public static void main(String[] args){

        int[] arr = {1,7,3,6,5,6};
        int[] arr2 = {1,2,3};
        int[] arr3 = {2,1,-1};
     //  pivotIndex(arr);
     //   pivotIndex(arr);
       System.out.println(pivotIndex(arr));
      System.out.println(pivotIndex(arr2));
      System.out.println(pivotIndex(arr3));

    }
}

// System.out.println("midValforOddLength: " + midValforOddLength);
//System.out.println("zeroToMidSum: " + zeroToMidSum);
//System.out.println("rightEndSum: " + rightEndSum);

/*
Given an array of integers nums, calculate the pivot index of this array.

The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

Return the leftmost pivot index. If no such index exists, return -1.



 */