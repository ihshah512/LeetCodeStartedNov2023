import java.util.*;
public class NumberofWaystoSplitArray {

    public static int numOfWays(int[] arr){

        int waysCounter = 0;
        int sumFirstSection = 0;
        int sumSecondSection = 0;
        int[] prefixSumArray = new int[arr.length];
        prefixSumArray[0] = arr[0];

        for(int i =1; i < arr.length; i++){

            prefixSumArray[i] = prefixSumArray[i-1]+arr[i];
        }

        for(int j = 0; j < prefixSumArray.length; j++){

         sumFirstSection = prefixSumArray[j];
         sumSecondSection = prefixSumArray[prefixSumArray.length-1-j];

         if(sumFirstSection >= sumSecondSection){

             waysCounter++;
         }

        }

        return waysCounter;
    }


public static void main(String[] args){

    int[] myArr = {10,4,-8,7};

    System.out.print(numOfWays(myArr));

}

}
