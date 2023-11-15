package Pract11;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CompareTime {
    int y;
    int m;
    int d;
    void Compare(){
        Calendar cal = Calendar.getInstance();
        if(y == cal.get(Calendar.YEAR) && m == cal.get(Calendar.MONTH)+1 && d==cal.get(Calendar.DAY_OF_MONTH)){
            System.out.println("You are existing now\n");
        }else if(y > cal.get(Calendar.YEAR) || m > cal.get(Calendar.MONTH)+1 || d>cal.get(Calendar.DAY_OF_MONTH)){
            System.out.println("You're in future! How did you do that?!\n");
        }else{
            System.out.println("You are in past! Try not to change future, please!\n");
        }
    }
    void writeDate(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Write down year, month and day as numbers: ");
        y = sc.nextInt();
        m = sc.nextInt();
        d = sc.nextInt();
    }
}
