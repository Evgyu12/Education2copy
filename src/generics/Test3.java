package generics;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<? extends Number> list30 = new ArrayList<Integer>();

        List<?> list = new ArrayList<>();
        List<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(3.15);
        list1.add(3.16);
        showListInfo(list1);
        List<String> list2 = new ArrayList<>();
        list2.add("Privet");
        list2.add("Poka");
        list2.add("Ky");
        showListInfo(list2);

        ArrayList <Double> ald = new ArrayList<>();
        ald.add(3.14);
        ald.add(3.15);
        ald.add(3.16);
        System.out.println(summ(ald));

        ArrayList <Integer> ald2 = new ArrayList<>();
        ald2.add(34);
        ald2.add(35);
        ald2.add(36);
        System.out.println(summ(ald2));

        ArrayList <String> ald3 = new ArrayList<>();// не принимает в параметры стринг потому что Number
        ald2.add(34);
        ald2.add(35);
        ald2.add(36);
        System.out.println(summ(ald2));

    }

    static void showListInfo(List<?> list) {
        System.out.println("Moi list sodergit next elements" + list);
    }

    public static double summ(ArrayList<? extends Number> al) {
        double summ = 0;
        for (Number n : al) {
            summ += n.doubleValue();
        }
        return summ;
    }

}
