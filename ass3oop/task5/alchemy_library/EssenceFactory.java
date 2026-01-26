package task5.alchemy_library;


public class EssenceFactory {

    public static Essence extract(Potion potion) {
        Type type = potion.getType();

        if (type == Type.MANA) {
            System.out.println("EssenceFactory: extracting mana essence...");
            return new ManaEssenceConverter();
        } else if (type == Type.STAMINA) {
            System.out.println("EssenceFactory: extracting stamina essence...");
            return new StaminaEssenceConverter();
        } else {
            System.out.println("EssenceFactory: extracting healing essence...");
            return new HealingEssenceConverter();
        }
    }
}

