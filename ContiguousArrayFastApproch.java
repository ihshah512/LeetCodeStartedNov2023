package Hashsing;
import java.util.*;
public class ContiguousArrayFastApproch {


    public static int findMaxLength(int[] nums){

        for(int i = 0; i < nums.length; i++){
            if(nums[i]==0){
                nums[i]=-1;
            }
        }

        int maxLen = 0;
        int currSum = 0;
        HashMap<Integer,Integer> sumMap = new HashMap<>();
        sumMap.put(0,-1);
        for(int j = 0; j < nums.length; j++){
        currSum+=nums[j];
        if(sumMap.containsKey(currSum)){
            maxLen = Math.max(maxLen, j-sumMap.get(currSum));
        }else{
            sumMap.put(currSum,j);
        }


        }


    return maxLen;

    }


    public static void main(String[] args){

        int[] arr = {0,1,0,1};
        System.out.print(findMaxLength(arr));



    }



}
