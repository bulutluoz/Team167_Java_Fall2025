package day06_staticKeyword;

public class C01_Scope_LocalVariables {

    public static void main(String[] args) {
        String isim = "Ali";
        // static int a = 3;
        // Modifier 'static' not allowed here
        // local alanda static keyword kullanilamaz

        for (int i = 0; i <10 ; i++) {
            int sayi = i *5;
            System.out.println("Merhaba " + sayi);

        }

        // sayi = 20;
        // sayi variable'inin scope'i icinde olusturuldugu for loop'un sinirlaridir
        // for loop'un disinda kullanilamaz
    }

    public static void method1(){
        // System.out.println(isim);
        // Local variable'lar SADECE olusturulduklari scope icinden kullanilabilirler
    }
}
