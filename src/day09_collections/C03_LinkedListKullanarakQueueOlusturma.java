package day09_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C03_LinkedListKullanarakQueueOlusturma {

    public static void main(String[] args) {

        Queue<Integer> sayilarKuyrugu = new LinkedList<>();

        /*
            Her ne kadar constructor olarak LinkedList<>() kullansalar da
            data turu secilen Interface'ler farkli oldugu icin
            asagidaki 2 obje farkli method'lara sahip olabilirler

            List<String> isimlerListesiLinkedList = new LinkedList<>();
            Queue<Integer> sayilarKuyrugu = new LinkedList<>();

            Queue (kuyruk) 'da FIFO gecerlidir
            Java da method'lari uyarlayarak bu kurali zorunlu hale getirmistir

            Ornegin...
            List'de add method'u 2 taneydi
            - direkt yeni elementi sona ekler
            - yeni elementi verilen index'e ekler

            Queue ise kuyrun yapisina uyguin olarak
            SADECE elementi sona eklememize izin verir
         */

        sayilarKuyrugu.add(4); // [4]
        sayilarKuyrugu.add(8); // [4, 8]
        sayilarKuyrugu.add(2); // [4, 8, 2]


        System.out.println(sayilarKuyrugu.element()); // 4
        System.out.println(sayilarKuyrugu); // [4, 8, 2]
        // Retrieves, but does not remove, the head of this queue.
        // Queue'nun basindaki elementi silmeden bize getirir
        // This method differs from peek only in that it throws an exception if this queue is empty.


        sayilarKuyrugu.offer(56);
        // bir kapasite sinirlamasi yoksa verilen elementi sona ekler
        //


        sayilarKuyrugu.peek();
        // Retrieves, but does not remove, the head of this queue.
        // Queue'nun basindaki elementi silmeden bize getirir
        // element()'dan farki
        // Queue bossa element() exception firlatir
        //             peek() ise null dondurur

        sayilarKuyrugu.poll();
        // Retrieves and removes the head of this queue, or returns null if this queue is empty.
        // Queue'nun basindaki elementi siler, ve sildigi elementi bize getirir
        // Remove() da aynisini yapar ama
        // remove() bos Queue icin exception firlatirken
        // poll is null dondurur



    }
}
