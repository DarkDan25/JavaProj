package FirstNum;
import java.math.BigInteger;
import java.util.Scanner;
public class FirstProgr {
    public static void FirstPractNum1(){
        System.out.println("First task");
        float sum=0;
        int n =0; //length of array
        float avg = 0; //For average value of array
        Scanner sc = new Scanner(System.in); //Need for (in-)output system
        //Filling array with numbers and count it's summary
        System.out.println("Enter length of your array");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Type "+n+" int numbers");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        avg = sum/n; //Average value of array
        System.out.println("Sum of array's values: "+sum+"\nAverage value of array: "+avg);
    }
    //Sum, minimum and maximum of array
    public static void FirstPractNum2(){
        System.out.println("Second task");
        Scanner sc = new Scanner(System.in); //Need for (in-)output system
        int sum =0;
        int n =0;//Length of array
        System.out.println("Enter length of your array: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        int i=0; //Counter for while/do while
        System.out.println("Type "+n+" int numbers: ");
        do{
            arr[i]=sc.nextInt();
            i++;
        }while(i<arr.length);
        i=0;
        while (i<arr.length){
            sum+=arr[i];
            i++;
        }
        int min = arr[0]; //Minimum number in array
        int max = arr[0]; //Maximum number in array
        for(int f=0;f<arr.length;f++){
            if(arr[f]>=max){
                max=arr[f];
            }
            if(arr[f]<=min){
                min=arr[f];
            }
        }
        System.out.println("Sum of array's elements: "+sum+"\nMin value in array: "+min+"\nMax value in array: "+max);
    }
    //Print first 10 valuws of harmonic row
    public static void FirstPractNum4(){
        System.out.println("Fourth task");
        for(float i=1;i<11;i++){
            System.out.println(Math.round(i) +" num in harmonic row is "+ Math.ceil((1/i)*Math.pow(10,1))/Math.pow(10,1));
        }
    }
    //Print console's arguments
    public static void FirstPractNum3(String[] arg) {
        System.out.println("Third task can be seen when you run this file by using cmd and next command: 'java FirstProgr.java [your arguments[])'");
        for(String ar : arg){
            System.out.println("Argument is "+ar);
        }
    }
    //Calculating factorial
    public static void FirstPractNum5(){
        System.out.println("Fifth task");
        int result = 1;
        long fact = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Type number to calculate it's factorial: ");
        fact = sc.nextInt();
        BigInteger resl = BigInteger.valueOf(result);

        for(long i=1;i<=fact;i++) {
            BigInteger it = BigInteger.valueOf(i);
            resl = resl.multiply(it);
        }
        System.out.println("Factorial of "+fact+" is "+resl);
    }
    public static void main(String[] args) {
        //FirstPractNum1();
        //FirstPractNum2();
        //FirstPractNum3(args);//This task can be seen when you run this file using cmd ONLY (use java FirstProgr.java [your arguments])
        //FirstPractNum4();
        FirstPractNum5();
    }
}
