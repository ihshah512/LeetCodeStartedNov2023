import java.util.*;
//We will use twoPoint method here
public class CombineTwoSortedArrays {

    public static ArrayList<Integer> combineArray(int[] arrOne, int[] arrTwo){

        int ileft = 0;
        int jleft = 0;
        int iright = arrOne.length;
        int jright = arrTwo.length;

       ArrayList<Integer> res = new ArrayList<>();

        while((ileft < iright) && (jleft < jright)){

            if(arrOne[ileft] < arrTwo[jleft]){

                res.add(arrOne[ileft]);
                ileft++;
            }else{
                res.add(arrTwo[jleft]);
                jleft++;
            }
        }
        while(ileft < iright){
            res.add(arrOne[ileft]);
            ileft++;
        }
        while(jleft < jright){
            res.add(arrTwo[jleft]);
            jleft++;
        }
        return  res;
    }

    public static void main(String[] args){

        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 5, 6, 8, 10};

      ArrayList<Integer> result = combineArray(arr1, arr2);

            System.out.print(result);



    }

}
