package Pract_9;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Random;

public class StudList {
    public Student[] StudList;
    public int[] IDs;
    Format form = new DecimalFormat("0.00");
    void CreateStudList(int n){
        StudList = new Student[n];
        IDs = new int[n];
        Random r = new Random();
        for(int i=0;i<n;i++){
            IDs[i] = r.nextInt(1,10000);
            StudList[i] = new Student(IDs[i],r.nextDouble(0,100),"Stud"+i);
        }
    }
    public void ShowStudents(){
        for(int i =0; i<StudList.length;i++){
            System.out.println(StudList[i].getId()+" "+form.format(StudList[i].getGpa())+" "+StudList[i].getName());
        }
    }
    public void ShowIDs(){
        for(int i : IDs){
            System.out.print(i+" ");
        }
    }
    public void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
