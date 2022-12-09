package collections;

import java.util.ArrayList;

public class ArraylistExample1 {
    public static void main(String[] args) {
        ArrayList <String> al1 = new ArrayList<>();
        al1.add("Zaur");
        al1.add("ivan");
        al1.add("Anton");
        System.out.println(al1);
        ArrayList <String> al2 = new ArrayList<>(200);
        ArrayList <String> al3 = new ArrayList<>(al1);
        System.out.println(al3);
    }
}
