import java.util.*;
public class ReverseOnlyLetters {

    public static String reverseOnlyLetters(String s) {

        StringBuilder sb = new StringBuilder();
        int sLength = s.length()-1;

        /*
        In this problem we will crate a sb string. We would iternate over
        the given string in reverse order and we will keep appending the endlish
        chars in our rever str variable.
         */
        for (int i = sLength; i >= 0; i--) {
            int left = 0;
            char c = s.charAt(i);
            char ch = s.charAt(left);
            if (Character.isAlphabetic(c)) {
                sb.append(c);
            }
         }

 for(int j = 0; j < s.length(); j++){
            char ch = s.charAt(j);

            if(!Character.isAlphabetic(ch)){
                sb.insert(j, ch);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args){

        String st = "a-bC-dEf-ghIj";
        String strr = reverseOnlyLetters(st);
        System.out.print(strr);
    }
}
