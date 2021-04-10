package structural.facade;

public class MediumPizza implements PizzaShop {
    @Override
    public void pizzaSize() {
        System.out.println("Medium Pizza with Vegetables/Chicken Topping");
    }

    @Override
    public void price() {
        System.out.println("Medium pizza price is $12");
    }
}
