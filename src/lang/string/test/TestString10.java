package lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        // split()를 사용해서 fruits를 분리하고, join()을 사용해서 분리한
        // 문자들을 하나로 합쳐라.

        String fruits = "apple,banana,mango";
        //분리하기
        String [] split = fruits.split(",");

        for (String s : split) {
            System.out.println(s);
        }

        // 합치기
        System.out.println("joinedString = " +String.join("->", split));
        String join = String.join("->", split);
    }
}
