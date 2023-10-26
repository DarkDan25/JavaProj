package Pract_9;

public class TestStud {
    public static void main(String[] args) {
        StudList lst = new StudList();
        lst.CreateStudList(10);
        lst.ShowIDs();
        lst.insertionSort(lst.IDs);
        System.out.println(" ");
        lst.ShowIDs();
        System.out.println(" ");
        lst.ShowStudents();
        SortByGPA gpa = new SortByGPA();
        gpa.QSort(lst.StudList,0,lst.StudList.length-1);
        System.out.println(" ");
        lst.ShowStudents();
    }
}
