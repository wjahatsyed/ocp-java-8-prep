package chapter_02.functional_programming.implementing_functional_interfaces_with_lambdas.second_folder;

public class FindingMatchingAnimals {
    public static void print(Animal animal, CheckTrait checkTrait){
        if(checkTrait.testTrait(animal)){
            System.out.println(animal);
        }
    }

    public static void main(String [] args){
        print(new Animal("Kangaroo", true, false), Animal::canHop);
        print(new Animal("Fish", false, true), a -> a.canSwim());
    }
}
