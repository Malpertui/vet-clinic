package main.java.com.magicvet.model;

public class Dog extends Pet {
/*    public static final String XS = "XS";
    public static final String S = "S";
    public static final String M = "M";
    public static final String L = "L";
    public static final String XL = "XL";*/
    private Size size;

    public Dog() {}

    public Dog(Size size) {
        this.size = size;
    }


    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

public enum Size {
    XS(1),
    S(2),
    M(3),
    L(4),
    XL(5),
    UNKNOWN(0) ;

    private final int value;

        Size (int value) {
            this.value = value;
        }

    public int getValue() {
        return value;
    }
}


}
