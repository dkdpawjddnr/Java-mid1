package enumeration.ref3;

public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30)
    , VIP(40);
    private final int discountPercent;

    Grade(int discountPercent) { // 생성자는 자동으로 private 생략
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    //추가
    public int discount(int price) {
        return price * discountPercent / 100;
    }
}
