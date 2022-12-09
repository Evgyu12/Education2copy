package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "Zaur Tregulov");
        map1.put(3568, "Ivan Ivanov");
        map1.put(2345, "Marya Sidorova");
        map1.put(9842, "Anton Antonov");
        map1.putIfAbsent(1000, "Oleg Ivanov");
        System.out.println(map1);
        System.out.println(map1.get(1000));
        map1.remove(2345);
        System.out.println(map1);
        System.out.println(map1.containsValue("Ivan Ivanov"));
        System.out.println(map1.containsKey(500));
        System.out.println(map1.keySet());
        System.out.println(map1.values());
    }
}
