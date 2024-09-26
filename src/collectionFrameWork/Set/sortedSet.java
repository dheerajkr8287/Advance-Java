package collectionFrameWork.Set;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
 class Student implements Comparable{
    String name;
    Integer id;

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    //positve(first),negative(baad mai) ,zero
    @Override
    public int compareTo(Object o) {
      Student student=(Student) o;
      Integer id=student.getId();
      //this.id-current obj,id->next obj
      if(this.id>id){
          return 1;
      }
      else if(this.id<id){
          return -1;

      }else{
          return 0;
      }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

class Mycomp implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Student s1=(Student) o1;
        Student s2=(Student) o2;
        Integer id1=((Student)o1).getId();
        Integer id2=((Student)o2).getId();
        if(id1>id2){
            return 1;
        }
        else if(id1<id2){
            return -1;

        }else{
            return 0;
        }
    }

    }

public class sortedSet {
    public static void main(String[] args) {
        SortedSet<Student> sortedSet=new TreeSet<>(new Mycomp());
        sortedSet.add(new Student(8,"raj"));
        sortedSet.add(new Student(3,"neer"));
        sortedSet.add(new Student(9,"dhee"));
        sortedSet.add(new Student(4,"kaka"));
        System.out.println(sortedSet);
    }
}
