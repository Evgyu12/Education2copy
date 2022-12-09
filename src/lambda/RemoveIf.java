package lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("privet");
        al.add("poka");
        al.add("okay");
        al.add("y4im java");
        al.add("A imenno lambda");
       // al.removeIf(element ->element.length()<5);
        Predicate<String> p = element ->element.length()<5;
        al.removeIf(p);
        System.out.println(al);

    }
}
