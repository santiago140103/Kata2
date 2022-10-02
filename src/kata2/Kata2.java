package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        
        int[] data = {1, 3, 5, 3, 4, 2, 8, 8, 8, 7, 4, 9, 3, 2, 1};
        
        Map<Integer, Integer> hist = new HashMap<Integer, Integer>();
        
        for (int i=0; i<data.length;i++) {
            if (hist.containsKey(data[i])) {
                hist.put(data[i], hist.get(data[i])+1);
            } else {
                hist.put(data[i],1);
            }
        }
        
        for (int key: hist.keySet()) {
            System.out.println(key + " ==> " + hist.get(key));
        }
    }
    
}
