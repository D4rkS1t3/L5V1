import java.awt.*;

public class Trojkat extends Wielokat{
    private double h;
    private double a;

    protected double obliczObwod() {
        this.obwod=3*a;
        return obwod;
    }

    protected double obliczPole() {
        this.pole=0.5*this.a*this.h;
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

    public Trojkat(int pole, int obwod, Color kolor, int liczbaWierzcholkow, int liczbaBokow, double h, double a) {
        super(pole, obwod, kolor, liczbaWierzcholkow, liczbaBokow);
        this.h = h;
        this.a = a;
    }
}
