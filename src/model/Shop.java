package model;

import java.util.List;
import java.util.ArrayList;

public class Shop {
    private List<Item> items;

    public Shop() {
        this.items = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void getAllItems() {
        for (Item item : this.items) {
            System.out.println(item.getItemInfo());
        }
    }

    public void getAllItemSold() {
        System.out.println("Total Item sold information:");
        for (Item item : this.items) {
            System.out.println("Total Item Sold for " + item.getName() +" is: " + item.getItemSold());
        }
    }
}
