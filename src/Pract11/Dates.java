package Pract11;

public class Dates {
    public static void main(String[] args) {
        AboutMe me = new AboutMe();
        CompareTime comp = new CompareTime();
        me.showInfo();
        comp.writeDate();;
        comp.Compare();;
        Student st = new Student("Zyablik", "Mizuno","mobile",2,"IKBO-12-22",70,12,1,2004);
        System.out.println(st.toString("long"));
        System.out.println(st.toString("short"));
    }
}
