package day07_accessModifier_encapsulation;

import day07_accessModifier_encapsulation.package1.DataClassi;

public class C02_AccessModifierIleErisim {

    public static void main(String[] args) {

        // System.out.println(DataClassi.sayiPrivateS);
        // DataClassi.sayiPrivateS = 45;
        // private variable'i ne goruntuleyebiliyoruz, ne de deger atayabiliyoruz
        // private'a sadece kendi class'indan ulasilabilir.

        // DataClassi.strDefaultAccModS = "Can";
        // System.out.println(DataClassi.strDefaultAccModS);
        // default access modifier'ina sahip olanlari ne goruntuleyebiliyoruz, ne de deger atayabiliyoruz
        // kendi class'i ve kendi package'i ulasabilir

        // System.out.println(DataClassi.chrProtectedS);
        // DataClassi.chrProtectedS = 'l';
        // protected access modifier'ina sahip olanlari ne goruntuleyebiliyoruz, ne de deger atayabiliyoruz
        // kendi class'i, kendi package'i ve child class'lar ulasabilir

        DataClassi.dblPublicS = 3.4 ;
        System.out.println(DataClassi.dblPublicS);
        // public access modifier'ina sahip olanlari hem goruntuleyebiliyoruz, hem de deger atayabiliyoruz
        // public access modifier'in hic bir kisitlamasi yoktur
        // her yerden goruntuleyebilir veya deger atamasi yapabilirsiniz.


        /*
            Gorevde
            satis tutari girilmesinde
                - deger atamasi yapilabilsin
                - baskalarinin girdigi degerler gorulemesin

            toplam satis tutari
                - toplam rakami herkes gorebilsin
                - toplam rakami rapor ciktiktan sonra KIMSE DEGISTIREMESIN
         */


    }

    public static void method1(){
        DataClassi.dblPublicS = 3.4 ;
        System.out.println(DataClassi.dblPublicS);

    }
}
