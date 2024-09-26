package Oops;

//method,method overloading(same method with different parameter with in the same class)

/*

agar hmm different package mai ek class ko dusare class mai use karte time import karna parta hai (import package.class)
same package with different class not have to import
 */
class papa{
    public String ranveer(){
       //System.out.println("papa papa papa");
        return "papa papa papa";
    }
    public String ranveer(String arr){
        return  arr;

    }

    public int ranveer(int a ){
        return a;

    }

    public int ranveer(int a ,int b){
        return a+b;

    }



    public String  gargi(){
        //System.out.println("-----------");
        return  "-----------";
    }

    public String  gargi(String arr){
        return  arr;
    }


}
public class method {
    public static void main(String[] args) {
        papa p=new papa();
        String s=p.ranveer();
        System.out.println(s);
        String s1=p.gargi();
        System.out.println(s1);

        System.out.println("-----obj with para-----");
        String r1=p.ranveer("gargi");
        System.out.println(r1);
        String r2=p.gargi("ranveer");
        System.out.println(r2);

        int r3 = p.ranveer(3);
        System.out.println(r3);

        int r4 = p.ranveer(3,4);
        System.out.println(r4);





    }
}
