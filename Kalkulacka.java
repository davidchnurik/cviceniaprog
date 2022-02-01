public class Kalkulacka {
    public int a;
    public int b;
    public int scitaj() {
        int vysledok = a + b;
        return vysledok;}
    public int odcitaj() {
        int vysledok = a - b;                           //int namiesto void
        return vysledok;}
    public int vanasob() {
        return a * b;}
    public double vydel() {
        if (b == 0){
            System.out.println("delenie nulou");
            return 0;
        }
        return (double) a / (double) b;
    }
}
