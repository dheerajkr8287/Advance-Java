package COLLECTIONS.Map;

import EqualsAndHashCode.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class hashandEqualsmethod {


    public static void main(String[] args) {
        HashMap<person,String> map=new HashMap<>();
        person p1=new person("alice",1);
        person p2=new person("bob",2);
        person p3=new person("alice",1);

        map.put(p1,"engineer");  //hashcode 1--> index1
        map.put(p2,"designer");//hashcode 2--> index2
        map.put(p3,"manager");//hashcode 1-> index1-->equals() _replace


        System.out.println("hashmap size"+map.size());
        System.out.println("value of p1"+map.get(p1));
        System.out.println("value of p3"+map.get(p3));


        System.out.println(p1);




        Map<String,Integer> map1=new HashMap<>();
        map1.put("Subham",90);//hashcode 1--> index1
        map1.put("heha",44);//hashcode 2--> index2
        map1.put("Subham",99);//hashcode 1--> index1-->equals-->replace

    }
}

class person{
    private String name;
    private int id;

    public person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj){
            return true;

        }
        if (obj==null){
            return false;

        }
        if (getClass()!=obj.getClass()){
            return false;
        }

        person other=(person) obj;
        return id==other.getId() && Objects.equals(name,other.getName());
    }

    @Override
    public String toString() {
        return "id: "+id+"name :"+name;
    }
}
