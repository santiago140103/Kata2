package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        
        String [] data = {"Hola", "soy", "Santi", "soy", "tengo", "19", "años", "años"};
        
        Histogram histo = new Histogram(data);
        
        Map<String, Integer> histogram = histo.getHistogram();
        
        for (String key: histogram.keySet()) {
            System.out.println(key + " ==> " + histogram.get(key));
        }
    }
    
}
