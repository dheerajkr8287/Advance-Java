package Oops;

class gadi{
    gadi manufacture(){
        System.out.println("gadi lelo");
        return new gadi();
    }

}
class ford extends gadi{
    @Override
    ford manufacture(){
        System.out.println("ford ki gadi");
        return  new ford();

    }
}



