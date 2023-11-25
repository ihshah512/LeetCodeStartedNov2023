import java.util.*;
public class RangeSumQueryImmutable {

   int[] prefixSum; //declar an array in which we will save all sums
    public RangeSumQueryImmutable(int[] nums) {
                prefixSum = new int[nums.length];
                prefixSum[0] = nums[0];
    for(int i = 1; i < prefixSum.length; i++ ){
                prefixSum[i] = prefixSum[i-1] + nums[i];
    }
    }
    public int sumRange(int left, int right) {

        if(left == 0){
            return prefixSum[right];
        }

        if(left == right || right == left){
        return prefixSum[right]-prefixSum[left-1];
        }

        if(right < left){
            throw new IndexOutOfBoundsException("Right limit cant be less than left");
        }
        return prefixSum[right] -prefixSum[left-1];
    }
public static void main(String[] args){

    RangeSumQueryImmutable obj;
    int[] arr = {-4,-5};
    obj = new RangeSumQueryImmutable(arr);
    //obj.sumRange(3,1);
    System.out.println(obj.sumRange(0,0));
    System.out.println(obj.sumRange(1,1));
    System.out.println(obj.sumRange(0,1));
    System.out.println(obj.sumRange(1,1));
    System.out.println(obj.sumRange(0,0));

    }
}

/*
Given an integer array nums, handle multiple queries of the
 following type:

Calculate the sum of the elements of nums between indices
 left and right inclusive where left <= right.
Implement the NumArray class:

NumArray(int[] nums) Initializes the object with the
integer array nums.
int sumRange(int left, int right) Returns the sum of the
elements of nums between indices left and right inclusive (
i.e. nums[left] + nums[left + 1] + ... + nums[right]).
 Example 1:
Input
["NumArray", "sumRange", "sumRange", "sumRange"]
[[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]
Output
[null, 1, -1, -3]

Explanation
NumArray numArray = new NumArray([-2, 0, 3, -5, 2, -1]);
numArray.sumRange(0, 2); // return (-2) + 0 + 3 = 1
numArray.sumRange(2, 5); // return 3 + (-5) + 2 + (-1) = -1
numArray.sumRange(0, 5); // return (-2) + 0 + 3 + (-5) + 2 + (-1) = -3
 */
