package collections;

import generics.igra.Students;

import java.util.LinkedList;

public class LinkedListEx1 {
    public static void main(String[] args) {
        Students2 st1 = new Students2("Genya",2);
        Students2 st2 = new Students2("Ivan",4);
        Students2 st3 = new Students2("Marya",1);
        Students2 st4 = new Students2("Zaur",5);
        LinkedList <Students2> students2LinkedList = new LinkedList<>();
        students2LinkedList.add(st1);
        students2LinkedList.add(st2);
        students2LinkedList.add(st3);
        students2LinkedList.add(st4);
        System.out.println("Linked list " + students2LinkedList);
        System.out.println(students2LinkedList.get(2));
        Students2 st5 = new Students2("Igor",3);
        students2LinkedList.add(st5);
        System.out.println(students2LinkedList);
        Students2 st6 = new Students2("Anton",6);
        students2LinkedList.add(1,st6);
        System.out.println(students2LinkedList);
        students2LinkedList.remove(3);
        System.out.println(students2LinkedList);




    }
}
class Students2 {
    String name;
    int course;
    public Students2 (String name, int course){
        this.name=name;
        this.course=course;
    }
    @Override
    public String toString() {
        return "Students2{" +
                "name='" + name + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}
