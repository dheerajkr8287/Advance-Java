package COLLECTIONS.Map;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Student  implements Comparable<Student>{
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,gpa);
    }


    @Override
    public boolean equals(Object o) {
        if (this==o) return true;
        if (o==null || getClass()!=o.getClass()) return false;
        Student student=(Student) o;
        return Double.compare(gpa,student.gpa)==0 &&Objects.equals(name,student.name);
    }

    // 4.compareTo(3)  --> 4,3

    @Override
    public int compareTo(Student o) {
        return Double.compare(o.getGpa(),this.getGpa());
    }
}


public class  ComparableDemo {
    public static void main(String[] args) {

        List<Student> students=new ArrayList<>();
        students.add(new Student("chale",8.8));
        students.add(new Student("alex",7.8));

        students.add(new Student("aele",9.0));
        students.add(new Student("vove",1.8));
        students.sort(null);

        System.out.println(students);



    }
}
