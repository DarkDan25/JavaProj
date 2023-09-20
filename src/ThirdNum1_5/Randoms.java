package ThirdNum1_5;
import java.util.Random;
import java.util.Scanner;

public class Randoms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Type size of array");
        int n=sc.nextInt();
        // Check if user type correct num
        if (n>0){
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]= rand.nextInt(n+1);
            }
            for(int i=0;i<n;i++)
            {
                System.out.print(arr[i]);
            }
        }
        else{
            main(args); // Ask again if user type wrong number
        }
    }
}
