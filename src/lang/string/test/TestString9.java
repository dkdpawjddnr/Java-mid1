package lang.string.test;

public class TestString9 {
    public static void main(String[] args) {
        //split()를 사용해서 이메일의 ID부분과 도메인 부분을 분리해라.

        String email = "hello@example.com";

        String [] split = email.split("@");
        String id = split[0];
        String domain = split[1];

        System.out.println("ID: " + id);
        System.out.println("Domain: " + domain);
    }
}
