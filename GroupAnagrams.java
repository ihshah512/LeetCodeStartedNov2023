package Hashsing;
import java .util.*;
public class GroupAnagrams {

    public static List<List<String>> anagramsList(String[] str){
        //Declare a hashmap in which the string will be added as key and its respective anagrams would be added
        //in a list of its own group
        Map<String, List<String>> groups = new HashMap<>();
        for(String s : str){
            char[] arr = s.toCharArray();

            Arrays.sort(arr);
            String key = new String(arr);

            if(!groups.containsKey(key)){
                groups.put(key, new ArrayList<String>());
            }

            groups.get(key).add(s);
          }

        return new ArrayList(groups.values());

    }


    public static void main(String[] args){

        String[] strr = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> re = anagramsList(strr);
        for(List<String> list: re){

            System.out.print(re + ", ");
        }
    }
}
/*
Example 1: 49. Group Anagrams

Given an array of strings strs, group the anagrams together.

For example, given strs = ["eat","tea","tan","ate","nat","bat"],
return [["bat"],["nat","tan"],["ate","eat","tea"]].
 */