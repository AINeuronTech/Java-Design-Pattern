package structural.facade;

public class UberEat {

    private PizzaShop smallPizza;
    private PizzaShop mediumPizza;
    private PizzaShop largePizza;

    public UberEat(){
        smallPizza = new SmallPizza();
        mediumPizza = new MediumPizza();
        largePizza = new LargePizza();
    }

    public void smallPizzaDiscount(){
        smallPizza.pizzaSize();
        smallPizza.price();
    }
    public void mediumPizzaDiscount(){
        mediumPizza.pizzaSize();
        mediumPizza.price();
    }
    public void largePizzaDiscount(){
        largePizza.pizzaSize();
        largePizza.price();
    }
}
