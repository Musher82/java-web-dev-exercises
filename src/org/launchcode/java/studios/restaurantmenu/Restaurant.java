package org.launchcode.java.studios.restaurantmenu;
import org.launchcode.java.studios.restaurantmenu.MenuItem;
import org.launchcode.java.studios.restaurantmenu.Menu;

public class Restaurant {
    public static void main(String[] args){

        //apps
        MenuItem potatoApp = new MenuItem("Appetizer", "Potato Wedges",8, true);
        MenuItem shrimpApp = new MenuItem("Appetizer", "Captain Crunch Shrimp", 12, false);
        new MenuItem("Appetizer", "Nachos", 11, true);

        //mainCourse

        new MenuItem("Main Course", "Chicken with Risotto", 16, false);
        new MenuItem("Main Course", "Grilled Salmon Salad", 14, false);
        new MenuItem("Main Course", "Seitan Steak w/ Mash potatoes", 18, true);

        //desserts
        new MenuItem("Dessert", "Cheesecake", 7, false);
        new MenuItem("Dessert", "Fried Ice Cream", 5, false);
        new MenuItem("Dessert", "Muddy Buddy Pie", 6, true);

        Menu steakHouse = new Menu();

        steakHouse.addItem(potatoApp);
        steakHouse.addItem(shrimpApp);
        steakHouse.getDate();

System.out.println(steakHouse.getFullMenu());

    }
}
