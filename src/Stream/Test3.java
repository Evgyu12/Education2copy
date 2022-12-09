package Stream;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int [] array = {5, 9, 3, 8, 1};
//        Arrays.stream(array).forEach(elemet ->{elemet*=2;
//            System.out.println(elemet);});
//        Arrays.stream(array).forEach(elemet ->
//            System.out.println(elemet));
//        Arrays.stream(array).forEach(System.out::println);
        Arrays.stream(array).forEach(Utills::myMethod);

    }
}
class Utills {
    public static void myMethod (int a){
        a=a+5;
        System.out.println("Element = " + a);
    }
}
