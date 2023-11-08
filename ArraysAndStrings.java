import java.util.*;
public class ArraysAndStrings {

public static void main(String[] args){

    //In java strings are immutable once declared cant changged by default
    //Variable name is pointing to something else
    /*



     */
    /*
    String name = "Imran";
    char charAppend = ',';
    long sTime = System.nanoTime();
    String newStr = name + charAppend;
    long eTime = System.nanoTime();
    long tTime = eTime -sTime;
    System.out.println(newStr + "Immutable string appending took time :" + tTime);
    //varibale name is spoint to another string
     /*Bu  we can create mutable strings in java by using StringBuilder class
    and StringBuffer class. nOTE: FOR MULTI-THREADED application stringBuffer
    should be used for thread safety however fro a single threaded app we can
    use String Builder for a better performacne */

    StringBuilder mutableStr = new StringBuilder("Imran");
   // mutableStr.append(" Shah");
    long startTime = System.nanoTime();
    mutableStr.insert(5, ',');
    long endTime = System.nanoTime();
    long totalTime = endTime - startTime;

    System.out.println(mutableStr + "mutable string appending took time :" + totalTime);

    StringBuffer mutableStrBuffer = new StringBuffer("Imran");
    // mutableStr.append(" Shah");
    long bufferstartTime = System.nanoTime();
    mutableStrBuffer.insert(5, ',');
    long bufferendTime = System.nanoTime();
    long buffertotalTime = bufferendTime - bufferstartTime;
    System.out.println(mutableStrBuffer + "mutable string appending took time " + buffertotalTime);

}


}
