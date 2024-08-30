package time.test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TestLoopPlus {

    public static void main(String[] args) {
        // 2024년 1월 1일 부터 2주 간격으로 5회 반복하여 날짜를 출력하는 코드 작성.

        LocalDate startDate = LocalDate.of(2024, 1, 1);
        for (int i = 0; i < 5; i++) {
            LocalDate nextDate = startDate.plus(2 * i, ChronoUnit.WEEKS); //방법1
            System.out.println("날짜 " + (i+1) +": " + nextDate);

            LocalDate nextDate2 = startDate.plusWeeks(i * 2); //방법2
            System.out.println("nextDate2 = " + nextDate2);

        }
    }
}
