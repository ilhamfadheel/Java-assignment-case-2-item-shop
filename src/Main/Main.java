package Main;

import model.Item;
import model.Shop;

public class Main {
    public static void main(String[] args) {

        // point is the price needed to convert
        // stock is the number of item you can buy
        // create Item class that includes Item name, point, and stock
        Item barang_1 = new Item("Sabun Mandi", 20, 100);
        Item barang_2 = new Item("Sabun Cuci", 25, 80);

        
        Shop myShop = new Shop();
        myShop.additem(barang_1);
        myShop.additem(barang_2);

        // get all items registered before purchase
        myShop.getAllItems(); 

        //buyItem Sabun Mandi and Sabun Cuci
        buyItem(barang_1, 10);
        buyItem(barang_2, 20);

        System.out.println("Total Item Sold for " + barang_1.getName() +" is: " + getItemSold(barang_1));
        System.out.println("Total Item Sold for " + barang_2.getName() +" is: " + getItemSold(barang_2));

        
        // get all items registered after purchase
        myShop.getAllItems(); 

        System.exit(0);

    }

    // function to buy Item
    public static void buyItem(Item item, int quantity) {
        // if the stock is not enough, print "Out of stock"
        if (item.getStock() < quantity) {
            System.out.println("Out of stock");
        } else {
            // if the stock is enough, print "You bought x item"
            System.out.println("You bought " + quantity + " of " + item.getName() + " item");
            // decrease the stock
            item.setStock(item.getStock() - quantity);
            // increase Item Sold
            for (int i = 0; i < quantity; i++) {
                item.increaseSold();
            }
        }
    }

    // function to print the item information
    public static void getItemInfo(Item item) {
        System.out.println(item.getItemInfo());
    }

    // function to get the information of item sold
    public static int getItemSold(Item item) {
        return item.getItemSold();

    }

}
