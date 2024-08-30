package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV3 {

    private  int outInstanceVar = 3; //인스턴스 변수


    public Printer process (int paramVar){ //매개변수 (다형성을 위해서 Printer반환)

        int localVal = 1; //지역 변수는 스택 프레임이 종료되는 순간 함께 제거된다.
        class LocalPrinter implements Printer {
            // localVal, paramVar 가 여기에 안보이게 캡처되어 있음. 그래서 호출이 가능했던 것
            int value = 0; //내부 클래스의 멤버 변수

            @Override
            public void print() {
                System.out.println("value = " + value);

                //인스턴스는 지역 변수보다 더 오래 살아남는다.
                System.out.println("localVal = " + localVal);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        LocalPrinter printer = new LocalPrinter();
        //localPrinter.print();를 여기서 실행하지 않고 Printer인스턴스만 반환한다.

        return printer; //객체를 반환
    }

    public static void main(String[] args) {
        LocalOuterV3 localOuter = new LocalOuterV3();
        Printer printer = localOuter.process(2);//원래면 스택프레임 사라지고, 지역변수도 사라지는데?
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
