package day09_collections;

import java.util.*;

public class C01_LinkedList {

    public static void main(String[] args) {

        /*
            Collections icerisindeki Interface'lerden
            List, Queue ve Deque'den obje olustururken
            ucunun de child class'i olan LinkedList constructor'i kullanilabilir
         */

        LinkedList<String> isimlerLinkedList = new LinkedList<>();

        List<String> isimlerListesi = new ArrayList<>();
        List<String> isimlerListesiLinkedList = new LinkedList<>();


        // Queue<Integer> sayiKuyrugu = new Queue<>();
        // Queue Interface oldugundan direkt olarak obje olusturulamaz,
        // child class'larinin constructor'i kullanilabilir
        Queue<Integer> sayiKuyrugu = new LinkedList<>();
        Queue<Integer> sayiKuyrugu2 = new PriorityQueue<>();


        // Deque<Double> notlarDeque = new Deque<>();
        // Deque Interface oldugundan direkt olarak obje olusturulamaz,
        // child class'larinin constructor'i kullanilabilir
        Deque<Double> notlarDeque = new LinkedList<>();

    }
}
