package kata2;

import java.util.HashMap;
import java.util.Map;

public class Histogram {
    private final int[] data;

    public Histogram(int[] data) {
        this.data = data;
    }
    
    public Map<Integer,Integer> getHistogram() {
        
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<data.length;i++) {
            map.put(data[i], map.containsKey(data[i]) ? map.get(data[i]) + 1 : 1);
        }
        return map;
        
    }
    
}
