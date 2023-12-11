package Hashsing;
import java.util.*;
public class ContiguousArray {
    public static void findMaxLength(int[] nums) {
        int maxLen = 0;
    for(int i = 0; i < nums.length; i++) {
        int zeroLen = 0;
        int oneLen = 0;
        for(int j = i; j < nums.length; j++){
            if(nums[j]==0){
                zeroLen++;
            }else{
                oneLen++;
            }
            System.out.println("zeros-> " + zeroLen);
            System.out.println("ones-> " + oneLen);
            if(zeroLen == oneLen){
                maxLen = Math.max(maxLen, j-i+1);
                System.out.println("MaxLen -> " + maxLen);
                System.out.println("j-i+1 -> " + j + " - " + i + " = " + (j-i+1));
                System.out.println("j-i+1 -> " + (j-i+1));
            }

        }
    }
       // return maxLen;
    }
    public static void main(String[] args){

        int[] num = {0,1,0,1};
        findMaxLength(num);
    }
}
