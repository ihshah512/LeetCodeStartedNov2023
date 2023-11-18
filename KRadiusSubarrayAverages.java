import java.util.*;
public class KRadiusSubarrayAverages {
    public static int[] getAverages(int[] nums, int k){

        int counter = 0;
        int givenArrLength = nums.length;
        int[] returnAvgArr = new int[givenArrLength];
        int numsStart = 0;
        int lastIndexes = givenArrLength  - k;
        int getSumOfBeforeK = 0;
        int getSumOfAfterK = 0;
        int[] preFixArr = new int[givenArrLength];

                if((givenArrLength > 100000) || (k > 100000) || (nums[counter] > 100000)){
                    returnAvgArr[counter] = -1;
                }
      //Frist we would put -1 after and before those indexs which
        // are less than k

        preFixArr[0] = nums[0];
        for(int i = 1; i < preFixArr.length; i++){
            preFixArr[i] = preFixArr[i-1] + nums[i];
       }
        if(k >= givenArrLength){
            while(numsStart < givenArrLength){
                returnAvgArr[numsStart] = -1;
                numsStart++;
            }
        }
        numsStart =0;

        if((k == 0) && (givenArrLength <= 1)){
            returnAvgArr[0] = nums[0];
        }
           if(givenArrLength > k){
            while(numsStart < k){
                returnAvgArr[numsStart] = -1;
                numsStart++;
            }
            while(lastIndexes < givenArrLength){
                returnAvgArr[lastIndexes] = -1;
                lastIndexes++;
            }

            int divisor = (k*2 + 1);
            if(divisor > 0){
                returnAvgArr[k] = preFixArr[k+k]/divisor;
            }
            int leftOfPrefix = 0;
            for(int m = (k+1); m < (givenArrLength - k); m++){
                if(divisor > 0) {
                    returnAvgArr[m] = (preFixArr[m + k] - preFixArr[leftOfPrefix]) / divisor;
                }
                leftOfPrefix++;
            }
        }
        return returnAvgArr;
        }
    public static void main(String[] args){

        int[] myArr = {7,4,3};
        int kTH = 1;
        int[] re = getAverages(myArr, kTH);

        for(int l : re) {
            System.out.print(l  + " , ");
        }
    }
}
/*
ou are given a 0-indexed array nums of n integers, and an integer k.

The k-radius average for a subarray of nums centered at some
index i with the radius k is the average of all elements in nums
between the indices i - k and i + k (inclusive). If there are less
than k elements before or after the index i, then the k-radius average
is -1.

Build and return an array avgs of length n where avgs[i] is the
 k-radius average for the subarray centered at index i.

The average of x elements is the sum of the x elements divided
by x, using integer division. The integer division truncates toward zero, which means losing its fractional part.

For example, the average of four elements 2, 3, 1, and 5 is
(2 + 3 + 1 + 5) / 4 = 11 / 4 = 2.75, which truncates to 2.

 */