package day09_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C04_LinkedListKullanarak_Deque {

    public static void main(String[] args) {

        // Deque => double ended queue
        // yani bastan ve sondan islem yapmaya izin veren bir queue'dur
        // bu ozelliginden dolayi pek cok method'un ...first() ve ...last() versiyonlari vardir

        Deque<String> isimler = new LinkedList<>();
        isimler.add("Bekir"); // [Bekir]
        isimler.addLast("Huseyin"); // [Bekir, Huseyin]
        isimler.addFirst("Ilkin"); // [Ilkin, Bekir, Huseyin]


        isimler.removeFirst();
        // ilk elementi remove eder [Bekir, Huseyin]

        isimler.removeFirstOccurrence("Huseyin");
        // deque'in en basindaki ismi degil
        // verilen Huseyin ismini arayip, buldugu sonuclardan en basta olani remove eder
        // [Bekir]


    }
}
