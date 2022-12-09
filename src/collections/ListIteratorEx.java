package collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx {
    public static void main(String[] args) {
        String s = "madam2";
        List <Character> list = new LinkedList<>();
        for (char ch: s.toCharArray()){
            list.add(ch);
        }
        ListIterator <Character> iterator = list.listIterator();
        ListIterator <Character> reversiterator = list.listIterator(list.size());
        boolean isPalendrom = true;
        while (iterator.hasNext() && reversiterator.hasPrevious()){
            if (iterator.next() != reversiterator.previous()){
                isPalendrom = false;
                break;
            }
        }
        if (isPalendrom){
            System.out.println("palendrom");
        }else {
            System.out.println("Not palendrom");
        }
    }
}
