package day04_methodOlusturmaVeKullanma;

public class C05_VerilenMetniDegistirme {

    public static void main(String[] args) {
        //  verilen bir String'i inceleyip,
        //  String’in uzunlugu cift sayi ise tam ortasina :) ekleyen,
        //  String’in uzunlugu tek sayi ise ortadaki harfi silen ve yerine :( yazdiran
        //  bir method olusturun

        metniDegistirVeYazdir("Alican");
        metniDegistirVeYazdir("Samet");

    }

    public static void metniDegistirVeYazdir(String degisecekMetin) {
        int uzunluk = degisecekMetin.length();


        if (uzunluk % 2 == 0) { // metnin uzunlugu cift
            //  String’in uzunlugu cift sayi ise tam ortasina :) ekleyin,

            System.out.println(

                    degisecekMetin.substring(0, uzunluk / 2) +
                            ":)" +
                            degisecekMetin.substring(uzunluk / 2)

            );

        } else { // metnin uzunlugu tek
            //  String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :( yazdirin.

            System.out.println(

                    degisecekMetin.substring(0, uzunluk / 2) +
                            ":(" +
                            degisecekMetin.substring(uzunluk / 2 + 1)


            );


        }
    }
}
