package day04_methodOlusturmaVeKullanma;

public class C03_NotOrtalamasiBulma {


    public static void main(String[] args) {
            /*
        bir universite yilsonu notunu hesaplarken
        vize notunun %35'ini
        final notunun %65'ini alip topluyor

        verilen vize ve final notlari uzerinden
        yil sonu ortalamasini hesaplayip yazdiran bir method olusturun
        */

        // method'un calismasi icin method call gereklidir
        yilSonuNotunuYazdir(76,54); // 61.7
        yilSonuNotunuYazdir(45,56.4); // 52.41
        yilSonuNotunuYazdir(36,59); // 50.95



    } // main method sonu

    public static void yilSonuNotunuYazdir(double vizeNotu ,double finalNotu){

        double yilSonuNotu = vizeNotu * 35 / 100 + finalNotu * 65 / 100;
        System.out.println("Yil sonu notunuz : " + yilSonuNotu);
    }


}// class sonu
