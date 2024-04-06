import java.util.*;
import java.util.Map;
import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {

        Set<Character> set = new HashSet<>();
        int n = s.length();
        int left = 0;
        int right = 0;
        int maxLen = 0;

        while(right < n){ //this is how we make sure we dont hit outof bound error

          if(!set.contains(s.charAt(right))){
              /*
          In line 17 we are checking rather set doesnt contain the char
          located at 0 index of string. if it does not than we are add
          it to the set. Incrementing right to index 1.
          At this point mAXlEN is 0 and right-left+1 = 1 thus Math.max
          will pick 1;
          again now we are at index 1 which is b and set does not contain that
          thus we are adding it to the set and again calculating right-left+1=
          1-0+1=2 and by applying Math.max we pick 2 as maxLen.
          Again same with c .
          but when we hit the case where set contain 'a' thus code will getinto
          else statement where it will remove the char located at left which is
          0 index  = a from the set and increment the left iterator to the right.
          thus now left is at index 1.
          again loop throught to now this time as 'a' has been been removed from
          set thus again we will check rather char located at right exists in set which
          is 'a' at this point no it doesnt becanuse we already removed it
          in last iteration thus we are adding it to our set now set will contain
          bca substring again right increment to check next now we have 'b' at right
          index which already exist in set thus we will go to else
          condition to remove it and move left pointer to right.
           */
              set.add(s.charAt(right));
              maxLen = Math.max(maxLen, right-left+1);
              right++;
          }else{
              set.remove(s.charAt(left));
              left++;

          }


        }





        return maxLen;
    }

    public static void main(String[] args){
int re = lengthOfLongestSubstring("abcabcbb");
System.out.println(re);
    }




}
/*
Given a string s, find the length of the longest substring without repeating characters.
Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

 */