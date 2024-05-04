package chapter_02.design_principles.creational_design_patterns.factory_pattern.factory_pattern_2;

public abstract class Food {
    private final int quantity;

    public int getQuantity() {
        return quantity;
    }

    public Food(int quantity) {
        this.quantity = quantity;
    }

    public abstract void consumed();
}
