package day07_accessModifier_encapsulation;

public class C01_AccessModifier {

    // Her class uyesinin mutlaka Access modifier'i olmalidir
    // class uyesi ==> method, constructor, class level variable'lar
    // EGER kod yazan kisi class uyesi icin access modifier YAZMAZSA
    // Java o class uyesini default access modifier olarak siniflandirir

    String isim1 = "Ali";
    public String isim2 = "Veli";
    public static String isim3 = "Leyla";

    C01_AccessModifier(){

    }

    public C01_AccessModifier(int sayi){

    }


    public static void method1(){

    }

    void method2(){

    }
}
