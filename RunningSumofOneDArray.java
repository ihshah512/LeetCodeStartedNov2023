import java.util.*;
public class RunningSumofOneDArray {
    public static int[] returnRunningSum(int[] arr){
        int n = arr.length;
        int[] returnArr = new int[n];
        int runSum = arr[0];
        returnArr[0] = runSum;

        for(int i = 1; i < n; i++){

            returnArr[i] = returnArr[i-1]+arr[i];
        }
        return returnArr;
    }
    public static void main(String[] args){
    int[] myArr ={1,2,3,4};
    int[] returnArr = returnRunningSum(myArr);
    for(int i : returnArr){
        System.out.print(i + " ");
    }
    }
}
