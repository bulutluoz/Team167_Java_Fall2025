package day05_arrays;

public class C02_ArrayOlusturmaYontemleri {

    public static void main(String[] args) {
        // bir array 2 sekilde olusturulabilir
        // 1- elemanlari liste olarak direkt atama

        int[] arr = {2,5,8,9};
        String[] isimler = {"Bekir","Fatih","Kadriye"};
        boolean sonuclar[] = {true,true,false};


        // 2- array'i olusturup sonradan eleman atamasi yapma

        double[] notlar = new double[5]; // {0, 0, 0, 0, 0}
        // new keyword ile kullanildiginda [] icindeki sayi index degil array'in length'i olur
        // ornegin new double[5] yazildiginda ; icine 5 tane double element konulabilecek yeni bir array anlamina gelir

        /*
            2.yontem kullanildiginda
            Java'ya elemanlar soylenmedigi icin
            Java default olarak belirledigi degerleri array'e koyar
            sayisal primitive'ler icin 0
            boolean false
            char hiclik
            non-primitive'ler icin null
         */



    }
}
