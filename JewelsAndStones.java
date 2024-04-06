import java.util.*;
import java.util.Map;
import java.util.HashMap;
public class JewelsAndStones {
    public static int numJewelsInStones(String jewels, String stones) {
        int counter = 0;
        Map<Character, Integer> stoneMap = new HashMap<>();
        Map<Character, Integer> jewelMap = new HashMap<>();
        for(char c : jewels.toCharArray()){
            jewelMap.put(c, jewelMap.getOrDefault(c,0)+1);
        }
        for(char c : stones.toCharArray()) {
            stoneMap.put(c, stoneMap.getOrDefault(c, 0) + 1);
        }
      //  Collection<Integer> jewValues = jewelMap.values();
        for(char d : jewelMap.keySet()){

            if(stoneMap.containsKey(d)){
                counter += stoneMap.get(d);
            }
        }
        return counter;
    }
    public static void main(String[] args){
        System.out.print(numJewelsInStones("aA","AAabbbb"));
    }


}
