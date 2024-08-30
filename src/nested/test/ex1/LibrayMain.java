package nested.test.ex1;

import nested.test.ex1.Libray;

public class LibrayMain {

    public static void main(String[] args) {
        Libray libray = new Libray(4);
        libray.addBook("책1", "저자1");
        libray.addBook("책2", "저자2");
        libray.addBook("책3", "저자3");
        libray.addBook("자바 ORM 표준 JPA 프로그래밍", "김영한");
        libray.addBook("자바 중급", "영한센세");
        libray.showBooks();
    }
}
