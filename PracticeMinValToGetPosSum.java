import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.*;

public class PracticeMinValToGetPosSum {
            public static int minPosSum(int[] arr) {

                int[] prefixArr = new int[arr.length];

                prefixArr[0] = arr[0];
                int min = arr[0];
                for (int i = 1; i < prefixArr.length; i++) {

                    prefixArr[i] = prefixArr[i - 1] + arr[i];

                    if(min > prefixArr[i]){
                        min = prefixArr[i];
                    }
                }
            if(min >= 1){
                return min;
            }else{
                return  ((min*-1)+1);
            }
   }
           public static void main(String[] args){

                int[] myArr = {-3,2,-3,4,2};
                int[] myArr2 = {1,2};
                int[] myArr3 = {1,-2,-3};

              System.out.println(minPosSum(myArr));
                System.out.println(minPosSum(myArr2));
                System.out.println(minPosSum(myArr3));



    }
}
