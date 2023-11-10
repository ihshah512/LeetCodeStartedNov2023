import java.util.*;

public class ReverseCharOfArray {

    public static void reverseString(char[] s){

        int startS = 0;
        int endS = s.length-1;

        while(startS < endS){

            char temp = s[startS]; //VERY IMPORTANT STEMP
            s[startS] = s[endS];
            s[endS] = temp;
            startS++;
            endS--;

        }

        for(char c : s){
            System.out.print(c + " ,");
        }

    }

    public static void main(String[] args){

        char[] arr = {'h', 'e', 'l', 'l', 'o'};
        reverseString(arr);


    }

}
