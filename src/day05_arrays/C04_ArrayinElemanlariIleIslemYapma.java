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

        // sayilar array'indeki tek sayilari yazdirin
        // 3, 1, 3, 5, 9, 1

        // sayilar array'indeki tum elemanlarin toplamini yazdirin
        // 37

    }
}
