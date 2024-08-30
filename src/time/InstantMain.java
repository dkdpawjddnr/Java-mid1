package time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {

    public static void main(String[] args) {
        //생성
        Instant now = Instant.now();//UTC기즌으로 생성
        System.out.println("now = " + now);

        ZonedDateTime zdt = ZonedDateTime.now();
        Instant from = Instant.from(zdt);
        System.out.println("from = " + from);

        Instant epochStart = Instant.ofEpochSecond(100);
        System.out.println("epochStart = " + epochStart);
        
        //계산
        Instant later = epochStart.plusSeconds(3600);
        System.out.println("later = " + later);
        
        long laterEpochSecond = later.getEpochSecond();
        System.out.println("laterEpochSecond = " + laterEpochSecond);
    }
}
