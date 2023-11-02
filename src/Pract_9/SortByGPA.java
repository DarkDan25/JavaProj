package Pract_9;

public class SortByGPA implements Comparator{
    @Override
    public void QSort(Student[] k, int start, int end) {
        if (start < end)
        {
            int pivotIndex = partition(k, start, end);
            QSort(k, start, pivotIndex - 1);
            QSort(k, pivotIndex + 1, end);
        }
    }
    void swap(Student arr[],int i,int j) {
        Student temporary = arr[i];
        arr[i]=arr[j];
        arr[j]=temporary;
    }
    public int partition(Student[] arr, int start, int end) {
        int i = (start - 1);
        for (int j = start; j < end; j++)
        {
            if (arr[j].getGpa() > arr[end].getGpa())
            {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, end);
        return (i + 1);
    }
}
