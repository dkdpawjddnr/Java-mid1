package lang.string.test;

public class TestString5 {
    public static void main(String[] args) {
        // str에는 파일의 이름과 확장자가 주어진다. ext에는 파일의 확장자가 주어진다.
        // 파일명과 확장자를 분리해서 출력하라.
        // indexOf()와 substring()을 사용해서 문제를 풀면 된다.
        String str = "hello.txt";
        String ext= ".txt";

        int index = str.indexOf(ext);
        String filename = str.substring(0,index);
        String extName = str.substring(index);

        System.out.println("filename = " + filename);
        System.out.println("extName = " + extName);

    }
}
