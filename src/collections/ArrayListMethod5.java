package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethod5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("ivan");
        arrayList1.add("Marya");
        arrayList1.add("ivan");
        arrayList1.add("Genya");

        List <Integer> list1 = List.of(3,8,13); // list.of нельзя изменять путем list.add(100)
        System.out.println(list1);
        List <String> list2 = List.copyOf(arrayList1);
        System.out.println(list2);




//        System.out.println(arrayList1);
////        List <String> mylist = arrayList1.subList(1,4);
////        System.out.println(mylist);
//        Object[] array = arrayList1.toArray();
//        String [] array2 = arrayList1.toArray(new String[0]);
//        for (String a: array2) {
//            System.out.println(a);
//        }
//
//        ArrayList<String> arrayList2 = new ArrayList<>();
//        arrayList2.add("Marya");
//        arrayList2.add("ivan");
//        arrayList2.add("Igor");
//        arrayList1.retainAll(arrayList2);

//        boolean result = arrayList1.containsAll(arrayList2);
//        System.out.println(result); // false

    }
}
