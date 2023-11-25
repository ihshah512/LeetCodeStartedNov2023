import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.*;
import java.util.ArrayList;

public class SubStringOrderedStringMatch {
    public static boolean strFound(String str, String subStr){
        int strStart = 0;
        int strEnd = str.length();
        int subStrStart = 0;
        int subStrEnd = subStr.length();
       while((strStart < strEnd) && (subStrStart < subStrEnd)){

            if(subStr.charAt(subStrStart) == str.charAt(strStart)){
                strStart++;
                subStrStart++;
            }else{
                strStart++;
            }
        }
        if(subStrStart < subStrEnd){
            return false;
        }
        return true;
    }
    public static void main(String[] args){

        String str = "Imran Hussain Shah";
        String subStr = "IHS";

        System.out.println(strFound(str, subStr));

    }
}
