import java.awt.*;
import java.util.*;
public class MinimumValueGetPositiveStepbyStepSum {

    public static int minStartValue(int[] nums) {
        int startValue = 0;
        int[] prefix = new int[nums.length];

        prefix[0] = nums[0];

       for(int i = 1; i < nums.length; i++) {
         prefix[i] = prefix[i-1] + nums[i];
        }

       for(int j =0; j < prefix.length; j++){

           if(prefix[j] == 0){
               startValue = nums[j]+1;
           }else{
               continue;
           }

       }

        return startValue;
        }
    public static void main(String[] args){

        //given
        int[] myArr = {-3,2,-3,4,2};

      System.out.print(minStartValue(myArr));

    }
}
/*
Given an array of integers nums, you start with an initial positive value startValue.

In each iteration, you calculate the step by step sum of startValue plus elements in nums (from left to right).

Return the minimum positive value of startValue such that the step by step sum is never less than 1.
 */