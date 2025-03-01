package InnerClass.LocalInnerClass;

public class Hotel {
    private String name;
    private int totalRooms;
    private  int reservedRooms;
    public Hotel(int totalRooms, String name, int reservedRooms) {
        this.totalRooms = totalRooms;
        this.name = name;
        this.reservedRooms = reservedRooms;
    }

    public void reserveRoom(String guestName,int numOfRooms){
        class ReservationValidator{
            boolean validate(){
                if (guestName==null || guestName.isBlank()){
                    System.out.println("Guest name can not be empty");
                    return false;
                }
                if (numOfRooms<0){
                    System.out.println("no of rooms should be positive ");
                    return false;

                }
                if (reservedRooms+numOfRooms>totalRooms){
                    System.out.println("Not enough rooms available");
                    return  false;
                }
                return true;
            }
        }


        ReservationValidator validator=new ReservationValidator();
        if(validator.validate()){
            reservedRooms+=numOfRooms;
            System.out.println("Reservation confirmed for"+guestName+"for"+numOfRooms+"rooms ");
        }else {
            System.out.println("Reservation failed");
        }
    }





}
