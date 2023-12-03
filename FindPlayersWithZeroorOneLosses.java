package Hashsing;
import java.util.*;

public class FindPlayersWithZeroorOneLosses {

    public static List<List<Integer>> findWinners(int[][] matches) {
        Set<Integer> allWinners = new TreeSet<>();
        Set<Integer> allLosers = new TreeSet<>();
        Set<Integer> neverLostAny = new TreeSet<>();
        Set<Integer> justOneLost = new TreeSet<>();
        HashMap<Integer, Integer> loserFre = new HashMap<>();

        for (int i = 0; i < matches.length; i++) {
            int[] subArr = matches[i];
            for (int j = 0; j < subArr.length; j++) {
                int currPlayer = subArr[j];
                if (j == 0) {
                    allWinners.add(currPlayer);
                } else {
                    allLosers.add(currPlayer);
                    loserFre.put(currPlayer, loserFre.getOrDefault(currPlayer, 0) + 1);
                }
                //This is important pece of code thats who we count frequncy of occurance
                if (loserFre.containsKey(currPlayer) && loserFre.get(currPlayer) == 1) {
                    justOneLost.add(currPlayer);
                } else if (justOneLost.contains(currPlayer)) {
                    justOneLost.remove(Integer.valueOf(currPlayer));
                }

            }
        }

        for (int l : allWinners) {
            if (!allLosers.contains(l)) {
                neverLostAny.add(l);
            }
        }
      //  List<Integer> allWinnersList = new ArrayList<>(allWinners);
        //List<Integer> allLosersList = new ArrayList<>(allLosers);
        List<Integer> listNeverLost = new ArrayList<>(neverLostAny);
        List<Integer> listJustOne = new ArrayList<>(justOneLost);

       // Collections.sort(neverLostAny);
      //  Collections.sort(justOneLost);

        List<List<Integer>> result = new ArrayList<>();
        //result.add(allWinnersList);
       // result.add(allLosersList);
        result.add(listNeverLost);
        result.add(listJustOne);

        return result;
    }

    public static void main(String[] args) {
        int[][] matches = {{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}};
        List<List<Integer>> result = findWinners(matches);

        System.out.println("All winners: " + result.get(0));
        System.out.println("All losers: " + result.get(1));
       // System.out.println("Players who never lost a match: " + result.get(2));
      //  System.out.println("Players who lost exactly one match: " + result.get(3));
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