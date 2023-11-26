import java.util.*;
import java.util.Set;
public class FirstLettersToAppearTwiceHM {
    public static char letterSeen(String s) throws Exception{
        Set<Character> seen = new HashSet<>();
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            if (seen.contains(sChar)) {
                counter++;
                return sChar;
            } else {
                seen.add(sChar);
            }
        }//This exception is just extra step to tell use what if not found
        if(counter == 0){
            throw new Exception("Char not found");
        }
        return ' ';
    }
    public static void main(String[] args) throws Exception{
        String str = "abcedd";
        char c = letterSeen(str);
        System.out.println(c);
    }
}
/*
Given a string s, return the first character to appear twice.
It is guaranteed that the input will have a duplicate character.
 */