package chapter_02.functional_programming.implementing_functional_interfaces_with_lambdas.second_folder;

public class Animal {
    private final String species;
    private final boolean canHop;
    private final boolean canSwim;

    public Animal(String species, boolean canHop, boolean canSwim) {
        this.species = species;
        this.canHop = canHop;
        this.canSwim = canSwim;
    }

    public boolean canHop() {
        return canHop;
    }

    public boolean canSwim() {
        return canSwim;
    }

    @Override
    public String toString() {
        return species;
    }
}
