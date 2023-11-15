package Pract11;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Student {
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getSpeciality() {
        return Speciality;
    }

    public void setSpeciality(String speciality) {
        Speciality = speciality;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public Student(String name, String surname, String speciality, int course, String group, float gpa,int d,int m, int y) {
        Name = name;
        Surname = surname;
        Speciality = speciality;
        this.course = course;
        this.group = group;
        this.gpa = gpa;
        this.dayOfBirth=d;
        this.monthOfBirth=m;
        this.yearOfBirth=y;
    }
    Calendar c = Calendar.getInstance();
    String Name;
    String Surname;
    String Speciality;
    int course;
    String group;
    float gpa;
    int dayOfBirth;
    int monthOfBirth;
    int yearOfBirth;

    public int getDayOfBirth() {
        c.set(Calendar.DAY_OF_MONTH,dayOfBirth);
        return c.get(Calendar.DAY_OF_MONTH);
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public int getMonthOfBirth() {
        c.set(Calendar.MONTH,monthOfBirth);
        return c.get(Calendar.MONTH);
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public int getYearOfBirth() {
        c.set(Calendar.YEAR,yearOfBirth);
        return c.get(Calendar.YEAR);
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String toString(String format) {
        switch (format){
            case "short":
                SimpleDateFormat sdfMS = new SimpleDateFormat("M");
                SimpleDateFormat sdfYS = new SimpleDateFormat("y");
                return "Student "+getName()+" "+getSurname()+
                        "\n"+ "Was born in "+ getDayOfBirth() +" "+
                        sdfMS.format(getMonthOfBirth()) + " " + getYearOfBirth()  +"\n"+
                        "Student group is "+getGroup();
            case "long":
                SimpleDateFormat sdfML = new SimpleDateFormat("MMMM");
                SimpleDateFormat sdfYL = new SimpleDateFormat("yyyy");
                return "Student "+getName()+" "+getSurname()+
                        "\n"+ "Was born in "+ getDayOfBirth() +" "+
                        sdfML.format(getMonthOfBirth()) + " " + getYearOfBirth()  +"\n"+
                        "Student group is "+getGroup();
        }return "0";
    }
}
