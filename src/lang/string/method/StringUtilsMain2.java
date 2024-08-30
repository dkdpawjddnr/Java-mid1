package lang.string.method;

public class StringUtilsMain2 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        String str = "Hello, Java!";

        // format 메서드
        String format1 = String.format("num: %d, bool: %b, str: %s", num,bool,str);
        System.out.println(format1);

        // printf 출력할 때 format을 사용하고 싶으면 사용
        System.out.printf("숫자: %.2f \n", 10.3265);

        // matches 메서드
        // "Hello, Java나 World
        String regex = "Hello, (Java!|World)";
        System.out.println("'str'이 패턴과 일치하는가? " + str.matches(regex));
    }
}
