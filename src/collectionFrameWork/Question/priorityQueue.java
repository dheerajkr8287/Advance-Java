package collectionFrameWork.Question;

import java.util.Comparator;
import java.util.PriorityQueue;

public class priorityQueue {
    private static  class Student{
        private final String name;
        private final char grade;

        public Student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public char getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return name+":"+grade;
        }

        public static void main(String[] args) {
            PriorityQueue<Student> queue=new PriorityQueue<>(new Comparator<Student>() {
                @Override
                public int compare(Student student, Student t1) {
                    return student.getGrade()-t1.getGrade();
                }
            });

          queue.offer(new Student("kaka",'A'));
            queue.offer(new Student("raja",'D'));
            queue.offer(new Student("aaja",'C'));
            queue.offer(new Student("alex",'E'));
            queue.offer(new Student("pheonx",'A'));

            System.out.println(queue);

            System.out.println("got="+queue.poll());
            System.out.println("got="+queue.poll());
            System.out.println("got="+queue.poll());
            System.out.println("got="+queue.poll());
            System.out.println("got="+queue.poll());
        }
    }
}
