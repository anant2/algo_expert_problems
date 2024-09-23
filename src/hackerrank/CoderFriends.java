package hackerrank;

import java.util.Map;

public class CoderFriends {

    public static String winner(String erica, String bob) {



        int sErica = getScore(erica);
        int sBob = getScore(bob);
        if(sErica > sBob) return "Erica";
        else if(sErica < sBob) return "Bob";
        else return "Tie";
    }

    private static int getScore(String values) {
        Map<String, Integer> map = Map.of("E",1,"M",2,"H",5);
        int score = 0;
        String [] difficuly = values.split("");
        for(String grade: difficuly) {
            score += map.get(grade);
        }
        return score;
    }

    public static void main(String[] args){
    System.out.println(winner("HME", "HEH"));
    }

}
