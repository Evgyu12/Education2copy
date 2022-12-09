package collections.queue_interface;

import java.util.Objects;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class PriorityQueueEx2 {
    public static void main(String[] args) {
        PriorityQueue <Students> pr = new PriorityQueue<>();
        Students st1 = new Students("Zaur", 2);
        Students st2 = new Students("Igor", 1);
        Students st3 = new Students("Ivan", 3);
        Students st4 = new Students("Anton", 5);
        Students st5 = new Students("Lena", 4);

        pr.add(st1);
        pr.add(st2);
        pr.add(st3);
        pr.add(st4);
        pr.add(st5);
        System.out.println(pr.poll());
        System.out.println(pr.poll());
        System.out.println(pr.poll());
        System.out.println(pr.poll());
        System.out.println(pr.poll());


    }
}
class Students implements Comparable <Students> {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return course == students.course;
    }

    @Override
    public int compareTo(Students o) {
        return this.course-o.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }
}

