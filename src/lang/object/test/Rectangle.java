package lang.object.test;

import java.util.Objects;

public class Rectangle {
    private int wjdth;
    private int height;

    public  Rectangle(int wjdth, int height) {
        this.wjdth = wjdth;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "wjdth=" + wjdth +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Rectangle rectangle = (Rectangle) object;
        return wjdth == rectangle.wjdth && height == rectangle.height;
    }
}
