package lang.string.test;

public class TestString2 {
    public static void main(String[] args) {
        // length()를 사용해서 arr 배열에 들어있는 모든 문자열의 길이 합을 구해라.

        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count += arr[i].length();
            System.out.println(arr[i]+":"+arr[i].length());
        }
        /*
        for (String s : arr) {
            System.out.println(s + ":" + s.length());
            count += s.length();
        }
         */
        System.out.println("sum = " + count);
    }
}
