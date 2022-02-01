import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Kalkulacka kalkulacka = new Kalkulacka();
        Scanner sc = new Scanner(System.in);
        System.out.println("zadaj a");
        kalkulacka.a  = sc.nextInt();
        System.out.println("zadaj a");
        kalkulacka.b  = sc.nextInt();
        kalkulacka.vydel();
        System.out.println("vydel vysledok: "+ kalkulacka.vydel());
    }
}
