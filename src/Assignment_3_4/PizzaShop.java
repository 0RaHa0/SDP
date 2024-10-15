package Assignment_3_4;

public class PizzaShop {
    public static void main(String[] args) {
        Pizza pizza = new MargheritaPizza();
        System.out.println(pizza.getDescription() + " Cost: $" + pizza.getCost());

        pizza = new CheeseTopping(pizza);
        pizza = new MushroomTopping(pizza);
        System.out.println(pizza.getDescription() + " Cost: $" + pizza.getCost());
    }
}

