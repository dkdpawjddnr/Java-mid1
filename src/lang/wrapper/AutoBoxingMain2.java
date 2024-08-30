package lang.wrapper;

public class AutoBoxingMain2 {

    public static void main(String[] args) {
        //Primitive -> Wrapper
        int vaulue = 8;
        Integer boxedValue = vaulue; // 오토 박싱(Auto-boxing)

        // Wrapper -> Primitive
        int unboxedValue = boxedValue; // 오토 언박싱(Auto-unboxing)

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
