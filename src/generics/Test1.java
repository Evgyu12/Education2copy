package generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List <String> list = new ArrayList <>();
//        list.add("ok");
//        list.add(5);
//        list.add(new StringBuilder("asdasd"));
//        list.add(new Car());
        list.add("Privet");
        list.add("Poka");
        list.add("123");
        list.add("5235");
//        list.add(new Car());


        for (Object o:list){
            System.out.println(o + "Dlina " + ((String)o).length());
        }
    }
}
