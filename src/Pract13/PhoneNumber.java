package Pract13;

import java.util.Scanner;

public class PhoneNumber {
    public String makeReadable(String number){
        String noCode = number.substring(number.length()-10);
        String numds3 = noCode.substring(0,3);
        String numbe = noCode.substring(3);
        String code = number.substring(0,number.lastIndexOf(noCode));
        return code+"("+numds3+")"+numbe.substring(0,3)+" "+numbe.substring(3);
    }

    public void TestString(String str){
        System.out.println("Last symbol is "+str.charAt(str.length()-1));
        System.out.println("Ends with (!!!)? "+str.endsWith("!!!"));
        System.out.println("Starts with (I like)? "+str.startsWith("I like"));
        System.out.println("Contains (Java)? "+str.contains("Java"));
        System.out.println("Position of (Java) is "+str.indexOf("Java"));
        System.out.println("(Was) "+ str+" (Become) "+str.replaceAll("a","o"));
        System.out.println("(Upper case) "+str.toUpperCase()+" (Lower case) "+str.toLowerCase());
        System.out.println("(Was) "+str+" (Become) "+str.replace("Java",""));
    }

    public static void main(String[] args) {
        PhoneNumber phone = new PhoneNumber();
        Scanner sc = new Scanner(System.in);
        System.out.println("Write your sentence ");
        phone.TestString(sc.nextLine());
        System.out.println("\nWrite your phone number as (code of your country)XXXXXXXXXX");
        System.out.println(phone.makeReadable(sc.nextLine()));
    }
}
