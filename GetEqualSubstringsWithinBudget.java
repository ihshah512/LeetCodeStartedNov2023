import java.util.*;
public class GetEqualSubstringsWithinBudget {
    public static int equalSubstring(String s, String t, int maxCost) throws Exception {
          if(s.length() != t.length()){
           return 0;
        }

        char sChar = ' ', tChar = ' ';
        int diff = 0, sCharVal = 0, tCharVal = 0, findCost = 0, totalCurrCost = 0, strLen = 0;
        int start = 0;
        for(int i = 0; i < s.length(); i++){
            sChar = s.charAt(i);
            sCharVal = (int)sChar;
            tChar = t.charAt(i);
            tCharVal = (int)tChar;
            diff = Math.abs(tCharVal-sCharVal);
            totalCurrCost+=diff;
          if(totalCurrCost <= maxCost){
                strLen++;
            }else{//THIS IS CRUCIAL PEACE OF CODE THAT I WAS MISING
              //BCAUSE I WAS NOT RESETTING MY SUBSTRING LENGTH
              totalCurrCost-=Math.abs((int)s.charAt(start) - (int)t.charAt(start));
              start++;
          }
            }
           return strLen;
        }

    public static void main(String[] args) throws Exception {

            String strOne = "krrgw", strTwo = "zjxss";
            int maxCosts = 19;
       // equalSubstring(strOne,strTwo,maxCosts);


           System.out.print(equalSubstring(strOne,strTwo,maxCosts));

    }
}
/*
You are given two strings s and t of the same length and an integer maxCost.

You want to change s to t. Changing the ith character of s to ith character of t costs |s[i] - t[i]| (i.e., the absolute difference between the ASCII values of the characters).

Return the maximum length of a substring of s that can be changed to be the same as the corresponding substring of t with a cost less than or equal to maxCost. If there is no substring from s that can be changed
to its corresponding substring from t, return 0.

 */