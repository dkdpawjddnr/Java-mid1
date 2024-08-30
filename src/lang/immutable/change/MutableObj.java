package lang.immutable.change;

public class MutableObj {

    private int value;

    public MutableObj(int value) {
        this.value = value;
    }

    public void add(int addvalue) {
        value = value + addvalue;
    }

    public int getvalue() {
        return value;
    }

    public void setvalue(int value) {
        this.value = value;
    }
}
