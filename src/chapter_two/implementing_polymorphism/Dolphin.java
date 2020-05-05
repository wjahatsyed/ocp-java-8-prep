package chapter_two.implementing_polymorphism;

/**
 * Created by Syed Wajahat on 12/10/2019.
 */
public class Dolphin implements LivesInOcean {
    @Override
    public void makeSound() {
        System.out.println("It's a dolphin bitches");
    }
}
