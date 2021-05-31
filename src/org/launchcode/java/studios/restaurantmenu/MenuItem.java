package org.launchcode.java.studios.restaurantmenu;

import java.util.Date;

public class MenuItem {

    private String category;
    private String description;
    private double price;
    private boolean newItem;
    private Date added;


    MenuItem(String category, String description, double price, boolean newItem){
        this.category = category;
        this.description = description;
        this.price = price;
        this.newItem = true;
        this.added = new Date();
    }

    public String getCategory(){
        return category;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice(){
        return price;
    }

    public boolean newItem(){
        return this.newItem;
    }

    public String setCategory(){
        return category;
    }

    public String setDescription(){
        return description;
    }

    public double setPrice(){
        return price;
    }

    public Date getDate(){
        return this.added;
    }
}
