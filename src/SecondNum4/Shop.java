package SecondNum4;

import java.util.Vector;

public class Shop {
    Vector Shop = new Vector(3,1);

    public Shop() {
    }
    //Adding PC to the shop
    public void addPC(String name)
    {
        Shop.addElement(name);
        System.out.println("PC "+ name+ " has been added to the shop");
    }
    //Removing PC from the shop
    public void removePC(String name)
    {
        Shop.removeElement(name);
        System.out.println("PC "+name+" has been removed from shop");
    }
    //Finding PC in the shop
    public int findPC(String name)
    {
        if(Shop.indexOf(name) < 0)
        {
            System.out.println("Sorry, PC '" + name + "' isn't available now. Please, come back later");

        }
        else
        {
            System.out.println("Sure, we have PC '"+name+"' Do you want to buy it?");
        }
        return Shop.indexOf(name);
    }
}
