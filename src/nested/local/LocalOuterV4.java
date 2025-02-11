package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV4 {

    private  int outInstanceVar = 3;
    public Printer process (int paramVar){

        int localVal = 1; //지역 변수는 스택 프레임이 종료되는 순간 함께 제거된다.
        class LocalPrinter implements Printer {
            int value = 0; //내부 클래스의 멤버 변수

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVal = " + localVal);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        Printer printer = new LocalPrinter();
        // 만약 localVar의 값을 변경한다면? 다시 캡처해야 하나??
        // localVar = 10;
        // paramVar = 20;
        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV4 localOuter = new LocalOuterV4();
        Printer printer = localOuter.process(2);
        //printer.print()를 나중에 실행한다. process()의 스택 프레임이 사라진 이후에 실행
        printer.print();

        //추가
        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }
    }
}
