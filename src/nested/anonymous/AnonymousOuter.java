package nested.anonymous;

import nested.local.Printer;

public class AnonymousOuter {
    private  int outInstanceVar = 3;
    public void process (int paramVar){
        int localVal = 1;

        //여기서 new Printer(){body}는 생성이 아니라
        //Printer를 상속 받으면서 인터페이스를 구현 하겠다는 뜻
        Printer printer = new Printer() {
            int value = 0;
            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVal = " + localVal);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        };
        printer.print();
        System.out.println("printer.class = " + printer.getClass());
    }

    public static void main(String[] args) {
        AnonymousOuter main = new AnonymousOuter();
        main.process(2);
    }
}
