package task10;

public class Pizza {
    private PizzaType type;
    private String dough;
    private String sauce;
    private String topping;

    public Pizza(PizzaType type, String dough, String sauce, String topping) {
        this.type = type;
        this.dough = dough;
        this.sauce = sauce;
        this.topping = topping;
    }

    public PizzaType getType() {
        return type;
    }

    public String getDough() {
        return dough;
    }

    public String getSauce() {
        return sauce;
    }

    public String getTopping() {
        return topping;
    }
}
