package model;

public class Item {
    //create Item class that includes Item name, point, and stock
    private String name;
    private int point;
    private int stock;
    private int itemSold;

    public int getItemSold() {
        return itemSold;
    }

    public void increaseSold() {
        this.itemSold += 1;
    }

    public Item(String name, int point, int stock) {
        this.name = name;
        this.point = point;
        this.stock = stock;
        this.itemSold = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void updateItem(String name, int point, int stock) {
        this.name = name;
        this.point = point;
        this.stock = stock;
    }

    public String getItemInfo() { 
        return "Item name: '" + this.name + "', Point: " + this.point + ", Stock Available: " + this.stock + ", Item Sold:  " + this.itemSold;
    }
    //ini item sold nya gak di tampilin disini?
    // boleh sih, eh tapi karena static ky nya beda cara nampilinnya, kita run dulu aja kl gitu sip
    //ook
}
