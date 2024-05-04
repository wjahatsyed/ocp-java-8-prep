package chapter_02.design_principles.creational_design_patterns.factory_pattern.factory_pattern_2;

import chapter_02.design_principles.creational_design_patterns.factory_pattern.factory_pattern_2.Pellets;

public class FoodFactory {
    public static Food getFood(String name){
        switch(name) {
            case "polar-bear":
                return new Fish(20);
            case "goat":
                return new Pellets(30);
        }
        throw new UnsupportedOperationException("Unsupported Animal" + name);
    }
}
