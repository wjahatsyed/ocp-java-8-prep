package chapter_02.design_principles.creational_design_patterns.factory_pattern.factory_pattern_2;

public class Fish extends Food{
    public Fish(int quantity) {
        super(quantity);
    }

    @Override
    public void consumed() {
        System.out.println("Fish eaten: " + getQuantity());
    }
}
