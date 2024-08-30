package lang.math.test;

import java.util.Random;

public class LottoGenerator {

        // 문제 로또 번호 자동 생성기
        // 로또 번호를 자동으로 만들어주는 자동 생성기를 만들자.
        // 로또 번호는 1~45 사이의 숫자를 6개 뽑아야 한다.
        // 각 숫자는 중복되면 안된다.
        // 실행 할 때마다 결과가 같아야 한다.
    private final Random random = new Random();
    private int[] lottoNumber;
    private int count;

    public int[] generate(){
        lottoNumber = new int[6];
        count = 0;

        while (count < 6) {
            // 1부터 45 사이의 숫자 생성
            int number = random.nextInt(45) + 1;
            // 중복되지 않는 경우에만 배열에 추가
            if (isUnique(number)){
                lottoNumber[count] = number;
                count++;
            }
        }
        return lottoNumber;
    }

    private boolean isUnique(int number) {
        for (int i = 0; i < count; i++) {
            if (lottoNumber[i] == number) {
                return false;
            }
        }
        return true;
    }
}
