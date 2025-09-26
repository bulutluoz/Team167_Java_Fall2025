package day02_ifStatements;

public class C01_BasitIfCumleleri {

    public static void main(String[] args) {

        /*
            basit if cumlesi boolean sartin sonucuna odaklidir
            boolean sart sonucu true ise  ==> if body'sindeki kodlar calisir
                                false ise ==> if body'sindeki kodlar calismaz
         */

        int a = 200;
        int b = 30;

        // eger a b'den buyukse "a b'den buyuk" yazdirin
        if (a>b){ // 200 > 30 ==> true
            System.out.println("a b'den buyuk");
        }


        // eger b cit sayi ise "cift sayilari severim" yazdirin

        if (b % 2 == 0) { //  30 % 2 ==> 0 dir sartin sonucu true olur
            System.out.println("cift sayilari severim");
        }


        // eger a tek sayi ise "tek sayilar guzeldir" yazdirin

        if (a % 2 != 0){ // 200 % 2 != 0   ==> false
            System.out.println("tek sayilar guzeldir");
        }


    }
}
