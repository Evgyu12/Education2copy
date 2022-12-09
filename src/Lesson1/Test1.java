package Lesson1;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Zaur");
        list.add("Ivan");
        list.add("Maria");
        System.out.println("Pered sortirovkoi");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("Posle sortirovki");
        System.out.println(list);

    }

}
