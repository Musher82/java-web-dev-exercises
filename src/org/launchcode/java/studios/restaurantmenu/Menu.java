package org.launchcode.java.studios.restaurantmenu;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private static ArrayList<MenuItem> fullMenu;
    private static Date updated;

    public Menu() {
        this.fullMenu = new ArrayList<>();
        this.updated = new Date();

    }

    public void addItem(MenuItem item){
        this.fullMenu.add(item);
        this.updated = new Date();
    }

    public void removeItem(MenuItem item){
        if (fullMenu.contains(item)){
            fullMenu.remove(item);
            this.updated = new Date();
        }
    }

    public ArrayList<MenuItem> getFullMenu(){
        return this.fullMenu;
    }

    public void printMenu(){
        for (MenuItem item: fullMenu){
            System.out.println(item.getCategory() + item.getDescription() + item.getPrice());
        }
    }

    public void printSingleItem(MenuItem item){
        if (fullMenu.contains(item)) {
            System.out.println(fullMenu.get(fullMenu.indexOf(item)));
        }
    }

    public Date getDate(){
        return this.updated;
    }

}
