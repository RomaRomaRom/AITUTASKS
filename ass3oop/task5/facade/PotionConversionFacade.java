package task5.facade;

import task5.alchemy_library.*;

public class PotionConversionFacade {

    public String convertPotion(String potionName, String convertTo) {

        System.out.println("PotionConversionFacade: conversion started.");

        Potion potion = new Potion(potionName);

        Type targetType = Type.valueOf(convertTo.toUpperCase());

        Essence sourceEssence = EssenceFactory.extract(potion);
        Essence destinationEssence;

        if (targetType == Type.MANA) {
            destinationEssence = new ManaEssenceConverter();
        } else if (targetType == Type.STAMINA) {
            destinationEssence = new StaminaEssenceConverter();
        } else {
            destinationEssence = new HealingEssenceConverter();
        }

        Potion portion = Extractor.extractPortion(potion, sourceEssence);
        Potion intermediateResult = Extractor.convert(portion, destinationEssence);
        Potion result = new Finalizator().fix(intermediateResult);

        System.out.println("PotionConversionFacade: conversion completed.");

        return result.getName();
    }
}
