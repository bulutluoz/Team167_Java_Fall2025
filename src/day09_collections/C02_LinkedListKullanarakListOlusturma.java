package day09_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class C02_LinkedListKullanarakListOlusturma {

    public static void main(String[] args) {


        List<String> isimlerListesi = new ArrayList<>();
        List<String> isimlerListesiLinkedList = new LinkedList<>();

        /*
            Bir obje olusturulurken
            ozelliklerini belirlemeye DATA TURU secilen class'dan baslanir.

            Yukardaki 2 objenin constructor'lari farkli olmasina ragmen
            ikisinin data turu de List oldugundan
            iki obje ayni method(ozellikler)'lara sahip olurlar
         */

        isimlerListesi.add("Bekir"); // [Bekir]
        isimlerListesi.add("Nesrin"); // Bekir, Nesrin]
        isimlerListesi.add(1,"Tural"); // [Bekir, Tural, Nesrin]



    }
}
