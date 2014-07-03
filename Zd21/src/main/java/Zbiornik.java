public class Zbiornik {

    private static int iloscZbiornikow = 0;

    private int numer;

    private double pojemnosc;

    private double stan;

    public Zbiornik(double pojemnosc) {

        numer = ++iloscZbiornikow;
        this.pojemnosc = pojemnosc;
        stan = 0;
    }

    public void dolej(double woda) {

        if ((stan += woda) > pojemnosc)
            stan = pojemnosc;
    }

    public void odlej(double woda) {
        if ((stan -= woda) < 0)
        stan = 0;
    }

    public String toString() {
        return ("Zbiornik " + numer + ", pojemność " + pojemnosc + ", stan wody " + stan);
    }
}
