import java.awt.*;
import java.util.*;
public class ReversePrefixofWord {
    public static String reversePrefix(String word, char ch) {

        StringBuilder revStr = new StringBuilder();
        int wordLength = word.length();
        int charFoundAt = 0;
        int leftIndex = 0;

        for(int i = 0; i < wordLength; i++) {
            char currChar = word.charAt(i);
            // System.out.println(currChar);
            if (currChar == ch) {
                charFoundAt = i;
               break;
            }
        }
        int temp = charFoundAt+1;
            while(charFoundAt >= leftIndex){
                revStr.append(word.charAt(charFoundAt));
                charFoundAt--;
            }
            while((temp) < wordLength){
                revStr.append(word.charAt(temp));
                temp++;
            }
        return revStr.toString();
    }
   public static void main(String[] args){

        String givenStr = "abcdefd";
        char c = 'd';

        String strr = reversePrefix(givenStr, c);
        System.out.print(strr);
    }
}
/*
Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0 and ends at the index of the first occurrence of ch (inclusive). If the character ch does not exist in word, do nothing.

For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and ends at 3 (inclusive). The resulting string will be "dcbaefd".
Return the resulting string.



Example 1:

Input: word = "abcdefd", ch = "d"
Output: "dcbaefd"
Explanation: The first occurrence of "d" is at index 3.
Reverse the part of word from 0 to 3 (inclusive), the resulting string is "dcbaefd".


 */