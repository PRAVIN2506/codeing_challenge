package Day_6;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Minimum_Number_of_Pushes {
    public static void main(String[] args) {
        String word="pravin";
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<word.length(); i++){
            char c = word.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);

        }
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap =
                new PriorityQueue<>((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        maxHeap.addAll(map.entrySet());
        int count = 0;
        for(int j=1; j <= map.size(); j++){
            Map.Entry<Character, Integer> entry = maxHeap.poll();
            if (j <= 8)  /*calculates pushes for used character that should be priotised first and so on for rest of condition according to priority*/
                count += entry.getValue();
            else if(j > 8 && j <= 16)
                count += entry.getValue()*2;
            else if(j > 16 && j <= 24)
                count += entry.getValue()*3;
            else
                count += entry.getValue()*4;
        }
        System.out.println(count);
    }
}
