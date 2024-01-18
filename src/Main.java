import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenler Oluşturuldu
        double ucret, kdv, kdvTutar, toplam;

        //Scanner sınıfı tanımlandı
        Scanner input = new Scanner(System.in);

        //Kullanıcı verileri alındı ve işlendi
        System.out.print("Lütfen Ücreti Giriniz :");
        ucret = input.nextDouble();

        System.out.println("Tutar :" + ucret);

        kdv = (ucret <1000) ? 0.18 : 0.08;
        System.out.println("KDV Oranı :" + kdv);

        kdvTutar = kdv * ucret;
        System.out.println("KDV Tutarı :" + kdvTutar);

        toplam = ucret + kdvTutar;
        System.out.print("Toplam Ücret :" + toplam);
    }
}