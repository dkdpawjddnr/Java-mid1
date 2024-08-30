package nested.nested;

public class NestedOuterMain {

    public static void main(String[] args) {
        NestedOuter outer = new NestedOuter();

        NestedOuter.Nested nested = new NestedOuter.Nested();
        nested.print();

        System.out.println("nestedClass = " + nested.getClass());
        //안쪽에 있는 클래스는 $로 표시함.
    }
}
