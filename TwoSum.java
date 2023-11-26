package Hashsing;
import java.util.*;
public class TwoSum {
    public static int[] twoSum(int[] arr, int target){
      Map<Integer,Integer> hashmap = new HashMap<>();
      for(int i = 0; i < arr.length; i++){
      int currVal = arr[i];
      int isNum = target - currVal;
      if(hashmap.containsKey(isNum)){
          return new int[] {i, hashmap.get(isNum)};
      }else{
          hashmap.put(currVal,i);
      }
      }
        return new int[]{-1,-1};
    }
    public static void main(String[] args){
        int[] myArr = {5,2,7,10,3,9};
        int tar = 8;
        int[] re = twoSum(myArr,tar);
        for(int val: re){
        System.out.print(val + " ,");
        }
    }
}
/*
Given an array of integers nums and an integer target,
return indices of two numbers such that
they add up to target. You cannot use the same index twice.
 */