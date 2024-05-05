package chapter_02.design_principles.creational_design_patterns.immutable_objects_pattern;

import java.util.ArrayList;
import java.util.List;

public final class Animal_2 {
    private final String species;
    private final int age;
    private final List<String> favoriteFood;

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public List<String> getFavoriteFood() {
        return favoriteFood;
    }

    public Animal_2(String name, int age, List<String> favoriteFood){
        this.species = name;
        this.age = age;
        this.favoriteFood = new ArrayList<>(favoriteFood);
    }
}
