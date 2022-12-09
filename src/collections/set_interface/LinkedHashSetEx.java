package collections.set_interface;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {
    public static void main(String[] args) {
        LinkedHashSet <Integer> lHS = new LinkedHashSet<>();
        lHS.add(5);
        lHS.add(3);
        lHS.add(1);
        lHS.add(8);
        lHS.add(10);
        System.out.println(lHS);
        lHS.remove(8);
        System.out.println(lHS);
        System.out.println(lHS.contains(8));
        System.out.println(lHS.contains(10));
    }
}
