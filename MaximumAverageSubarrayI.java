import java.util.*;
public class MaximumAverageSubarrayI {

    public static double findMaxAverage(int[] nums, int k){

        int currSum = 0;
        double currSumAvg = 0;
        double maxSumAvg = 0;
        //First we will find the sum of subArray havin k length
        for(int i=0; i < k; i++){
            currSum+=nums[i];
        }
        currSumAvg = (double)currSum/k;
        //Now we have sum of first k elements now store it in maxSum
        //assuem this is our maxSum for the time being we will use this
        //sum for our subsequent subArray Sums for comparisons
        maxSumAvg = currSumAvg;
        //Now as we have maxSumAvg we would use fixed slide window tech
        //to move from left to right until we exaust the array limit
        //we will find currAvg compare it with maxAvg if maxAvg is already
        //max we will do nothing and move to next avg if not we would
        //replace maxAvg with our currAvg and move forward. At the end of our
        //iterations we would only left with maxAvg and we would return
        //that valye
        for(int left = k; left < nums.length; left++){
            currSum = currSum - nums[left-k] +nums[left];
            currSumAvg = (double)currSum/k;
            maxSumAvg = Math.max(maxSumAvg, currSumAvg);
        }
        return maxSumAvg;
    }
    public static void main(String[] args){

    int[] myArr = {4,2,1,3,3};
    int subArraySize = 2;
    System.out.print(findMaxAverage(myArr,subArraySize));
    }
}
