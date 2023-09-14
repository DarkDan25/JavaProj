package SecondNum4;

import java.util.Vector;
import java.util.Scanner;

public class TestShop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shop shop = new Shop(); //Creating shop
        System.out.println("How many PC do you want to have in your shop?");
        int pcCount = sc.nextInt();
        System.out.println("Now, you need to write name for " + pcCount + " PC");
        // Adding some PC to our shop
        for (int i = 1; i <= pcCount; i++) {
            String pcName = sc.next();
            shop.addPC(pcName);
        }
        //Now, let's ask customer what PC does he want
        System.out.println("Good morning, what PC do you want?");
        System.out.println("I want this (write down name of PC) PC");
        String pcName = sc.next();
        //Find Pc in the shop and if it exists, ask customer, does he want to buy it
        int pc = shop.findPC(pcName);//This int needs to end dialog if there is no PC for customer
        if(pc>=0){
            System.out.println("(Write down 'yes' or 'no')");
            String choise = sc.next();
            if (choise.equals("yes")) {
                shop.removePC(pcName);
            } else {
                System.out.println("Sure, no problem. See you next time!");
            }
        }
    }
}
