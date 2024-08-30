package lang.string.test;

public class TestString8 {
    public static void main(String[] args) {
        // replace()를 사용해서 java 라는 단어를 jvm으로 변경해라.
        String input = "hello java spring jpa java";
        input = input.replace("java","jpa");
        System.out.println("replace = " + input);

    }
}
