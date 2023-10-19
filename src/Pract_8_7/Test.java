package Pract_8_7;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = sc.nextInt();
        ProstMnozh f = new ProstMnozh();
        System.out.print("Простые множители числа "+a+": \n");
        f.Prost(a);
    }
}
