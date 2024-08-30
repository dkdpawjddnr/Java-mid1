package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {

        Integer newInteger = new Integer(10); //valueOf 사용 권장
        Integer integerObj = Integer.valueOf(10); //-128~ 127 자주 사용하는 숫자 성능 최적화 재사용

        System.out.println("newInteger = " + newInteger.toString()); //알아서 toString 오버라이딩
        System.out.println("integerObj = " + integerObj);

        System.out.println("내부 값 읽기");
        int intValue = integerObj.intValue();
        System.out.println("intValue = " + intValue);

        System.out.println("비교");
        System.out.println("==: " + (newInteger == integerObj));
        System.out.println("equals: " + (newInteger.equals(integerObj)));
    }
}
