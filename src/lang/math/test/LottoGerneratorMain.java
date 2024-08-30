package lang.math.test;

public class LottoGerneratorMain {
    public static void main(String[] args) {
        LottoGenerator generator = new LottoGenerator();
        int[] lottoNumbers = generator.generate();

        // 생성된 로또 번호 출력
        System.out.println("로또 번호 : ");
        for (int lottonumber : lottoNumbers) {
            System.out.print(lottonumber + " ");
        }
    }
}
