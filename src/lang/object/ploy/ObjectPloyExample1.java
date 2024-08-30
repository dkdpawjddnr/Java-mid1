package lang.object.ploy;

public class ObjectPloyExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        Object o = dog; //부모는 자식을 담을 수 있다.

        action(dog);
        action(car);
    }

    private static void action(Object object){
//      //object.sound(); //위에서 아래로 내려가는 건 불가능
//      //object.move(); //컴파일 오류, Object는 move와 sound메소드가 없음.
        //객체에 맞는 다운캐스팅 필요
        if (object instanceof Car car) {
            car.move();
            //원래는 ((Dog)object).move()인데
            //car선언을 해주면 자동으로 다운캐스팅 해줌.
        } else if (object instanceof Dog dog) {
            dog.sound();
        }
    }
}
