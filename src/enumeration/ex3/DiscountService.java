package enumeration.ex3;

public class DiscountService {

    public int discount(Grade classGrade, int price) {
        int discountPercent = 0;

        //x001                    x001 둘 다 x001임
        if (classGrade == Grade.BASIC) {
            discountPercent = 10;
        } else if (classGrade == Grade.GOLD){
            discountPercent = 20;
        } else if (classGrade == Grade.DIAMOND) {
            discountPercent = 30;
        } else {
            System.out.println("할인X");
        }
        // 10000 * ( 20 / 100 ) -> 2000원
        // 등급이 없으면 discountPercent가 0이므로 할인 금액도 0원이다.
        return price * discountPercent / 100;
    }
}
