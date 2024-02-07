import java.awt.*;

class Wielokat extends Figura{
    private int liczbaWierzcholkow;
    private int liczbaBokow;
    private double sumaKatowWew;

    public Wielokat(int pole, int obwod, Color kolor, int liczbaWierzcholkow, int liczbaBokow) {
        super(pole, obwod, kolor);
        this.liczbaWierzcholkow = liczbaWierzcholkow;
        this.liczbaBokow = liczbaBokow;
        this.sumaKatowWew = ObliczSumeKatow();
    }

    protected double ObliczSumeKatow() {
        double suma=(this.liczbaWierzcholkow-2)*180;
        return suma;
    }

















    public int getLiczbaWierzcholkow() {
        return liczbaWierzcholkow;
    }

    public void setLiczbaWierzcholkow(int liczbaWierzcholkow) {
        this.liczbaWierzcholkow = liczbaWierzcholkow;
    }

    public int getLiczbaBokow() {
        return liczbaBokow;
    }

    public void setLiczbaBokow(int liczbaBokow) {
        this.liczbaBokow = liczbaBokow;
    }

    public double getSumaKatowWew() {
        return sumaKatowWew;
    }

    public void setSumaKatowWew(double sumaKatowWew) {
        this.sumaKatowWew = sumaKatowWew;
    }

    public Wielokat() {
    }
}
