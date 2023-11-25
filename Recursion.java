import java.util.*;
import java.util.ArrayList;

public class Recursion {

    public static int factorial(int n){

        if(n<=1)
        {
            return 1;
        }

        return n*factorial(n-1);
    }

    public static boolean primeNum(int p){
        if(p == 1){return false;}
        if(p == 2 || p == 3){ return true;}
        int count = 2;
        for(int i = 2; i <=p/2; i++){
            if(p%i == 0){
                ++count;
          }
       }
  if(count > 2){
      return true;
  }else{
      return false;
  }
  }

    public static void primePrint(int p){

        ArrayList<Integer> resultArray = new ArrayList<>();
        if(p == 1){System.out.println(p + "is not prime");}
        if(p == 2){System.out.println(p + "is prime");}
        if(p == 3){System.out.println(p + " " + (p-1) + " are prime");}
        if(p > 3){
            resultArray.add(2);
            resultArray.add(3);

            for(int i = 4; i <=p; ++i){
                boolean isPrime = true;
               for(int j = 2; j <= (p); ++j){

                   if(i%j==0){
                       isPrime =false;
                       break;
                   }
                   if(!isPrime){

                    continue;
                   }else{
                       resultArray.add(i);

                   }
               }


            }

            for(int s : resultArray){
                System.out.println(s + " ");
            }
        }
        }

    public static void main(String[] args){

        //int res = factorial(2);
       // boolean res2 = primeNum(3);
        primePrint(20);
       // System.out.println(res);
       // System.out.println(res2);
    }

}
