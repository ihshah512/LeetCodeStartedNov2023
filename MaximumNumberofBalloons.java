package Hashsing;
import java.util.*;
public class MaximumNumberofBalloons {

    public static int maxNumberOfBalloons(String text) {
        int numbers = Integer.MAX_VALUE; // Initialize with a large value

        String findWord = "balloon";

        if (text.length() < findWord.length()) {
            return 0;
        }

        HashMap<Character, Integer> balloonHashMap = new HashMap<>();
        HashMap<Character, Integer> wordsFreq = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char currChar = text.charAt(i);
            wordsFreq.put(currChar, wordsFreq.getOrDefault(currChar, 0) + 1);
        }

        for (int j = 0; j < findWord.length(); j++) {
            char currBalloonChar = findWord.charAt(j);
            balloonHashMap.put(currBalloonChar, balloonHashMap.getOrDefault(currBalloonChar, 0) + 1);
        }

        for (Map.Entry<Character, Integer> findChar : balloonHashMap.entrySet()) {
            char key = findChar.getKey();
            int balloonFreq = findChar.getValue();

            if (!wordsFreq.containsKey(key)) {
                return 0; // Character from "balloon" not present in the input string
            }

            numbers = Math.min(numbers, wordsFreq.get(key) / balloonFreq);
        }

        return numbers;
    }

    public static void main(String[] args) {
        String givenStr = "loonbalxballpoon";
        System.out.print(maxNumberOfBalloons(givenStr));
    }
}

/*
Given a string text, you want to use the characters of
text to form as many instances of the word "balloon" as possible.
You can use each character in text at most once.
Return the maximum number of instances that can be formed.
Example 1:
Input: text = "nlaebolko"
Output: 1

 */