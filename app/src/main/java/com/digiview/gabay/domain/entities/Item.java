package com.digiview.gabay.domain.entities;

public class Item {
    public Item() {}
    public Item(String item_id, String trip_id, String category_id, String item_name, Double item_price) {
        this.item_id = item_id;
        this.trip_id = trip_id;
        this.category_id = category_id;
        this.item_name = item_name;
        this.item_price = item_price;
    }

    public String item_id;
    public String trip_id;
    public  String category_id;
    public String item_name;
    public Double item_price;
}
