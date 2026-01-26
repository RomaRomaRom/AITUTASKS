

public class WithChicken extends PizzaDecorator { 
    public WithChicken(Pizza pizza) {
    super(pizza);
}
@Override
public double getCost() {
    return super.getCost() + 20;
}
public String getIngredients() {
    return super.getIngredients() + ", chicken";
}
}