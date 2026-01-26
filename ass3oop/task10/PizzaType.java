package task10;

public enum PizzaType {

    HAWAIIAN("Гавайская пицца"),
    SPICY("Острая пицца");

    private final String title;

    PizzaType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
