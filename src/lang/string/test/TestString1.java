package lang.string.test;

public class TestString1 {
    public static void main(String[] args) {
        // startWith()를 사용해서 url이 https://로 시작하는지 확인해라.
        String url = "https://www.example.com";
        boolean result = url.startsWith("https://");

        System.out.println("result = " + result);

    }
}
