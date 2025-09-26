package day02_ifStatements;

import java.util.Scanner;

public class C05_SusluparantezKullanmakSartMi {

    public static void main(String[] args) {


        // Soru 3- Kullanicidan bir sayi alin,
        //         sayi 3 ile bolunuyorsa ”Uc ile bolunebilen sayi”,
        //         5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz...");
        int sayi = scanner.nextInt();


        if (sayi % 3 == 0){
            System.out.println("Uc ile bolunebilen sayi");
            System.out.println("Uc ile bolunebilen sayilar guzeldir");
        }

        if (sayi % 5 == 0){
            System.out.println("Bes ile bolunebilen sayi");
            System.out.println("Bes ile bolunebilen sayilar harikadir");
        }

        /*
            if statement'da {} kullanilmazsa
            JAVA ilk ;'de IF cumlesini bitirir
            ilk ;'den sonraki kodlar IF ile baglantili olmaz
         */

        if (sayi % 3 == 0)
            System.out.println("Parantezsiz Uc ile bolunebilen sayi");
            System.out.println("Parantezsiz Uc ile bolunebilen sayilar guzeldir");


        if (sayi % 5 == 0)
            System.out.println("Parantezsiz Bes ile bolunebilen sayi");
            System.out.println("Parantezsiz Bes ile bolunebilen sayilar harikadir");


        /*
            yukardaki ornekte
            ilk if 36.satirin sonunda biter
            37.satir IF ile baglantili olmaz

         */
    }
}
