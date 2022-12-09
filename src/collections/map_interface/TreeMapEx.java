package collections.map_interface;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {

//        TreeMap<Students, Double> treeMap = new TreeMap<>();
//        TreeMap<Students, Double> treeMap2 = new TreeMap<>(new Comparator<Students>() {
//            @Override
//            public int compare(Students o1, Students o2) {
//                return 0;
//            }
        TreeMap<Double,Students> treeMap = new TreeMap<>();
        Students st1 = new Students("Zaur", "Tregulov", 4);
        Students st2 = new Students("Evgeniy", "Yugrin", 2);
        Students st3 = new Students("Anton", "Antonov", 1);
        Students st4 = new Students("Marya", "Ivanova", 3);
        Students st5 = new Students("Ivan", "Ivanov", 5);
        Students st6 = new Students("Maksim", "Maksimov", 1);
        Students st7 = new Students("Vitalyi", "Bolshow", 3);

        treeMap.put(5.8,st1);
        treeMap.put(6.4,st2);

        treeMap.put(7.2,st3);

        treeMap.put(7.5,st4);
        treeMap.put(7.9,st5);
        treeMap.put(8.2,st6);
        treeMap.put(9.1,st7);



        Students st8 = new Students("Vitalyi", "Bolshow", 3);
        System.out.println(treeMap.containsKey(st8));
//        System.out.println(treeMap.descendingMap());
//        System.out.println(treeMap.tailMap(7.3));
//        System.out.println(treeMap.headMap(7.3));
//        System.out.println(treeMap.lastEntry());
//        System.out.println(treeMap.firstEntry());
//        System.out.println(treeMap.get(6.4));
//        treeMap.remove(5.8);
//        System.out.println(treeMap);


    }
}
