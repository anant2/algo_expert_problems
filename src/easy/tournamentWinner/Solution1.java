package easy.tournamentWinner;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Solution1 {

    public static void main(String[] args) {
        String [] [] competitions = { {"HTML", "C#"},
                                      {"C#", "Python"},
                                      {"Python", "HTML"}};
        int result [] = {0, 0, 1};

        Map<String,Integer> map = new HashMap<>();

        for(int i = 0; i < competitions.length; i++) {
            if (result[i] == 0) {
                if(map.containsKey(competitions[i][1])) {
                    map.put(competitions[i][1], map.get(competitions[i][1]) + 3);
                } else {
                    map.put(competitions[i][1],3);
                }
            } else {
                if(map.containsKey(competitions[i][0])) {
                    map.put(competitions[i][0], map.get(competitions[i][0]) + 3);
                } else {
                    map.put(competitions[i][0],3);
                }
            }
        }

        int maxValueInMap=(Collections.max(map.values()));  // This will return max value in the HashMap
        for (Map.Entry<String, Integer> entry : map.entrySet()) {  // Iterate through HashMap
            if (entry.getValue()==maxValueInMap) {
                System.out.println(entry.getKey());     // Print the key with max value
            }
        }


     }

}
