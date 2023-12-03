package Hashsing;
import java.util.*;
public class LargestUniqueNumber {

    /*
    Step 1:
    In this problem we should crate a hasmap which will contain key value
  pair where given values of array would be valyes and their number of
  occurancs would be their frequencies.
  step 2:
    Create a List:
    then we would take only those elements whose frequencies are less
    than one. As repetitive numbers do not qualify for a largest number
   Step 3:
   create a set with TreeSet to mantain the asending order
   Step: 5:
   returnt the last element of your set as that would be the largest number
   that only occured once.
*/

        public static int largestUniqueNumber(int[] nums) {
            int largest = 0;
            HashMap<Integer,Integer> countFrequncy = new HashMap<>();
            Set<Integer> eleWithLessthanOneFre = new TreeSet<>();

            for(int ele: nums){
                countFrequncy.put(ele, countFrequncy.getOrDefault(ele, 0)+1);
            }
            for(Map.Entry<Integer,Integer> val: countFrequncy.entrySet()){
                if(val.getValue() == 1){
                    eleWithLessthanOneFre.add(val.getKey());
                }else if(eleWithLessthanOneFre.contains(val.getKey())){
                    eleWithLessthanOneFre.remove(val.getKey());
                }
            }

       // Collections.sort(eleWithLessthanOneFre);
            if(!eleWithLessthanOneFre.isEmpty()) {
               for(int ele: eleWithLessthanOneFre){
                   if(ele >largest){
                       largest = ele;
                   }
               }
                return largest;
            }
            return -1;
        }
        public static void main(String[] args){

            int[] arr = {5,7,3,9,4,9,8,3,1};
           // int[] arr = {9,9,8,8};
            System.out.print(largestUniqueNumber(arr));

        }

    }

/*
Given an integer array nums, return the largest
integer that only occurs once. If no integer occurs once, return -1.
Exampe 1:
Input: nums = [5,7,3,9,4,9,8,3,1]
Output: 8
Explanation: The maximum integer in the array is 9 but it is repeat


 */