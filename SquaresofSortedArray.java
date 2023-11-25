import java.util.*;
public class SquaresofSortedArray {
    public static int[] sortSquares(int[] nums){
        int len = nums.length;
        int[] returnArr = new int[len];
        int left = 0;
        int right = len-1;

        for(int i = len-1; i >= 0; i--){

            int leftSqaure = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

    if(leftSqaure > rightSquare){

        returnArr[i] = leftSqaure;
        left++;
    }else{
        returnArr[i] = rightSquare;
        right--;
    }
   }

       return returnArr;
    }
    public static void main(String[] args) {

        int[] arr = {-10, -5, 1, 2, 4, 7};

        int[] res = sortSquares(arr);

        for (int i : res) {
            System.out.print(i + " ,");
        }

    }
}
