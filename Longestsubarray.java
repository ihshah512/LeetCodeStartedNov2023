import java.util.*;
public class Longestsubarray {

    public static int longestArray(int[] arr, int sum){

        int len = 0;
        int left = 0;
        int currSum = 0;

        for(int right = 0; right < arr.length-1; right++){
            int val = arr[right];
            currSum+=val;

            while(currSum > sum){

                currSum-=arr[left];
                left++;
            }
            len = Math.max(len, right-left+1);
        }

        return len;
    }

    public static void main(String[] args){

        int[] givenArr = {3, 1, 2, 7, 3, 2, 1, 1,1, 5};
        int findSum = 8;
        System.out.print(longestArray(givenArr, findSum));


    }



}
