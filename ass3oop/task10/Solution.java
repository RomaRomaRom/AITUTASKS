package task10;

import task10.builders.PizzaBuilder;
import task10.builders.PizzaRecipeBuilder;
import task10.director.Director;

public class Solution {

    public static void main(String[] args) {

        Director director = new Director();

        PizzaBuilder builder = new PizzaBuilder();
        director.makeHawaiianPizza(builder);
        Pizza pizza = builder.getResult();
        System.out.println("Pizza made:\n" + pizza.getType());

        PizzaRecipeBuilder recipeBuilder = new PizzaRecipeBuilder();
        director.makeSpicyPizza(recipeBuilder);
        Recipe pizzaRecipe = recipeBuilder.getResult();
        System.out.println("\nPizza recipe made:\n" + pizzaRecipe.print());
    }
}
