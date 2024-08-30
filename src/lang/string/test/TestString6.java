package lang.string.test;

public class TestString6 {
    public static void main(String[] args) {
        // str에서 key로 주어지는 문자를 찾고, 찾은 문자의 수를 출력해라.
        // indexOf()를 반목문과 함께 풀면 된다.
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";
        
        int count = 0;
        int index = str.indexOf(key);
        //System.out.println("index = " + index);
        while (index >= 0) { // 못찾으면 -1을 반환하기 때문에 끝까지 찾을 때 까지 라는 뜻
            index = str.indexOf(key, index + 1); // fromIndex어디서 부터 찾을 거냐
            // System.out.println("index = " + index);
            count ++;
        }
        System.out.println("count = " + count);
        
    }
}
