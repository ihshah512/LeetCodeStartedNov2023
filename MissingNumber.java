package Hashsing;
import java.util.*;
public class MissingNumber {

    public static int missingNumber(int[] nums) {
    Arrays.sort(nums);
    int n = nums.length;
    for(int i = 0; i < n; i++){

        if(nums[i] == i+1){
        return i;
        }
    }
        return n;
    }

    public static void main(String[] args){
    int[] arr = {9,6,4,2,3,5,7,0,1};
     int[] arr2 = {1};
   System.out.println(missingNumber(arr));
     //  missingNumber(arr);

    }
}
