import java.util.*;
import java.util.ArrayList;

public class TwoSumWithArrayListReturn {
    public static boolean plaindrom(String str){

        int left = 0;
        int right = str.length()-1;

        while(left < right){

            if(str.charAt(left)!= str.charAt(right)){
                return false;
            }
            ++left;
            --right;
        }

        return true;
    }
    public static ArrayList<Integer> twoSum(int[] arr, int num) {

        ArrayList<Integer> arrList = new ArrayList<>();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            if (arr[left] + arr[right] == num) {
                arrList.add(left);
                arrList.add(right);
                return arrList;
            }

            if (arr[left] + arr[right] > num) {
                --right;
            }

            if (arr[left] + arr[right] < num) {
                ++left;
            }
        }
        arrList.add(0);
        arrList.add(0);
        return arrList;
    }
    public static void main(String[] args){
        //System.out.println(plaindrom("racecar"));
        // System.out.println(plaindrom("acecar"));
        int[] myArr = {1, 2, 4, 6, 8, 9, 14, 15};
        int number = 13;

        ArrayList<Integer> aList = twoSum(myArr, number);
        System.out.println(aList);
    }
}
/*
NOTE: WE cam use same two pointer technique for arrays as well.



 */