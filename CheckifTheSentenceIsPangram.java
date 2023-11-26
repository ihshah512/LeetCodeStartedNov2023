package Hashsing;
import java.util.*;
import java.util.Set;
public class CheckifTheSentenceIsPangram {

    public static boolean isPangram(String s){

        if(s.length() < 26){
            return false;
        }
       Set<Character> charSet = new HashSet<>();
       for(int i = 0; i < s.length(); i++){
            charSet.add(s.charAt(i));
           if(charSet.size() == 26){
               return true;
           }
       }

       return false;
    }
public static void main(String[] args){

    String str = "thequickbrownfoxjumpsoverthelazydog";
    String str2 = "leetcode";
   boolean re = isPangram(str);
   isPangram(str);
  System.out.print(re);
   boolean re2 = isPangram(str2);
   isPangram(str2);
    System.out.print(re2);
    }
}
/*
mplementation:
SET
Set:
Uniqueness:

Does not allow duplicates: A Set does not allow duplicate elements. If you attempt to add an element that is already present, the Set will ignore the duplicate.
Implementation:

Various implementations are available, such as HashSet, LinkedHashSet, and TreeSet.
HashSet: Provides constant-time performance for basic operations but makes no guarantees about the order of elements.
LinkedHashSet: Maintains the order of elements as they are inserted.
TreeSet: Maintains elements in a sorted order.
MAP:
HashMap:
Key-Value Pairs:

Stores key-value pairs: A HashMap stores data as key-value pairs. Each key must be unique, but different keys can have the same value.
Implementation:

HashMap is a basic implementation of the Map interface.
Other implementations include LinkedHashMap, TreeMap, and others.
LinkedHashMap: Maintains the order of key-value pairs as they are inserted.
TreeMap: Sorts key-value pairs based on the natural ordering of keys or a custom comparator.
 */
