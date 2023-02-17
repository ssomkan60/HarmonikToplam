import java.util.Scanner;
public class DongulerHarmonikSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double n;
        double toplam = 0;
        System.out.print("Sayı Değeri Giriniz:");
        n = input.nextInt();

        for (double i = 1; i <= n; i++) {
            toplam += (1 / i);
        }
        System.out.println(n +"'in Harmonik Toplamı: " + toplam);
    }
}
