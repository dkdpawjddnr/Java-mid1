package nested.inner;

public class InnerOuterMain {

    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();
        // 무조건 바깥 클래스에 대한 인스턴스가 있어야 함.
        // 그 안에만 생성할 수 있음.
        InnerOuter.Inner inner = outer.new Inner();
        inner.print();

        System.out.println("innerClass = " + inner.getClass());
    }
}
