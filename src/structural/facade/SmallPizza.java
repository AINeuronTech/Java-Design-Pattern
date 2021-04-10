package structural.facade;

public class SmallPizza implements PizzaShop {
    @Override
    public void pizzaSize() {
        System.out.println("Small Pizza with Vegetables Topping");
    }

    @Override
    public void price() {
        System.out.println("Small pizza price is $8");
    }
}
