import java.util.*;
import java.util.Map;
import java.util.HashMap;

public class RansomeNote {

    public static boolean canConstruct(String ransomNote, String magazine) {

        //spliting strings into arrays
        if(magazine.length() < ransomNote.length()){
            return false;
        }
       // char[] ransomWords = ransomNote.split(" ");
       // char[] magzineWords = magazine.split(" ");

        Map<Character, Integer> ransomCharFrequncyCounter = new HashMap<>();
        Map<Character, Integer> magzineCharFrequncyCounter = new HashMap<>();

        for(char c : ransomNote.toCharArray()){
            ransomCharFrequncyCounter.put(c, ransomCharFrequncyCounter.getOrDefault(c,0)+1);
        }
        for(char cMag : magazine.toCharArray()){
            magzineCharFrequncyCounter.put(cMag,magzineCharFrequncyCounter.getOrDefault(cMag,0)+1);
        }

       for(char c : ransomNote.toCharArray()){

      if(!magzineCharFrequncyCounter.containsKey(c) || magzineCharFrequncyCounter.get(c) < ransomCharFrequncyCounter.get(c)){
          return false;
      }


       }


        return true;
    }

        public static void main(String[] args){

         System.out.print(canConstruct("aa", "ab"));


    }
}
/*
If the frequncy of ransome string letters matached with the frequncy of
magzie than it means we can construct magzie with ransomenote.

 */