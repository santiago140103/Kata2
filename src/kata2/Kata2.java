package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        
        int[] data = {1, 3, 5, 3, 4, 2, 8, 8, 8, 7, 4, 9, 3, 2, 1};
        
        Histogram histo = new Histogram(data);
        
        Map<Integer, Integer> histogram = histo.getHistogram();
        
        for (int key: histogram.keySet()) {
            System.out.println(key + " ==> " + histogram.get(key));
        }
    }
    
}
