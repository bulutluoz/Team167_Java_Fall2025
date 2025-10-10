package day04_methodOlusturmaVeKullanma;

public class C04_OlusturdugumuzMethodlariKullanma {

    public static void main(String[] args) {
        C03_NotOrtalamasiBulma.yilSonuNotunuYazdir(45,53); // 50.2

        C05_VerilenMetniDegistirme.metniDegistirVeYazdir("Nesrin"); // Nes:)rin

        C06_AsalMi.asalMiYazdir(9877);// Asal degil
        C06_AsalMi.asalMiYazdir(1137);// Asal degil

        C06_AsalMi.asalMiYazdir(13);


        /*

        method'da () icine yazilan variable'lara PARAMETRE
        method Call yapilirken () icine yazilan degerlere
        ARGUMENT (arguman) denir

        Biz method call yaptigimizda
        Java method ismini ve
        argument-parametre uyumlulugunu kontrol eder

        NOT : bir method call yapildiginda
              biz 1 satir yazariz ama Java arka planda
              o method'a gider ve o method'daki tum satirlari calistirir
              o method bittiginde
              yeniden method call yapilan yere doner
         */
    }
}
