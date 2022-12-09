package collections.set_interface;

import java.util.Objects;
import java.util.TreeSet;

public class TreeSetEx2 {
    public static void main(String[] args) {
        TreeSet <Students> treeSet = new TreeSet<>();
        Students st1 = new Students("Zaur", 2);
        Students st2 = new Students("Igor", 1);
        Students st3 = new Students("Ivan", 3);
        Students st4 = new Students("Anton", 5);
        Students st5 = new Students("Lena", 4);
        treeSet.add(st1);
        treeSet.add(st2);
        treeSet.add(st3);
        treeSet.add(st4);
        treeSet.add(st5);
        Students st6 = new Students("Oleg", 2);
        System.out.println(treeSet);
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        System.out.println(treeSet.headSet(st6));
        System.out.println(treeSet.tailSet(st6));
        Students st7 = new Students("Oleg", 4);
        System.out.println(treeSet.subSet(st6,st7));
        System.out.println(st1.equals(st6));
        System.out.println(st1.hashCode()==st6.hashCode());

    }
}
class Students implements Comparable <Students>{
    String name;
    int course;

    public Students(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public int compareTo(Students o) {
        return this.course-o.course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return course == students.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }
}
