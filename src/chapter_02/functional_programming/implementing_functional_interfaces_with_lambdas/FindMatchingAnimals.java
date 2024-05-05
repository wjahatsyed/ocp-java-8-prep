package chapter_02.functional_programming.implementing_functional_interfaces_with_lambdas;

/**
 * Created by Syed Wajahat on 12/10/2019.
 */
public class FindMatchingAnimals {
    private static void print(Animal animal, CheckTrait trait) {
        if (trait.checkTest(animal)) {
            System.out.println(animal);
        }
    }

    public static void main(String[] args) {
        //method reference
        print(new Animal("Fish", false, true), Animal::canHop);
        //Lambda Expression
        print(new Animal("Kangaroo", true, false), a -> a.canHop());
        print(new Animal("Lobster", false, true), Animal::canSwim);

        //print();
    }
}
