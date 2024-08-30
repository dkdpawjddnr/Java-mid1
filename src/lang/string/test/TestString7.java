package lang.string.test;

public class TestString7 {
    public static void main(String[] args) {
        // 문자의 양쪽 공백을 제거해라.
        // 예) "    Hello Java    " -> "Hello Java"
        String original = "    Hello Java    ";
        String result = original.trim();
        System.out.println("result = " + result);
    }
}
