package org.andestech.learning.rfb19.g3;

public class ColorBase {
    public int getR() {
        return r;
    }

    public int getG() {
        return g;
    }

    public int getB() {
        return b;
    }

    public double getA() {
        return a;
    }

    private int r;

    public ColorBase(int r, int g, int b, double a) {
        this.r = r;
        this.g = g;
        this.b = b;
        this.a = a;
    }

    private int g;
    private int b;
    private double a;

    public String toString()
    {
        return "rgba(" +r +","+g +","+b +","+a +")";
    }

}
