package collections.map_interface;

import java.util.LinkedHashMap;

public class LinkedHashMapEx {
    public static void main(String[] args) {
        LinkedHashMap <Double, Students> linkedHashMap
                = new LinkedHashMap<>(16,0.75f,true);
        Students st1 = new Students("Zaur", "Tregulov", 4);
        Students st2 = new Students("Evgeniy", "Yugrin", 2);
        Students st3 = new Students("Anton", "Antonov", 1);
        Students st4 = new Students("Marya", "Ivanova", 3);


        linkedHashMap.put(5.8,st1);
        linkedHashMap.put(6.4,st2);

        linkedHashMap.put(7.2,st3);

        linkedHashMap.put(7.5,st4);
        System.out.println(linkedHashMap.get(5.8));
        System.out.println(linkedHashMap.get(7.5));
        System.out.println(linkedHashMap);

    }
}
