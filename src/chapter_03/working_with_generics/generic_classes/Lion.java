package chapter_03.working_with_generics.generic_classes;

public class Lion {
    public static void main(String[] args){
        Lion lion = new Lion();
        Crate<Lion> crate = new Crate<>();
        crate.packCrate(lion);

        //Drop Lion at a new zoo
        Lion lion1 = crate.emptyCrate();
    }
}
