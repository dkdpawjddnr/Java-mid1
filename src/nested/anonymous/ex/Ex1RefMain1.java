package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMain1 {
    public static void hello(Process process) {
        System.out.println("플로그램 시작");

        //코드 조각 시작
        process.run();
        //코드 조각 종료

        System.out.println("프로그램 종료");
    }

     static class Dice implements Process {
        @Override
        public void run() {
            int number = new Random().nextInt(6) + 1;
            System.out.println("주사위 = "  + number);
        }
    }

    static class Sum implements Process {
        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println("i = " + i);
            }
        }
    }

    public static void main(String[] args) {
        Process dice = new Dice();
        Sum sum = new Sum();
        hello(dice);
        hello(sum);
    }


}
