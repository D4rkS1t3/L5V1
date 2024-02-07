import java.awt.*;

public class Okrag extends Elipsa{
    private double r;

    public Okrag(int pole, int obwod, Color kolor, double a, double b, double f1x, double f1y, double f2x, double f2y, double r) {
        super(pole, obwod, kolor, a, b, f1x, f1y, f2x, f2y);
        this.r = r;
    }

    public Okrag(int pole, int obwod, Color kolor, double a, double b, double f1x, double f1y, double f2x, double f2y) {
        super(pole, obwod, kolor, a, b, f1x, f1y, f2x, f2y);
    }

    protected double obliczObwod() {
        this.obwod=2*3.14*this.r;
        return obwod;
    }
    protected double obliczPole() {
        this.pole=3.14*this.r*this.r;
        return pole;
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
}
