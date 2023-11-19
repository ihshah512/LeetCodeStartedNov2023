import java.util.*;

public class StringBuilderUseToBuildString {

    public static String buildString(String s){

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            sb.append(s.charAt(i));
        }

        sb.append("Hussain");

        return sb.toString();
    }
    public static void main(String[] args){

        String name = "Imran";
        String sbName = buildString(name);
        System.out.println(sbName);
    }
}
