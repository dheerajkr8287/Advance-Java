package Oops;
class Dad {

    public  String plot()
    {
        return "200 gaj ka plot";
    }

}

class Khushi extends Dad{
    public void demo()
    {
        plot();
    }

    public  String plot()
    {
        return "khushi coffee point";
    }


}

public class inheritence
{
    public static void main(String[] args) {
        Khushi khushi=new Khushi();
        System.out.println(khushi.plot());

    }
}