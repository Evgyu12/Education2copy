package collections.set_interface;

import java.util.HashSet;
import java.util.Set;

public class HaseSetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Zaur");
        set.add("Oleg");
        set.add("Maryna");
        set.add("Igor");
       for (String s:set){
           System.out.println(s);
       }
        System.out.println(set.isEmpty());
        System.out.println(set.contains("Misha"));
        System.out.println(set.contains("Maryna"));
    }
}
