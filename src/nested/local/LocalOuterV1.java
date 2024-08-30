package nested.local;

public class LocalOuterV1 {

    static int outStaticVar = 4;
    private  int outInstanceVar = 3; //인스턴스 변수

    public void process(int paramVar) { //매개변수
        int localVal = 1; //지역 변수

        // 지역 클래스는 지역 변수랑 같은 위치에 있다. (지역 변수처럼 코드 블럭 안에 클래스를 선언한다.)
        class LocalPrinter {
            int value = 0;

            public void printData() {
                System.out.println("value = " + value);
                System.out.println("localVal = " + localVal);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
                System.out.println("outStaticVar = " + outStaticVar);
            }

        }
        // 선언 및 생성도 먼저 클래스를 만들고 나중에 사용이 가능함.
        LocalPrinter localPrinter = new LocalPrinter();
        localPrinter.printData();
    }

    public static void main(String[] args) {
        LocalOuterV1 localOuter = new LocalOuterV1();
        localOuter.process(2);
    }
}
