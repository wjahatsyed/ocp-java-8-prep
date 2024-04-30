package chapter_01.enums;

/**
 * Created by Syed Wajahat on 4/30/2020.
 */
public enum Season_2 {
    WINTER("Low"){
        @Override
        public void myMethod() {

        }
    }, SUMMER("High") {
        @Override
        public void myMethod() {

        }
    }, AUTUMN("Medium") {
        @Override
        public void myMethod() {

        }
    },
    SPRING("Medium") {
        @Override
        public void myMethod() {

        }
    };

    final String expectedVisitors;

    private Season_2(String expectedVisitors) {
        this.expectedVisitors = expectedVisitors;
    }

    public void printExpectedVisitor() {
        System.out.println(expectedVisitors);
    }

    public abstract void myMethod();
}
