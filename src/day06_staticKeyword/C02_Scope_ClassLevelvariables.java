package day06_staticKeyword;

public class C02_Scope_ClassLevelvariables {

    static String okulismi = "Yildiz Ilkokulu";  // static variable
    String ogrenciIsmi ; // instance variable

    /*
        hem static hem de instance variable'larin scope'u BUTUN CLASS'dir
        Yani class icindeki her yerden KULLANILABILIRLER

        AMMMMAAAA kullanim bicimi static ve instance variable'lar icin farklilik gosterir

        - Bir class uyesi static ise
          Class icindeki heryerden DIREKT olarak klullanilabilir

        - bir class uyesi static degilse
          secim hakki kullanilacagi method'a gecer
          ornegin instance variable olan ogrenciIsmi,
          static method olan main method'da veya method1'de DIREKT KULLANILAMAZ
          ama kendisi de static olmayan method2'de DIREKT KULLANILABILIR

          EGER static olmayan bir class uyesini
          static olan bir method icinde kullanmak isterseniz
          obje olusturup, obje uzerinden instance variable'i kullanabilirsiniz
     */

    public static void main(String[] args) {
        System.out.println(okulismi);
        // System.out.println(ogrenciIsmi);

        C02_Scope_ClassLevelvariables obj = new C02_Scope_ClassLevelvariables();
        obj.ogrenciIsmi = "Mehmet Yilmaz";
    }

    public static void method1(){
        okulismi = "Star ilkokulu";
        // ogrenciIsmi = "Ali Can";

    }

    public void method2(){
        System.out.println(okulismi.toUpperCase());
        System.out.println(ogrenciIsmi);
    }


}
