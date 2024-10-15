package Assignment_3_3;

public class RestaurantApp {
    public static void main(String[] args) {
        MenuComponent breakfastMenu = new Menu("Breakfast", "Morning Menu");
        MenuComponent lunchMenu = new Menu("Lunch", "Afternoon Menu");
        MenuComponent dinnerMenu = new Menu("Dinner", "Evening Menu");

        MenuComponent allMenus = new Menu("ALL MENUS", "All available menus");
        allMenus.add(breakfastMenu);
        allMenus.add(lunchMenu);
        allMenus.add(dinnerMenu);

        breakfastMenu.add(new MenuItem("Pancakes", "Pancakes with syrup", 5.99));
        lunchMenu.add(new MenuItem("Burger", "Cheeseburger with fries", 8.99));
        dinnerMenu.add(new MenuItem("Steak", "Grilled steak with vegetables", 14.99));

        allMenus.print();
    }
}

