import java.util.*;
public class LeftSectionRightSectionComapre {

    public static int numOfWays(int[] arr){

        int waysCounter = 0;
        int sumFirstSection = 0;
        int sumSecondSection = 0;

        int total = arr[0];
        for(int i =1; i < arr.length; i++){

           total+=arr[i];
           arr[i]=total;
        }

        for(int j = 0; j < arr.length; j++){

            sumFirstSection = arr[j];
            sumSecondSection = arr[arr.length-1-j];

            if(sumFirstSection >= sumSecondSection){

                waysCounter++;
            }

        }

        return waysCounter;
    }


    public static void main(String[] args){

        int[] myArr = {10,4,-8,7,7,7};

        System.out.print(numOfWays(myArr));

    }

}
