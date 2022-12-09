package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("ivan");
        arrayList1.add("Marya");
        arrayList1.add("ivan");
        arrayList1.add("Genya");

        // Iterator<String> iterator = arrayList1.iterator();
        if (arrayList1 != null) {
            for (String a : arrayList1) {
                System.out.println(a);
                if (arrayList1.equals("ivan")){
                    arrayList1.removeAll(arrayList1);
                } else {
                    String error_message = "error_message";
                    System.out.println(arrayList1);
                }
            }
        }
    }
}
