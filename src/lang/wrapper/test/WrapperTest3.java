package lang.wrapper.test;

public class WrapperTest3 {

    public static void main(String[] args) {
        // String str을 Integer로 변환해서 출력해라.
        // Integer를 int로 변환해서 출력해라.
        // int를 Integer로 변환해서 출력해라.
        // 오토방식, 오토언박싱 사용x 직접 변환하기.

        String str = "100";
        //String -> Integer
        Integer integer1 = Integer.valueOf(str);
        System.out.println("integer1 = " + integer1);

        //Integer -> int
        int intValue = integer1.intValue();
        System.out.println("intValue = " + intValue);

        //int -> Integer
        Integer integer2 = Integer.valueOf(intValue);
        System.out.println("integer2 = " + integer2);
    }
}
