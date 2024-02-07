import java.awt.*;

public class Prostokat extends Wielokat{
    private double a;
    private double b;

    protected double obliczObwod() {
        this.obwod=2*a+2*b;
        return obwod;
    }

    protected double obliczPole() {
        this.pole=a*b;
        return pole;
    }



    public Prostokat(int pole, int obwod, Color kolor, int liczbaWierzcholkow, int liczbaBokow, double a, double b) {
        super(pole, obwod, kolor, liczbaWierzcholkow, liczbaBokow);
        this.a = a;
        this.b = b;
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
