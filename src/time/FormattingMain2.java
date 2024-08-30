package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain2 {

    public static void main(String[] args) {
        // 포맷팅: 날짜와 시간을 문자로
        LocalDateTime now = LocalDateTime.of(2024,12,31,13,30,31);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        System.out.println("날짜와 시간 포맷팅 = " + formattedDateTime);
        System.out.println(now);

        // 파싱: 문자를 날짜와 시간으로
        String dateTimeString = "2023-01-01 11:30:56";
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateTimeString, formatter);//이 문자를 이 포맷으로 읽어드릴 거야.
        System.out.println("문자열 파싱 날짜와 시간 = " + parsedDateTime);

    }
}
