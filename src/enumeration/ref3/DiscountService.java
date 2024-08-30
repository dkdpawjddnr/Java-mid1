package enumeration.ref3;

public class DiscountService {

    // 이제 필요가 없음
    public int discount(Grade grade, int price) {
        return grade.discount(price);
    }
}
