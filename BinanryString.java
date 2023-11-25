import java.util.*;
public class BinanryString {

    public static int findLen(String givenStr){

        int subStrLen = 0;
        int left = 0;
        int strLength = givenStr.length();
        int maxZero = 0;

        for(int right = 0; right < strLength; right++){

            char currChar = givenStr.charAt(right);

            if(currChar == '0'){
                maxZero++;
            }

            while(maxZero > 1){

                left++;

            }
            subStrLen = Math.max(subStrLen, right-left+1);
        }

        return subStrLen;
    }

    public static void main(String[] args){

        String given = "111110111";
        System.out.print(findLen(given));

    }
}
