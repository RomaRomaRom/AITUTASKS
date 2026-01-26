package task10.director;



import task10.builders.Builder;
import task10.PizzaType;

public class Director {

    public void makeHawaiianPizza(Builder builder) {
        builder.setType(PizzaType.HAWAIIAN);
        builder.setDough("обычное");
        builder.setSauce("мягкий");
        builder.setTopping("ветчина + ананас");
    }

    public void makeSpicyPizza(Builder builder) {
        builder.setType(PizzaType.SPICY);
        builder.setDough("запеченное");
        builder.setSauce("острый");
        builder.setTopping("пепперони + салями");
    }
}
