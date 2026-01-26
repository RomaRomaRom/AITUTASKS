package task10;

public class Recipe {

    private PizzaType type;
    private String dough;
    private String sauce;
    private String topping;

    public Recipe(PizzaType type, String dough, String sauce, String topping) {
        this.type = type;
        this.dough = dough;
        this.sauce = sauce;
        this.topping = topping;
    }

    public String print() {
        String recipe = type.getTitle() + "\n";
        recipe += "Тесто: " + dough + "\n";
        recipe += "Соус: " + sauce + "\n";
        recipe += "Начинка: " + topping + "\n";
        return recipe;
    }
}

