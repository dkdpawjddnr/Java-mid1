package lang.object.tostring;

public class Dog {

    private String dogName;
    private  int age;

    public Dog(String dogName, int age) {
        this.dogName = dogName;
        this.age = age;
    }
//    @Override
//    public String toString() {
//        return "dogName = " + dogName + "/" + "age = " + age;
//    }

    //Alt + insert로 하는 방법
    @Override
    public String toString() {
        return "Dog{" +
                "dogName='" + dogName + '\'' +
                ", age=" + age +
                '}';
    }
}
