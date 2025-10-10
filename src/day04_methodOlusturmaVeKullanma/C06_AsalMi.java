package day04_methodOlusturmaVeKullanma;

public class C06_AsalMi {

    public static void main(String[] args) {
        // Verilen pozitif bir tamsayiyi inceleyip,
        // sayinin asal sayi olup olmadigini kontrol eden ve sonucu yazdiran
        // bir method olusturun

        asalMiYazdir(13);
        asalMiYazdir(20);

    }

    public static void asalMiYazdir(int sayi){

        for (int i = 2; i < sayi ; i++) {


            if (sayi % i == 0){
                System.out.println("Asal degil");
                break;
            }

            if (i == sayi-1){

                System.out.println("Sayi asal");
            }

        }


    }

}
