package day08_abstraction;

public abstract class C07_Toyota extends C06_Araba{

    /*
        Eger abstract bir class'in altinda
        KURAL KOYACAK yeni bir class olusturmak istenirse
        yeni class da abstract yapilabilir

        abstract yapilan yeni class dan
        obje olusturulamayacagi icin
        parent abstract class'daki
        abstract method'lari UYARLAMAK ZORUNDA OLMAZ

        Toyota class'inin temel amaci
        Araba class'inin kurallarinin disina cikmadan
        kurallari Toyota Araclar icin duzenlemek
        veya yeni kurallar koymak olabilir
     */

    public void motor(){
        System.out.println("Tum toyota araclar vvt motor kullanir");
    }

    // Tum toyota araclarin bulundurmasi zorunlu olan method'lar

    public abstract void guvenlik();

    public abstract void jant();


    // Toyota araclar icin opsiyonel ozellikler de eklenebilir

    public void renkliCam(){
        System.out.println("Toyota araclarda renkli cam secenegi bulunur");
    }
}
