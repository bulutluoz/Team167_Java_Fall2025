package day02_ifStatements;

import java.util.Scanner;

public class C08_Bayrak_FlagYontemi {
    public static void main(String[] args) {
        // Kullanicidan iki tamsayi isteyin

        // girilen sayilara gore asagidaki degerlendirmeleri yazdirin
        // 1- sayi1 < sayi2 ise "birinci sayi daha kucuk"
        // 2- sayi1 pozitif ise "birinci sayi sifirdan buyuk"
        // 3- sayi2 50'den buyuk ise "ikinci sayi 50'den buyuk"
        // 4- sayi2 5 ile bolunebiliyorsa "ikinci sayi 5'in tam kati"

        // 5- EGER konsolda yukardakilerden hicbiri yazdirilmazsa
        //    "Nasil sayi sectiniz , hicbir sarti saglamiyor" yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 2 tamsayi giriniz...");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();
        int bayrak = 20; // herhangi bir sayi veya baska variable turu olabilir

        // 1- sayi1 < sayi2 ise "birinci sayi daha kucuk" yazdirin
        if (sayi1 < sayi2){
            System.out.println("birinci sayi daha kucuk");
            bayrak = 12;
        }

        // 2- sayi1 pozitif ise "birinci sayi sifirdan buyuk" yazdirin
        if (sayi1>0){
            System.out.println("birinci sayi sifirdan buyuk");
            bayrak = 12;
        }

        // 3- sayi2 50'den buyuk ise "ikinci sayi 50'den buyuk" yazdirin
        if (sayi2 > 50){
            System.out.println("ikinci sayi 50'den buyuk");
            bayrak = 12;
        }

        // 4- sayi2 5 ile bolunebiliyorsa "ikinci sayi 5'in tam kati" yazdirin

        if (sayi2 % 5 == 0){
            System.out.println("ikinci sayi 5'in tam kati");
            bayrak = 12;
        }

        // 5- EGER konsolda yukardakilerden hicbiri yazdirilmazsa
        //    "Nasil sayi sectiniz , hicbir sarti saglamiyor" yazdirin

        // basta bayraga 20 degerini atadik
        // if body'leri calistiginda bayraga 12 degerini atadilar
        // sona geldigimizde bayrak 20 veya 12 olabilir
        // 20 olmasi hicbir if body'sinin calismadigi anlamina gelir,
        //           cunku calisan if body'si olsaydi bayrag'a 12 degeri atardi
        // bayrak 12 ise calisan if body'si sayisini bilemeyiz ama calisan olmus sonucunu cikaririz

        if (bayrak == 20){
            System.out.println("Nasil sayi sectiniz , hicbir sarti saglamiyor");
        }
    }
}
