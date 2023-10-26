package Pract_9;

public class TestStud {
    public static void main(String[] args) {
        StudList lst = new StudList();
        lst.CreateStudList(10);
        lst.ShowStudents();
        lst.ShowIDs();
        lst.insertionSort(lst.IDs);
        System.out.println("cv");
        lst.ShowIDs();
    }
}
