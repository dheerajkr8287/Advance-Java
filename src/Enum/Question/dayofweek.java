package Enum.Question;

public class dayofweek {
    public enum Day{
        MONDAY(true),TUESDAY(true),WEDNESDAY(true),
        THURSDAY(true),FRIDAY(true),SATURDAY(false),SUNDAY(false);

        private  final boolean isWeekday;

        Day(boolean isWeekday) {
            this.isWeekday = isWeekday;
        }

        public String  getType(){
            return isWeekday?"weekday":"Weekend";
        }
    }
    public static void main(String[] args) {
        for(Day value:Day.values()){
            System.out.println(value+":"+value.getType());
        }

    }
}
