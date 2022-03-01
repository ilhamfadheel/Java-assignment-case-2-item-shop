package model;

import java.util.List;
import java.util.ArrayList;

public class Shop {
    private List<Item> items;

    public Shop() {
        this.items = new ArrayList<Item>();
    }

    public void additem(Item item) {
        this.items.add(item);
    }

    public void getAllItems() {
        for (Item item : this.items) {
            System.out.println(item.getItemInfo());
        }
    }
}

//ini buat apaaa ya?
// buat wadah item,, untuk waktu perlu nampilin semuanya, i think? okee
//oo yaudah coba bikin dulu nanti ajarin gua