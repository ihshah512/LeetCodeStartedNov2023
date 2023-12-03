package Hashsing;
import java.util.*;
public class FindPlayersWithZeroorOneLosses {

    public static void findWinners(int[][] matches) {

List<List<Integer>> returnList = new ArrayList<>();
    //Declare a Set for all winners; choosing set to avoid dublicaitons
     List<Integer> allWinners = new ArrayList<>();
     List<Integer> allLosers = new ArrayList<>();
     Set<Integer> neverLostAny = new TreeSet<>();
     List<Integer> justOneLost = new ArrayList<>();
     HashMap<Integer, Integer> loserFre = new HashMap<>();

    for(int i = 0; i < matches.length; i++){
        int[] subArr = matches[i];
        for(int j = 0; j < subArr.length; j++){
            int currPlayer = subArr[j];
            if(j == 0) {
                allWinners.add(currPlayer);
            }else{
                allLosers.add(currPlayer);
                loserFre.put(currPlayer, loserFre.getOrDefault(currPlayer, 0)+1);
            }
            for(Map.Entry<Integer,Integer> entry : loserFre.entrySet()){

                if(entry.getKey() == 1){
                    justOneLost.add(currPlayer);
                }
            }

        }
    }
        for(int l : allWinners){
            if(! allLosers.contains(l)){
                neverLostAny.add(l);
            }
        }




        System.out.println("All winners");
    for(int i: allWinners){
        System.out.print(i +" ,");
    }
        System.out.println();
        System.out.println("All lossers");
    for(int j : allLosers){
        System.out.print(j+ " ,");
    }
        System.out.println();
        System.out.println("Player never lost match");
        for(int o : neverLostAny){
            System.out.print(o+" ,");
        }

        System.out.println();
        System.out.println("Player only one match lost");
        for(int p : justOneLost){
            System.out.print(p+" ,");
        }
    }

    public static void main(String[] args){

    int[][] matches = {{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}};
    findWinners(matches);


    }
}
/*
you are given an integer array matches where matches[i] = [winneri, loseri] indicates that the player winneri defeated player loseri in a match.
Return a list answer of size 2 where:
answer[0] is a list of all players that have not lost any matches.
answer[1] is a list of all players that have lost exactly one match.
The values in the two lists should be returned in increasing order.
Note:
You should only consider the players that have played at least one match.
The testcases will be generated such that no two matches will have
the same outcome.
 */