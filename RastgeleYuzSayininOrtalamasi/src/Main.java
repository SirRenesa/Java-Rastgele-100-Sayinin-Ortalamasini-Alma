import java.util.Random;

public class Main {

//    Rastgele oluşan 100 elemanlık sayı kümesi program yeniden her çalıştığında değişsin. Sabit elemanlı bir dizi vermeyin!
//    Ortalama almayı sağlayacak kodu bir fonksiyon halinde tasarlayın. İçine diziyi girdi (input) olarak alsın.
//    Ortalama alan fonksiyon ortalamayı ondalıklı sayı olarak döndürsün. (return) etsin.

    public static void main(String[] args) {
       Random random = new Random();
       int Sayilar[] = new  int[100];

        for (int i = 0; i < 100; i++) {
            int sayi = random.nextInt(1000);
            Sayilar[i] = sayi;
        }
        double sonuc = Main.ortalamAl(Sayilar);
        System.out.println(sonuc);
    }

    public static double ortalamAl(int Sayilar[]){

        int toplam = 0;
        for (int sayi : Sayilar) {
             toplam = sayi + toplam;
        }
        int sonuc = toplam / Sayilar.length;

        return sonuc;
    }
}