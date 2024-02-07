import java.awt.*;

class Elipsa extends Figura{

    private double a;
    private double b;
    private double F1x;
    private double F1y;
    private double F2x;
    private double F2y;
    private double c;

    public Elipsa(int pole, int obwod, Color kolor, double a, double b, double f1x, double f1y, double f2x, double f2y) {
        super(pole, obwod, kolor);
        this.a = a;
        this.b = b;
        F1x = f1x;
        F1y = f1y;
        F2x = f2x;
        F2y = f2y;
        this.c = obliczOgnisk();
    }

    public Elipsa() {
    }

    protected double obliczOgnisk() {
        double c=Math.sqrt(Math.pow(this.a,2)-Math.pow(this.b, 2));
        return c;
    }

    @Override
    protected void rysuj() {
        super.rysuj();
    }

    @Override
    protected void usun() {
        super.usun();
    }

    @Override
    protected void przesun() {
        super.przesun();
    }

    @Override
    protected String podajParametry() {
        return super.podajParametry();
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getF1x() {
        return F1x;
    }

    public void setF1x(double f1x) {
        F1x = f1x;
    }

    public double getF1y() {
        return F1y;
    }

    public void setF1y(double f1y) {
        F1y = f1y;
    }

    public double getF2x() {
        return F2x;
    }

    public void setF2x(double f2x) {
        F2x = f2x;
    }

    public double getF2y() {
        return F2y;
    }

    public void setF2y(double f2y) {
        F2y = f2y;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}