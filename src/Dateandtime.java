import java.util.*;
public class Dateandtime {
     static List<String>days = Arrays.asList("SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY");
     public static String getDay(String day,String month,String year){
         int y = Integer.parseInt(year);
         int m = Integer.parseInt(month);
         int d = Integer.parseInt(day);
         Calendar c = Calendar.getInstance();
         c.set(y,m-1,d);
         int p = c.get(Calendar.DAY_OF_WEEK);
         String s = days.get(p - 1);
         return s;
     }


    public static void main(String  [] args){
    String day,month,year;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the date");
     day = sc.nextLine();
     System.out.println("enter the number of the month");
     month = sc.nextLine();
     System.out.println("enter the year");
     year = sc.nextLine();
     String answer = getDay(day,month,year);
     System.out.println(answer);


    }
}
