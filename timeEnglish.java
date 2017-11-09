import java.util.Scanner;
public class timeEnglish{
    /**
     * Computes the english return value of a give hour and minute time 
     * @param hour 1-12
     * @param minute 0-59 
     * @return completed string statement
     */
    public static String getTimeName(int hour, int minute){
        String hours=Integer.toString(hour);
        String minutes=Integer.toString(minute);
        if(minute==0){
            return hours+" o'clock";
        }
        else if(minute==30){
            return "Half past "+hours+":00";
        }
        else if(minute==15){
            return "Quarter after "+hours+":00";
        }
        else if(minute==45){
            hour++;
            hours=Integer.toString(hour);
            return "Quarter til "+hours+":00";
        }
        else{
            return minutes+" minutes past "+hours+":00";
        }
    }
    public static void main(String []args){
        String englishTime=null;
        Scanner in=new Scanner(System.in);
        System.out.println("Please only enter the hour 1-12, followed by a space with the minutes 0-59.");
        int hour=in.nextInt();
        int minute=in.nextInt();
        englishTime=getTimeName(hour, minute);
        System.out.println(englishTime);
    }    
}
        