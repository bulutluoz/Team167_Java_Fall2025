package day05_arrays;

import java.util.Arrays;

public class C04_ArrayinElemanlariIleIslemYapma {

    public static void main(String[] args) {

        int[] sayilar = {3,6,8,1,3,5,6,9,1,0};

        // sayilar array'ini yazdirin
        System.out.println(Arrays.toString(sayilar)); // [3, 6, 8, 1, 3, 5, 6, 9, 1, 0]

        // array'in 3.index'indeki elemani yazdirin
        System.out.println(sayilar[3]); // 1

        // array'in 5.index'indeki sayiyi 0 yapin
        sayilar[5] = 0;
        System.out.println(Arrays.toString(sayilar)); // [3, 6, 8, 1, 3, 0, 6, 9, 1, 0]

        /*
            tum elemanlari gozden gecirmek icin
            her bir elemani tek tek ele alalim
            sayilar[0]
            sayilar[1]
            sayilar[2]
            .
            .
            .
            .
            sayilar[9] // dinamik yapmak icin sayilar[sayilar.length-1]

            bunu tek tek yapmak yerine
            bir for loop kullanabiliriz
         */
        // sayilar arrayindeki tum elemanlari aralarinda bir bosluk birakarak yan yana yazdirin
        for (int i = 0; i < sayilar.length-1 ; i++) {
            System.out.print(sayilar[i] + " ");
        }
        // 3 6 8 1 3 0 6 9 1
        System.out.println("");

        // sayilar array'indeki tek sayilari yazdirin
        // 3, 1, 3, 9, 1

        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] % 2 != 0) System.out.print(sayilar[i] +" ");
        }
        System.out.println("");

        // sayilar array'indeki 2'den buyuk 8'den kucuk sayilari yazdirin
        // [3, 6, 8, 1, 3, 0, 6, 9, 1, 0]
        // 3 6 3 6
        for (int i = 0; i < sayilar.length ; i++) {

            if (sayilar[i] >2 && sayilar[i]<8) System.out.print(sayilar[i] + " ");
        } // 3 6 3 6

        System.out.println("");


        // sayilar array'indeki tum elemanlarin toplamini yazdirin
        // 37
        int toplam = 0;

        for (int i = 0; i < sayilar.length ; i++) {

            toplam += sayilar[i];
        }

        System.out.println(toplam); // 37

    }
}
