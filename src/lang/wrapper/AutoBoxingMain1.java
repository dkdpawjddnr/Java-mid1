package lang.wrapper;

import lang.string.chaining.ValueAdder;

public class AutoBoxingMain1 {

    public static void main(String[] args) {
        //Primitive -> Wrapper
        int vaulue = 8;
        Integer boxedValue = Integer.valueOf(vaulue);

        // Wrapper -> Primitive
        int unboxedValue = boxedValue.intValue();

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
