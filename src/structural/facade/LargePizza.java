package structural.facade;

public class LargePizza implements PizzaShop {
    @Override
    public void pizzaSize() {
        System.out.println("Medium Pizza with Vegetables/Chicken/Mushroom Topping");
    }

    @Override
    public void price() {
        System.out.println("Medium Pizza Price is $16");
    }
}
