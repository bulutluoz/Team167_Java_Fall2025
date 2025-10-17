package day05_arrays;

public class C01_ArrayOlusturma {

    public static void main(String[] args) {

        int[] arr = {2,5,8,9};
        String[] isimler = {"Bekir","Fatih","Kadriye"};

        // arr ve isimler'in data turu ARRAY'dir
        // basina yazilan int veya String Array'in degil,
        // icine konulacak elementlerin data turudur.

        // int[] sayilar = {3,5, true};
        // array'in basina hangi data turu yazildiysa
        // array'in icine eleman olarak SADECE o data turunden elemanlar eklenebilir

        // Array'deki herhangi bir elemana ulasmak icin
        // array'in adini ve [] icinde elemanin index'ini yazmamiz gerekir

        System.out.println(  isimler[1]   ); // Fatih
        System.out.println( arr[3]); // 9

        // Kadriye'nin yerine Nesrin atamasi yapin

        // isimler = "Nesrin";

        isimler[2] = "Nesrin";







    }
}
