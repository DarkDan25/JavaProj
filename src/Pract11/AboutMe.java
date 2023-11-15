package Pract11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AboutMe {
    void setDate(Calendar cal){
        cal.set(Calendar.MONTH,Calendar.NOVEMBER);
        cal.set(Calendar.HOUR,10);
        cal.set(Calendar.MINUTE, 40);
        cal.set(Calendar.SECOND,0);
    }
    void showInfo(){
        String name = "Zyablik (Жуков Данила ИКБО-12-22)";
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss E d M yyyy");
        Calendar cal = Calendar.getInstance();
        setDate(cal);
        System.out.println("Name of developer: "+ name);
        System.out.println("Date and time of giving the task: "+ sdf.format(cal.getTime()));
        System.out.println("Date and time of finishing the task: "+sdf.format(d)+"\n");
    }
}
