package Hashsing;
import java.util.*;
public class FindUniqueNumInArrayHM {

    public static List<Integer> findNum(int[] nums){

    List<Integer> ans = new ArrayList<>();
    Set<Integer> numSet = new HashSet<>();//For storing all nums from arrauy into Set

    for(int num: nums){
        numSet.add(num);
    }
    for(int num: nums){
        if(!numSet.contains(num+1) && !numSet.contains(num-1)){
            ans.add(num);
        }
    }

return ans;
    }
public static void main(String[] args){

int[] arr = {1,2,3,10,23,24,25,31,35,0};

List<Integer> list = findNum(arr);

for(int val: list){
    System.out.print(val+" ,");
}

}

}
/*
Example 3: Given an integer array nums,
find all the unique numbers x in nums that satisfy the following:
x + 1 is not in nums, and x - 1 is not in nums.

 */