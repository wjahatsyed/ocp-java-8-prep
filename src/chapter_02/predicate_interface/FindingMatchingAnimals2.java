package chapter_02.predicate_interface;

import chapter_02.functional_programming.implementing_functional_interfaces_with_lambdas.Animal;

import java.util.function.Predicate;

public class FindingMatchingAnimals2 {
    private static void print(Animal animal, Predicate<Animal> animalPredicate) {
        if (animalPredicate.test(animal)) {
            System.out.println(animal);
        }
    }

    public static void main(String[] args) {
        print(new Animal("Rabbit", true, false), Animal::canHop);
        print(new Animal("Dolphin", false, true), Animal::canSwim);
    }
}
