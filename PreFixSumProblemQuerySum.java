import java.util.*;

public class PreFixSumProblemQuerySum {

public static boolean[] querySum(int[] arr, int[][] query, int sumLimit){

    int[] prefixArr = new int[arr.length];
    boolean[] returnBoolArr = new boolean[query.length];
    prefixArr[0] = arr[0];
        for(int i = 1; i < arr.length; i++){
            prefixArr[i]=prefixArr[i-1]+arr[i];// prefiex[2]=prefix[0]+nums[1]
    }

for(int j = 0; j < query.length; j++){

        int startOfSubArray = query[j][0];
        int endOfSubArray = query[j][1];
        int curr = prefixArr[endOfSubArray]-prefixArr[startOfSubArray]+arr[startOfSubArray];

       returnBoolArr[j] = curr < sumLimit;

}
    return returnBoolArr;
}

public static void main(String[] args){

    int[] myArr = {1, 6, 3, 2, 7, 2};
    int limit = 13;
    int[][] q = {{0,3},{2,5},{2,4}};

    boolean[] returnArr = querySum(myArr,q,limit);

    for(boolean i : returnArr){

        System.out.print(i + " ");
    }



}
}
