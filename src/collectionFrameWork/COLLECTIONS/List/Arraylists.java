package COLLECTIONS.List;

import java.util.*;

//------------->  without lambda expression--------------
//class  myStringComparator implements Comparator<String>{
//
//    @Override
//    public int compare(String o1, String o2) {
//        //"OK" ,"BYE"  asc  o1.length()-o2.length()
//        return o1.length()-o2.length() ;
//    }
//}


//FOR INTEGER

class myIntegerCompartor implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        //5,3-->  asc   o1-o2
        //3,5 --> asc   o1-o2
        //return o1-o2;
        //5,3 desc o2-o1
        return  o2-o1;

    }
}

class Student {
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
}


public class Arraylists {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
//        System.out.println(list);
//        //add only forward the element `
//        list.add(2,333);
//        System.out.println(list);
//        //set replace the elements at that postion
//        list.set(2,555);
//        System.out.println(list);
//
//        for(int i:list){
//            System.out.println(i);


//        System.out.println(list.getClass().getName());
//        //asList do not change add new index value it only change existing index value
//        List<String> list1= Arrays.asList("monday","tuesday");
//        System.out.println(list1.getClass().getName());
////        list1.add("wednesday"); //error
//        list1.set(1,"wesnesday");
//        System.out.println(list1);
//
//
//        String[] array={"apple","ball","cat"};
//        List<String> list2=Arrays.asList(array);
//        System.out.println(list2.getClass().getName());
//        List<String> list4=new ArrayList<>(list2);
//        list4.add("Mango");
//        System.out.println(list4);
//

//List.of():it do not even replace or add new elemets
//        List<Integer> list4=List.of(1,2,3,45,6);
//        list4.set(1,22);

        //addALl():it take collection into it
//        List<Integer> list5 = List.of(1,2,3,4,5,6, 7);
//        list.addAll(list5);
//        System.out.println(list);

//        list.remove(Integer.valueOf(11 ));
//        System.out.println(list);


//        Object[] array1 = list.toArray();
//        Integer[] array2 = list.toArray(new Integer[0]);
//        System.out.println("this is array conversion by list");
//        for(int i:array2){
//            System.out.println(i);
//        }


//        Collections.sort(list);
//        list.sort(null);
//        System.out.println(list);

// COMPARATOR
        List<Integer> l1=new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(50);
        l1.add(40);
//        l1.sort(new myIntegerCompartor());
//        System.out.println(l1);
        //--------->using lambda expression
//        l1.sort((a,b)->a-b);
//        System.out.println(l1);


//        List<String> words=Arrays.asList("banana","apple","date");
//        words.sort(new myStringComparator());
//        System.out.println(words);
        //LAMDA EXPRESSION
//        words.sort((a,b)->b.length()-a.length());
//        System.out.println(words);


        List<Student> students=new ArrayList<>();
        students.add(new Student("alice",3.5));
        students.add(new Student("bob",3.7));
        students.add(new Student("alwx",4));
        students.add(new Student("charlie",3.9));
        students.sort(((o1, o2) -> {
            if(o2.getGpa()-o1.getGpa()>0){
                return 1;

            }else if (o2.getGpa()-o1.getGpa()<0){
                return -1;
            }else{
//                return 0;
        return o2.getName().compareTo(o1.getName());
            }
        }));

        //:: --> method reference
//        Comparator<Student> comparator = Comparator.comparing(Student::getGpa);
//        students.sort(comparator.reversed().thenComparing(Student::getName));
        for(Student s:students){
            System.out.println(s.getName()+":"+s.getGpa());

        }





    }
}
